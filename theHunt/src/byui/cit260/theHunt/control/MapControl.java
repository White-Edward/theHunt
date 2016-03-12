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
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class MapControl {
    public static Map createMap() {
        
        // Create the map
        Map map = new Map(5,5);
              
        // Assign the different questions to locations in the map
        assignQuestionsToLocations(map,TheHunt.getCurrentGame().getQuestions());
        
        // Assign the different items to locations in the map
        assignItemsToLocations(map,TheHunt.getCurrentGame().getItems());
        return map;
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
        Location[][] locations = map.getLocations();
        for (Item item : items) {
            locations[new Random().nextInt(map.getRowCount())][new Random().nextInt(map.getColumnCount())].setItem(item);
        }
    }
}
