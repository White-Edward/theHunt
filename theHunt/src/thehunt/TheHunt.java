/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.view.StartProgramView;
        
/**
 *
 * @author Ann Lloyd
 */
public class TheHunt {


        public static Game getCurrentGame() {
            return currentGame;
        }

        public static void setCurrentGame(Game currentGame) {
            TheHunt.currentGame = currentGame;
        }

        public static Player getPlayer() {
            return player;
        }

        public static void setPlayer(Player player) {
            TheHunt.player = player;
        }
        private static Game currentGame = null;
        private static Player player = null;
    
    
    public static void main(String[] args) {
        
        //creat StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try{
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
                System.out.printf(te.getMessage());
                te.printStackTrace();
                startProgramView.displayStartProgramView();
        }
    }
    
}
