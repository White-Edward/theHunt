/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.exceptions.MapControlException;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
import java.awt.Point;
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
            // Pick a random location
            int x = new Random().nextInt(map.getRowCount());
            int y = new Random().nextInt(map.getRowCount());
            // Check to see whether an item already exists in this location.  If it does, pick new random numbers and try again
            while (locations[x][y].hasItem()) {
                x = new Random().nextInt(map.getRowCount());
                y = new Random().nextInt(map.getRowCount());
            }
            locations[new Random().nextInt(map.getRowCount())][new Random().nextInt(map.getColumnCount())].setItem(item);
        }
    }
    
    public static boolean assignPlayerToLocation(Player player, Point coordinates) throws MapControlException {
        Map map = TheHunt.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
                newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Cannot move actor to location"
                                        + " " + coordinates.x + ", " + coordinates.y
                                        + " because that location is outside"
                                        + " the bounds of the map.");
        }
        
        player.setCoordinates(coordinates);
        Location newLocation = map.getLocations()[coordinates.x - 1][coordinates.y - 1];
        player.setLocation(newLocation);
        return false;
    }

    public static void removeItemFromLocation(Location location) {
        location.setItem(null);
        location.setHasItem(false);
    }
}
