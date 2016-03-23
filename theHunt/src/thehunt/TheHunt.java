/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
        
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
        
        private static PrintWriter outFile = null;
        private static BufferedReader inFile = null;
        
        private static PrintWriter logFile = null;
    
    
    public static void main(String[] args) {
        

        try{
            
            //Open charcter stream files for end user input and output
            TheHunt.inFile=
                    new BufferedReader(new InputStreamReader(System.in));
            TheHunt.outFile= new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TheHunt.logFile = new PrintWriter(C:\Users\Document\tem\logfile.txt);
            
            //creat StartProgramViewOrig and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable te) {
                System.out.printf(te.getMessage());
                te.printStackTrace();

        }
        
        finally{
            try {
                if (TheHunt.inFile != null)
                    TheHunt.inFile.close();
                
                if (TheHunt.outFile != null)
                    TheHunt.outFile.close();
                
                if (TheHunt.logFile != null)
                    TheHunt.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
           
        }
    }
       public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheHunt.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheHunt.inFile = inFile;
    } 
}
