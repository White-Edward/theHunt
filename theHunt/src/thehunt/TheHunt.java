/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.Clue;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;

/**
 *
 * @author Ann Lloyd
 */
public class TheHunt {

    /**
     * @param args the command line arguments
     */
    void RyanTestModules() {
    Game newGame = new Game();
    
    newGame.setName("Jim");
    newGame.setWelcomeMessage("Hi Jim, welcome to The Hunt!");
    
    String gameInfo = newGame.toString();
    System.out.println(gameInfo);
    
    Location newLocation = new Location();
    
    newLocation.setHasQuestion(true);
    newLocation.setHasAttribute(false);
    
    String locationInfo = newLocation.toString();
    System.out.println(locationInfo);
    
    Map currentMap = new Map();
    
    currentMap.setRowCount(5);
    currentMap.setColumnCount(5);
    currentMap.setLocationTileLayout(2);
    
    String mapInfo = currentMap.toString();
    System.out.println(mapInfo);
    
    Clue clueOne = new Clue();
    
    clueOne.setClue("Here is your Clue.");
    clueOne.setViewed(true);
    
    String clueInfo = clueOne.toString ();
    System.out.println(clueInfo);
    
    }
            
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setCharacterName("Mr Bob");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
  
        

    }
    
}
