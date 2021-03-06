/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.vaultSquare;
import byui.cit260.theHunt.exceptions.QuestionControlException;
import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
import byui.cit260.theHunt.model.TeaspoonSquare;
import byui.cit260.theHunt.model.TripSquare;
import byui.cit260.theHunt.model.TwoTrainSquare;
import byui.cit260.theHunt.model.WaterSquare;
import byui.cit260.theHunt.view.ErrorView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class QuestionControl {

    public static boolean answerQuestion(Question question, String answer) {
        if (question.getAnswer().toUpperCase().equals(answer)) {
            question.setAnswered(true);
            return true;
        }
        return false;
    }
        
    public static double calculateTwoTrains(double milesTravelledTrainOne, double milesTravelledTrainTwo, double milesPerHourTrainOne, double milesPerHourTrainTwo) throws QuestionControlException {
        if (milesTravelledTrainOne < 1 || milesTravelledTrainOne > 200) {
            throw new QuestionControlException ("Miles traveled has to be between 1 and 200"); 
        }
        if (milesTravelledTrainTwo < 1 || milesTravelledTrainTwo > 200) {
            throw new QuestionControlException ("Miles traveled has to be between 1 and 200"); 
        }
        if (milesPerHourTrainOne < 1 || milesPerHourTrainOne > 120) {
            throw new QuestionControlException ("Miles per hour must be between 1 and 120"); 
        }
        if (milesPerHourTrainTwo < 1 || milesPerHourTrainTwo > 120) {
            throw new QuestionControlException ("Miles per hour must be between 1 and 120");
        }
        double hoursTrainOne = milesTravelledTrainOne / milesPerHourTrainOne;
        double hoursTrainTwo = milesTravelledTrainTwo / milesPerHourTrainTwo;
        double hours = hoursTrainOne + hoursTrainTwo;
        return hours;
    }
    
    public static double calculateCostOfTrip(double milesTravelled, double gasPrice, double fuelEfficiency) throws QuestionControlException {
        if (milesTravelled < 1) {
            throw new QuestionControlException ("Miles traveled must be greater than 1");
        }
        if (gasPrice < 0.01) {
            throw new QuestionControlException ("Gas price must be greater than 0.01");
        }
        if (fuelEfficiency < 1) {
            throw new QuestionControlException ("Fuel efficiency must be greater than 1");
        }
        double totalGallons = milesTravelled / fuelEfficiency;
        double tripCost = totalGallons * gasPrice;
        return tripCost;
    }

    public static double calculateTeaspoon(double containerDivisor) {
        
        double teaspoonAns = 3 * 16 * (16 / containerDivisor);
        double teaspoonAnswer = (Math.round(teaspoonAns * 100) / 100);

        return teaspoonAnswer;
    }
  
    public static double calculateWater(double numOfGallons, double gallonsPerMinute, double numOfFills) throws QuestionControlException {
        if (numOfGallons < 1) {
            throw new QuestionControlException ("Number of gallons must be greater than 1");
        }
        if (gallonsPerMinute <1) {
            throw new QuestionControlException ("Gallons per minute must be greater than 1");
        }
        if (numOfFills <1){
            throw new QuestionControlException ("Number of times tub is filled must be greater than 1");
        }
        double timeToFillTub = (numOfGallons / gallonsPerMinute) * numOfFills;
        return timeToFillTub;
    }
    
    public static String calculateVault() {
        // Need to get the number of questions on the map and 
        // generate a combination of the length of the number of questions
        String combo = "";
        int comboCounter = 1;
        Location[][] locations = TheHunt.getCurrentGame().getMap().getLocations();
        for (Location[] x : locations) {
            for (Location location : x) {
                Question question = location.getQuestion();
                switch (question.getQuestionType()) {
                    case water:
                    case train:
                    case trip:
                    case teaspoon:
                    case riddle:
                        int comboDigit = new Random().nextInt(9);
                        combo += String.valueOf(comboDigit);
                        location.setClue("Vault Combo Digit " + comboCounter + ": " + comboDigit);
                        location.setHasClue(true);
                        break;
                }
                comboCounter++;
            }
        }
        // Split up combo and assign to questions on the map
        return combo;
    }
    
    public static ArrayList<Question> createQuestions() {
        ArrayList<Question> questions = new ArrayList();
        DecimalFormat df2 = new DecimalFormat("###.##");
        
        //Question[] questions = new Question[QuestionType.values().length + Constants.RIDDLES.length];
        
        Question empty = new Question();
        empty.setQuestionType(QuestionType.empty);
        empty.setRiddle("No riddle here, keep searching");
        questions.add(empty);
        
        for (int i = 0; i < Constants.RIDDLES.length; i++) {
            Question riddle = new Question();
            riddle.setQuestionType(QuestionType.riddle);
            riddle.setRiddle(Constants.RIDDLES[i].getRiddle());
            riddle.setAnswer(Constants.RIDDLES[i].getAnswer());
            questions.add(riddle);
        }
        
        Question water = new Question();
        water.setQuestionType(QuestionType.water);
        WaterSquare waterSquare = new WaterSquare();
        water.setRiddle(waterSquare.getQuestion());
        try {
            double answer = calculateWater(waterSquare.getNumOfGallons(),
                                           waterSquare.getGallonsPerMinute(),
                                           waterSquare.getNumOfFills());
            water.setAnswer(df2.format(answer));
        } catch (QuestionControlException e) {
            ErrorView.display("QuestionControl", e.getMessage());
        }
        water.setHasWaterSquare(true);
        questions.add(water);
        
        Question train = new Question();
        train.setQuestionType(QuestionType.train);
        TwoTrainSquare trainSquare = new TwoTrainSquare();
        train.setRiddle(trainSquare.getQuestion());
        try {
            double answer = calculateTwoTrains(trainSquare.getTrainOneDistance(),
                                        trainSquare.getTrainTwoDistance(),
                                        trainSquare.getTrainOneSpeed(),
                                        trainSquare.getTrainTwoSpeed());
            train.setAnswer(df2.format(answer));
        } catch (QuestionControlException e) {
            ErrorView.display("QuestionControl", e.getMessage());
        }
        questions.add(train);

        Question teaspoon = new Question();
        teaspoon.setQuestionType(QuestionType.teaspoon);
        TeaspoonSquare teaspoonSquare = new TeaspoonSquare();
        teaspoon.setRiddle(teaspoonSquare.getQuestion());
        teaspoon.setAnswer(df2.format(teaspoonSquare.getAnswer()));
                
        teaspoon.setHasTeaspoonSquare(true);
        questions.add(teaspoon);
        
        Question trip = new Question();
        trip.setQuestionType(QuestionType.trip);
        TripSquare tripSquare = new TripSquare();
        trip.setRiddle(tripSquare.getQuestion());
        try {
            double answer = calculateCostOfTrip(tripSquare.getMilesTravelled(), 
                                                tripSquare.getGasPrice(),
                                                tripSquare.getFuelEfficiency());
            trip.setAnswer(df2.format(answer));
        } catch (QuestionControlException e) {
            ErrorView.display("QuestionControl", e.getMessage());
        }
        questions.add(trip);
                
        Question vault = new Question();
        vault.setQuestionType(QuestionType.vault);
        vaultSquare vaultSquare = new vaultSquare();
        vault.setRiddle(vaultSquare.getQuestion());
        // vault.setAnswer(calculateVault());
        // vaultSquare.setCombo(calculateVault());
        vault.setHasVaultSquare(true);
        questions.add(vault);

        return questions;
    }
    
    public static int countAnweredQuestions() {
        Location[][] locations = TheHunt.getCurrentGame().getMap().getLocations();
        int total = 0;
        for (Location[] x : locations) {
            for (Location location : x) {
                Question question = location.getQuestion();
                if (question.isAnswered() && question.getQuestionType() != QuestionType.empty ) {
                    total++;
                }
            }
        }
        return total;
    }
    
    public static int countUnansweredQuestions() {
        Location[][] locations = TheHunt.getCurrentGame().getMap().getLocations();
        int total = 0;
        for (Location[] x : locations) {
            for (Location location : x) {
                Question question = location.getQuestion();
                if (!question.isAnswered() && question.getQuestionType() != QuestionType.empty ) {
                    total++;
                }
            }
        }
        return total;
    }

    public static void assignVaultQuestion(ArrayList<Question> questions, Location[][] locations) {
        
        for (Question question : questions) {
            if (question.getQuestionType().equals(QuestionType.vault)) {
                // Found the vault question not assigned to a location, assign it to one randomly.
                locations[new Random().nextInt(4)][new Random().nextInt(4)].setQuestion(question);
                questions.remove(question);
                // Set the answer
                question.setAnswer(calculateVault());
                return;
            }
        }
        // Vault is on a location, find it and set the answer on it
        for (Location[] x : locations) {
            for (Location location : x) {
                Question question = location.getQuestion();
                if (question.getQuestionType().equals(QuestionType.vault)) {
                    // Found the vault question, set its answer
                    question.setAnswer(calculateVault());
                }
            }
        }
    }
}
  
