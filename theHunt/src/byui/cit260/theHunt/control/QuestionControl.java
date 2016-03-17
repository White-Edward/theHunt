/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.exceptions.QuestionControlException;
import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
import java.util.ArrayList;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class QuestionControl {
        
    public double calculateTwoTrains(double milesTravelledTrainOne, double milesTravelledTrainTwo, double milesPerHourTrainOne, double milesPerHourTrainTwo) throws QuestionControlException {
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
    
    public double calculateCostOfTrip(double milesTravelled, double gasPrice, double fuelEfficiency) throws QuestionControlException {
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

    public boolean calculateTeaspoon(double containerDivisor, double userAnswer) {
        
        double teaspoonAns = 3 * 16 * (16 / containerDivisor);
        double teaspoonAnswer = (Math.round(teaspoonAns * 100) / 100);

        if (userAnswer != teaspoonAnswer) {
           boolean test = false;}
     boolean test = true;
    return test;
    }
  
    public double calculateWater(double numOfGallons, double gallonsPerMinute, double numOfFills) throws QuestionControlException {
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
    
    public static ArrayList<Question> createQuestions() {
        ArrayList<Question> questions = new ArrayList();
        
        //Question[] questions = new Question[QuestionType.values().length + Constants.RIDDLES.length];
        
        Question empty = new Question();
        empty.setQuestionType(QuestionType.empty);
        empty.setRiddle("No riddle here, keep searching");
        questions.add(empty);
        
        for (int i = 0; i < Constants.RIDDLES[0].length; i++) {
            Question riddle = new Question();
            riddle.setQuestionType(QuestionType.riddle);
            riddle.setRiddle(Constants.RIDDLES[0][i]);
            riddle.setAnswer(Constants.RIDDLES[1][i]);
            questions.add(riddle);
        }
        
        Question water = new Question();
        water.setQuestionType(QuestionType.water);
        water.setHasWaterSquare(true);
        questions.add(water);
        
        Question train = new Question();
        train.setQuestionType(QuestionType.train);
        train.setRiddle("train");
        train.setHasTwoTrainSquare(true);
        questions.add(train);

        Question teaspoon = new Question();
        teaspoon.setQuestionType(QuestionType.teaspoon);
        teaspoon.setRiddle("teaspoon");
        teaspoon.setHasTeaspoonSquare(true);
        questions.add(teaspoon);
        
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

}
  
