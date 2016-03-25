/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.exceptions.QuestionControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class TwoTrainsQuestionView {
    
    private final String question;
    private final double trainOneSpeed;
    private final double trainTwoSpeed;
    private final double trainOneDistance;
    private final double trainTwoDistance;
    private final String promptMessage = "Answer (B - Back): ";
    protected final BufferedReader keyboard = TheHunt.getInFile();
    protected final PrintWriter console = TheHunt.getOutFile();
    
    public TwoTrainsQuestionView() {
        DecimalFormat df = new DecimalFormat("###");
        this.trainOneSpeed = Double.valueOf(df.format(Math.random() * 119  + 1));
        this.trainTwoSpeed = Double.valueOf(df.format(Math.random() * 119  + 1));
        this.trainOneDistance = Double.valueOf(df.format(Math.random() * 200  + 1));
        this.trainTwoDistance = Double.valueOf(df.format(Math.random() * 200  + 1));
        this.question = "\n"
                + "Train one is traveling at " + this.trainOneSpeed + " MPH "
                + "and is " + this.trainOneDistance + " miles from the station.\n"
                + "Train two is traveling at " + this.trainTwoSpeed + " MPH "
                + "and is " + this.trainTwoDistance + " miles from the station.\n"
                + "\nHow many total hours will it take for both trains to reach "
                + "the station?\n";
    }
    
    public void displayQuestion() {
        
        boolean done = false; // set flag to not done
        boolean correct = false;
        while (!done && !correct) {

            this.console.println(this.question); // display the main menu

            String input = this.getInput(); // get the user's selection
            if (input.toUpperCase().charAt(0) == 'B') {
                done = true;
            } else {
                try {
                    correct = this.doAction(Double.parseDouble(input)); // do action based on selection
                } catch (NumberFormatException e) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid value, must be a number");
                    continue;
                }
                if (correct) {
                    this.console.println("Correct!");
                    // To Do - if correct, display clue and store in clue bag
                } else {
                    this.console.println("Sorry, that is incorrect, try again!");
                }
            }
        }
    }

    private String getInput() {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value in entered
            this.console.print("\n" + this.promptMessage);
            
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
            
            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(double playerAnswer) {
        QuestionControl twoTrains = new QuestionControl();
        DecimalFormat df2 = new DecimalFormat("###.##");
        double answer = 0;
        try {     
            answer = twoTrains.calculateTwoTrains(this.trainOneDistance,this.trainTwoDistance,this.trainOneSpeed,this.trainTwoSpeed);
        } catch (QuestionControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        answer = Double.parseDouble(df2.format(answer)); // Format the double to two decimal places
        return playerAnswer == answer;
    }
}
