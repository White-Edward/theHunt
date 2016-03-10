/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setCharacterName(name);
        
        TheHunt.setPlayer(player); // save the player
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        // System.out.println("\n*** createNewGame stub function called ***");
        Game game = new Game();  // Create new game
        TheHunt.setCurrentGame(game); // Save in TheHunt
        
        game.setPlayer(player); // save player in game

        Item[] items = GameControl.createItems();
        game.setItems(items);
        
        Map map = MapControl.createMap(); // Create and initialize new map
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static Item[] createItems() {
        System.out.println("*** called createItems() in GameControl ***\n");
        return null;
    }
}
