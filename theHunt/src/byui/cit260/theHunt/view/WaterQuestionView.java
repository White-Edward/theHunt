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
 * @author Edward
 */
public class WaterQuestionView {
    
    private final String question;
    private final double numOfGallons;
    private final double gallonsPerMinute;
    private final double numOfFills;
    private final String promptMessage = "Answer (B - Back): ";
    protected final BufferedReader keyboard = TheHunt.getInFile();
    protected final PrintWriter console = TheHunt.getOutFile();

    public WaterQuestionView() {
        DecimalFormat df = new DecimalFormat("###");
        this.numOfGallons = Double.valueOf(df.format(Math.random() * 99 +1));
        this.gallonsPerMinute = Double.valueOf(df.format(Math.random() * 99 +1));
        this.numOfFills = Double.valueOf(df.format(Math.random() * 99 +1)); 
        this.question = "\n"
                + "\n You need to fill a tub with" + this.numOfGallons + "of water."
                + "\n The tub fills at a rate of " + this.gallonsPerMinute + "gallons per minute."
                + "\n You need to fill the tub" + this.numOfFills + "times."
                + "\n How many mintues will it take to fill the tub?";
    }

    public void displayQuestion() {
        boolean done = false; //set flag to not done
        boolean correct = false; //
        while (!done && !correct) {
            System.out.println(this.question); //display the main menu
            
            String input = this.getInput();// get the user's selection
            if (input.toUpperCase().charAt(0) == 'B'){
                done = true;
            }
            else {
                try{
                    correct = this.doAction(Double.parseDouble(input)); // do action based on selection
                }
                catch (NumberFormatException e) {
                    System.out.println("\nInvalid value, you must enter a number");
                    continue;
                }
                if (correct) {
                    System.out.println("Correct!"); // TO DO: if correct, display clue and store in the clue bag
                }
                
                else{
                    System.out.println("Sorry, that is incorrect, try again!");
                }
                
                }
            }               
        }

    private String getInput() {
        String value = ""; // value to be returned
        boolean valid = false; //inialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.print("\n" + this.promptMessage);
            
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
            }
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank" );
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(Double playerAnswer) {
        QuestionControl Water = new QuestionControl();
        DecimalFormat df2 = new DecimalFormat("###.##");
        double answer = 0;
        try {
            answer = Water.calculateWater(this.numOfGallons, this.gallonsPerMinute, this.numOfFills);            
        } catch (QuestionControlException e) {
            System.out.println(e.getMessage());
        }
        answer = Double.parseDouble(df2.format(answer)); // Format the double to two decimal places
        return playerAnswer == answer;
    }
}


   
    

