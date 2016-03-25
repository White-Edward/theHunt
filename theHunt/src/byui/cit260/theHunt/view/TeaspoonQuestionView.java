/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.QuestionControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import thehunt.TheHunt;

/**
 *
 * @author Ryan
 */
public class TeaspoonQuestionView {
    
    private final String question;
    private final double containerDivisor;
    private final String promptMessage = "Answer (B - Back): ";
    private double userAnswer;
    protected final BufferedReader keyboard = TheHunt.getInFile();
    protected final PrintWriter console = TheHunt.getOutFile();

    public TeaspoonQuestionView() {
        DecimalFormat df = new DecimalFormat("###");
        this.containerDivisor = Double.valueOf(df.format(Math.random() * 9 +1));
        this.question = "\n"
                + "\n There are 3 teaspoons in a tablespoon and 16 tablespoons in a cup."
                + "\n How many tablespoons would it take to fill a 1/" + this.containerDivisor + "gallon"
                + "\n container if there are 16 cups in a gallon. Round to the nearest whole number.";
    }

    public void displayQuestion() {
        boolean done = false; //set flag to not done
        boolean correct = false; //
        while (!done && !correct) {
            this.console.println(this.question); //display the main menu
            
            String input = this.getInput();// get the user's selection
            this.userAnswer = Double.parseDouble(input);
            if (input.toUpperCase().charAt(0) == 'B'){
                done = true;
            }
            else {
                try{
                    correct = this.doAction(input); // do action based on selection
                }
                catch (NumberFormatException e) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid value, you must enter a number");
                    continue;
                }
                if (correct) {
                    this.console.println("Correct!"); // TO DO: if correct, display clue and store in the clue bag
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

    

    private boolean doAction(String input) {
               QuestionControl teaspoon = new QuestionControl();
        boolean playerAnswer = teaspoon.calculateTeaspoon(this.containerDivisor, this.userAnswer);
        return playerAnswer;
    }

   
    }


    
