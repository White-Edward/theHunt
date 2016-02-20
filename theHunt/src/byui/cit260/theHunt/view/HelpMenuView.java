/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Ann
 */
public class HelpMenuView {
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Help Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n M - How to move the character"
            +"\n A - Actions"
            +"\n B - Back to the main menu"
            +"\n---------------------------------------------------------------";
    private String promptMessage = "Select an option: ";
    
    public void displayMenu() {
        
    char selection = ' ';
    do {
            
        System.out.println(MENU); // display the main menu
            
        String input = this.getInput().toUpperCase(); // get the user's selection
        selection = input.charAt(0); //get first character of string
            
        this.doAction(selection); // do action based on selection
            
    } while (selection != 'B'); //  selection is not "Back"
}

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value in entered
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

    private void doAction(char choice) {
        
        switch (choice) {
            case 'M': // create and start a new game
                this.startMoveHelp();
                break;
            case 'A': // get and start existing game
                this.startActionsHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
    }

    private void startMoveHelp() {
        System.out.println("\n================================================="
                            + "\n W - Moves the user forward one space"
                            + "\n D - Turns the user clockwise 90 degrees"
                            + "\n A - Turns the user counter-clockwise 90 degrees"
                            + "\n S - Moves the user backward one space"
                            + "\n================================================"
                          );
    }

    private void startActionsHelp() {
        System.out.println("\n================================================================================"
                          + "\n Search Location - Searches the location you are in for clues and items"
                          + "\n Answer Riddle - Allows you to attempt to answer a question to receive a clue"
                          + "\n Pickup Item - Moves an item from the location you are in to your item bag"
                          + "\n Drop Item - Moves an item from your item bag to the location you are in"
                          + "\n================================================================================"
                          );
    }

}
