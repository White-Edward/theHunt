/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;


/**
 *
 * @author Ed
 */
public class GameMenuView {
    
     private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Game Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n M - Show game map"
            +"\n S - Save game progress"
            +"\n H - Help menu"
            +"\n Q - Quit game"
            +"\n R - Return to main menu"
            +"\n G - Return to game"
            +"\n---------------------------------------------------------------";
    private String promptMessage = "Select an option: ";
    
    public void displayMenu() {
        
    char selection = ' ';
    boolean done = false; // set flag to not done
    do {
            
        System.out.println(MENU); // display the main menu
            
        String input = this.getInput().toUpperCase(); // get the user's selection
        selection = input.charAt(0); //get first character of string
        done = this.doAction(selection); // do action based on selection
            
    } while (!done); //  selection is not "Back"
}

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.print("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(char choice) {
                
        switch (choice) {
            case 'M': // Open Game map
                this.startGameMap();
                break;
            case 's': // View Saved games
                this.startSaveGame();
                break;
            case 'H': // View Help Menu
                this.startHelpMenu();
                break;
            case 'Q': // Quit game
                this.startQuitGame();
                break;
            case 'R': // View Main Menu
                this.startMainMenu();
                break;
            case 'G': // Return to game 
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startGameMap() {
        System.out.println("*** startGameMap function called ***");
    }

    private void startSaveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void startHelpMenu() {
                // display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void startQuitGame() {
        System.out.println("*** startQuitGame function called ***");
    }

    private void startMainMenu() {
        // display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
}
