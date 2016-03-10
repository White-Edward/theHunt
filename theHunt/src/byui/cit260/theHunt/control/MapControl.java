/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Map;

/**
 *
 * @author Ann
 */
public class MapControl {
    public static Map createMap() {
        
        // Create the map
        Map map = new Map(5,5);
        
        // Create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // Assign the different scenes to locations in the map
        assignScenesToLocations(map,scenes);
        
        return map;
    }
}
