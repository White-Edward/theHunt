/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.Game;
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
    }
            
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setCharacterName("Mr Bob");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        

    }
    
}
