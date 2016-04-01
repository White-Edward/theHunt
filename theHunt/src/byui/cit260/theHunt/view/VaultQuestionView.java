/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.exceptions.QuestionControlException;
import static byui.cit260.theHunt.model.QuestionType.vault;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import thehunt.TheHunt;

/**
 *
 * @author Ryan
 */
public class VaultQuestionView {
    

    private final String promptMessage = "Answer (B - Back): ";
    protected final BufferedReader keyboard = TheHunt.getInFile();
    protected final PrintWriter console = TheHunt.getOutFile();
    private final String question;
    private double combo;

    public VaultQuestionView() {
        DecimalFormat df = new DecimalFormat("###");
        this.question = "\n"
                + "\n You have reached the treasure vault! All you need is the correct combination."
                + "\n Use your clues to enter in the correct combination and reaceive the treasure!";
    }

    public void displayQuestion() {
        boolean done = false; //set flag to not done
        boolean correct = false; //
        while (!done && !correct) {
            this.console.println(this.question); //display the main menu
            
            String input = this.getInput();// get the user's selection
            this.combo = Double.parseDouble(input);
            if (input.toUpperCase().charAt(0) == 'B'){
                done = true;
            }
            else {
                try{
                    correct = this.doAction(Double.parseDouble(input));
                }
                catch (NumberFormatException e) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid value, you must enter a number");
                    continue;
                }
                if (correct) {
                    this.console.println("\n Correct! You have found the treasure and completed"
                            + "\n The Hunt. You may continue to roam the map or you may quit and start"
                            + "\n a new game."); // TO DO: if correct, display clue and store in the clue bag
                }
                
                else{
                    this.console.println("Sorry, that is incorrect, try again!");
                }
                
                }
            }               
        }

    private String getInput() {
        String value = ""; // value to be returned
        boolean valid = false; //inialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            this.console.print("\n" + this.promptMessage);
            this.console.flush();
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
            
            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank" );
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }

    

        private boolean doAction(double playerAnswer) {
        QuestionControl vault = new QuestionControl();
        DecimalFormat df2 = new DecimalFormat("###.##");
        double answer = 0;
        answer = vault.calculateVault(this.combo);

        return playerAnswer == answer;
    }
        
}


    

    

