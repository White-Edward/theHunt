/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.model.Player;
import java.io.IOException;
import thehunt.TheHunt;

/**
 *
 * @author Edward
 */
public class StartProgramView extends View {
        
    public StartProgramView(){ 
        // promptMessage = "Please enter your name"
        //dislply the banner when view is created
        
       this.promptMessage = "\nPlease enter your name: ";
       // display the banner when view is created
       this.displayBanner();
    }
    


    private void displayBanner() {
        this.console.println("\n"
+ "\n _____ _  _ ___   _  _ _  _ __  _ _____  "
+ "\n|_   _| || | __| | || | || |  \\| |_   _| "
+ "\n  | | | >< | _|  | >< | \\/ | | ' | | |   "
+ "\n  |_| |_||_|___| |_||_|\\__/|_|\\__| |_|   "
                            );
        this.console.println("\n\n**************************************************************");
        
        this.console.println("*                                                            *"
                + "\n* The Hunt is a text-based role playing game where you will  *"
                + "\n* explore a virtual world full of riddles and treasure.      *"
                + "\n* You will interact with the world through a series of       *"
                + "\n* of command prompt directions, and will enjoy an intriguing *"
                + "\n* story and adventure every step of the way. Continue your   *"
                + "\n* adventure to the end and you will uncover treasure         *"
                + "\n* that has been hidden away on the mysterious island.        *");
        
        this.console.println("*                                                            *"
                + "\n* Many paths exist on the island, but only one leads         *"
                + "\n* the hidden treasure. You will encounter perils along the   *"
                + "\n* path, and a wrong step will lead to an untimely demise.    *");
       
        this.console.println("*                                                            *"
                + "\n* Good luck and enjoy your adventure.                        *"
                + "\n*                                                            *"
                + "\n**************************************************************"
                );
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // promp for and get player name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wanted to quit
                return;  // exit the game
                   
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
    }

    private String getPlayersName() {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value in entered
            this.console.print("\n" + this.promptMessage);
            this.console.flush();
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
            
            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() <2) {
            ErrorView.display(this.getClass().getName(), "\nInvalid Players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        TheHunt.setPlayer(player);
        
        if (player == null) {// if unsuccessful
            ErrorView.display(this.getClass().getName(), "\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true; // success !
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        this.console.println("\n================================================="
                          + "\n Welcome to the game " + player.getCharacterName()
                          + "\n We hope you have a lot of fun!"
                          + "\n================================================"
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
    
}
