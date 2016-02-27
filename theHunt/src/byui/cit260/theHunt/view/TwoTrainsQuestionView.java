/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.QuestionControl;
import java.text.DecimalFormat;
import java.util.Scanner;

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

            System.out.println(this.question); // display the main menu

            String input = this.getInput(); // get the user's selection
            if (input.toUpperCase().charAt(0) == 'B') {
                done = true;
            } else {
                try {
                    correct = this.doAction(Double.valueOf(input)); // do action based on selection
                } catch (Exception e) {
                    System.out.println("\nInvalid value, must be a number");
                    continue;
                }
                if (correct) {
                    System.out.println("Correct!");
                    // To Do - if correct, display clue and store in clue bag
                } else {
                    System.out.println("Sorry, that is incorrect, try again!");
                }
            }
        }
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
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(double playerAnswer) {
        QuestionControl twoTrains = new QuestionControl();
        DecimalFormat df2 = new DecimalFormat("###.##");
        double answer = Double.valueOf(df2.format(twoTrains.calculateTwoTrains(this.trainOneDistance,this.trainTwoDistance,this.trainOneSpeed,this.trainTwoSpeed)));
        return playerAnswer == answer;
    }
}
