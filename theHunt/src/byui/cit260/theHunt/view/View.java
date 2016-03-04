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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected String promptMessage = "Select an option: ";
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    public View(String message, String prompt) {
        this.displayMessage = message;
        this.promptMessage = prompt;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            // prompt for and get players name
            String value = this.getInput().toUpperCase();
            if (value.equals("Q")) { //user wants to quit
                return; // exit the view
            }
            
            //do the requsted action and display the next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid) {
            //prompt for the players name
            System.out.print("\n" + this.displayMessage);
            System.out.print("\n\n" + this.promptMessage);
            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }
}
