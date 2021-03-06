/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected String promptMessage = "Select an option: ";
    
    protected final BufferedReader keyboard = TheHunt.getInFile();
    protected PrintWriter console = TheHunt.getOutFile();
    
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
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) { //user wants to quit
                return; // exit the view
            }
            
            //do the requsted action and display the next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid) {
            //prompt for the players name
            this.console.print("\n" + this.displayMessage);
            this.console.print("\n\n" + this.promptMessage);
            this.console.flush();
            // get the value entered from the keyboard
            try {
                value = this.keyboard.readLine();
                value = value.trim();
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
                System.out.println(e.getMessage());
            }
            
            if (value.length() < 1) { // blank value entered
                ErrorView.display(this.getClass().getName(), "\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }
}
