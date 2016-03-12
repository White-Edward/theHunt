/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
import java.util.ArrayList;

/**
 *
 * @author Ann
 */
public class QuestionControl {
        
    public double calculateTwoTrains(double milesTravelledTrainOne, double milesTravelledTrainTwo, double milesPerHourTrainOne, double milesPerHourTrainTwo) {
        if (milesTravelledTrainOne < 1 || milesTravelledTrainOne > 200) {
            return -1;
        }
        if (milesTravelledTrainTwo < 1 || milesTravelledTrainTwo > 200) {
            return -1;
        }
        if (milesPerHourTrainOne < 1 || milesPerHourTrainOne > 120) {
            return -2;
        }
        if (milesPerHourTrainTwo < 1 || milesPerHourTrainTwo > 120) {
            return -2;
        }
        double hoursTrainOne = milesTravelledTrainOne / milesPerHourTrainOne;
        double hoursTrainTwo = milesTravelledTrainTwo / milesPerHourTrainTwo;
        double hours = hoursTrainOne + hoursTrainTwo;
        return hours;
    }
    
    public double calculateCostOfTrip(double milesTravelled, double gasPrice, double fuelEfficiency) {
        if (milesTravelled < 1) {
            return -1;
        }
        if (gasPrice < 0.01) {
            return -2;
        }
        if (fuelEfficiency < 1) {
            return -3;
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
  
    public double calculateWater(double numOfGallons, double gallonsPerMinute, double numOfFills) {
        if (numOfGallons <= 0) {
            return -1;
        }
        if (gallonsPerMinute <=0) {
            return -1;
        }
        if (numOfFills <=0){
            return -1;
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
}
  
