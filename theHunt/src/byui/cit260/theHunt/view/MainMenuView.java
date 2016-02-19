/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Main Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n N - New Game"
            +"\n L - Load Saved Game"
            +"\n S - Save Game"
            +"\n H - Help"
            +"\n Q - Quit Game"
            +"\n A - About Us"
            +"\n---------------------------------------------------------------";
    private String promptMessage;
    
    public void displayMenu() {
        
    char selection = ' ';
    do {
            
        System.out.println(MENU); // display the main menu
            
        String input = this.getInput(); // get the user's selection
        selection = input.charAt(0); //get first character of string
            
        this.doAction(selection); // do action based on selection
            
    } while (selection != 'Q'); // an selection is not "Quit"
}

    void displayMainMenuView() {
        System.out.println("\n*** displayMenu() funcation called***");
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value in entered
            System.out.println("\n" + this.promptMessage);
            
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

    private void doAction(char choice) {
        
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'L': // get and start existing game
                this.startExistingGame;
            case 'S': // save a game in progress
                this.startSaveGame;
            case 'H': // load help menu
                this.startHelpMenu;
            case 'Q': // quit game
                this.startQuitGame;
            case 'A': // load about us 
                this.startAboutUs;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                    
        }
    }
    
}
