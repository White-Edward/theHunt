/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
import java.util.Random;

/**
 *
 * @author Ann
 */
public class MapControl {
    public static Map createMap() {
        
        // Create the map
        Map map = new Map(5,5);
        
        // Create a list of the different questions in the game
        Question[] questions = createQuestions();
        
        // Assign the different scenes to locations in the map
        assignQuestionsToLocations(map,questions);
        
        return map;
    }
    private static Question[] createQuestions() {
        Question[] questions = new Question[QuestionType.values().length + Constants.RIDDLES.length];
        
        Question empty = new Question();
        empty.setRiddle("No riddle here, keep searching");
        questions[QuestionType.empty.ordinal()] = empty;
        
        // I was trying to generate a bunch of riddle questions, but I'm not sure how this best works with enums defining the index...
//        for (int i = 0; i < Constants.RIDDLES[0].length; i++) {
            Question riddle = new Question();
            int i = 1;
            riddle.setRiddle(Constants.RIDDLES[0][i]);
            riddle.setAnswer(Constants.RIDDLES[1][i]);
            questions[QuestionType.riddle.ordinal()] = riddle;
//        }
        
        Question water = new Question();
        water.setRiddle("water");
        water.setHasWaterSquare(true);
        questions[QuestionType.water.ordinal()] = water;
        
        Question train = new Question();
        train.setRiddle("train");
        train.setHasTwoTrainSquare(true);
        questions[QuestionType.train.ordinal()] = train;

        Question teaspoon = new Question();
        teaspoon.setRiddle("teaspoon");
        teaspoon.setHasTeaspoonSquare(true);
        questions[QuestionType.teaspoon.ordinal()] = teaspoon;
        
        return questions;
    }
    
    private static void assignQuestionsToLocations(Map map, Question[] questions) {
        Location[][] locations = map.getLocations();
        for (Location[] x : locations) {
            for (Location location : x) {
                // Assign a random Question Type to the location
                location.setQuestion(questions[QuestionType.values()[new Random().nextInt(QuestionType.values().length)].ordinal()]);
            }
        }
    }    
    
    public static void assignItemsToLocations(Map map, Item[] items) {
        
    }
}
