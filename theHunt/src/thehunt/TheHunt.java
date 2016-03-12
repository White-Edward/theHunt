/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.AidBag;
import byui.cit260.theHunt.model.Clue;
import byui.cit260.theHunt.model.ClueBag;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Monkey;
import byui.cit260.theHunt.model.OldCellPhone;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.TwoTrainSquare;
import byui.cit260.theHunt.model.TeaspoonSquare;
import byui.cit260.theHunt.model.WaterSquare;
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
        startProgramView.displayStartProgramView();

    }
    
}
