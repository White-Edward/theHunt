/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.view.ErrorView;
import byui.cit260.theHunt.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
        
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
            TheHunt.inFile = new BufferedReader(new InputStreamReader(System.in));
            TheHunt.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String tempDir = System.getProperty("java.io.tmpdir");
            String filePath = tempDir + "\\TheHunt-logfile.txt";
            outFile.print("Logfile is: " + filePath);
            TheHunt.logFile = new PrintWriter(filePath);
            
            //creat StartProgramViewOrig and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
        } catch (Exception e) {
            ErrorView.display("TheHunt", "Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
        } catch (Throwable e) {
                ErrorView.display("TheHunt", e.getMessage());
                e.printStackTrace();
        } 
        finally {
            try {
                if (TheHunt.inFile != null)
                    TheHunt.inFile.close();
                
                if (TheHunt.outFile != null)
                    TheHunt.outFile.close();
                
                if (TheHunt.logFile != null)
                    TheHunt.logFile.close();
            } catch (IOException ex) {
                ErrorView.display("TheHunt", "Error closing files");
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
   
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheHunt.logFile = logFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheHunt.inFile = inFile;
    } 
    
}
