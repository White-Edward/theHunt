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
import java.util.ArrayList;
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
        ArrayList<Question> questions = createQuestions();
        
        // Assign the different scenes to locations in the map
        assignQuestionsToLocations(map,questions);
        
        return map;
    }
    private static ArrayList<Question> createQuestions() {
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
    
    private static void assignQuestionsToLocations(Map map, ArrayList<Question> questions) {
        Location[][] locations = map.getLocations();
        for (Location[] x : locations) {
            for (Location location : x) {
                // Select an index randomly
                int randomIndex = new Random().nextInt(questions.size());
                // Assign a random Question Type to the location
                location.setQuestion(questions.get(randomIndex));
                // Remove the index if unless it is QuestionType empty (no duplicate questions in the game)
                if (questions.get(randomIndex).getQuestionType() != QuestionType.empty ) {
                    questions.remove(randomIndex);
                }
            }
        }
    }    
    
    public static void assignItemsToLocations(Map map, Item[] items) {
        
    }
}
