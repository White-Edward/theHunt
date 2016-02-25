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
public class ItemMenuView {
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Item Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n C - Clue bag"
            +"\n T - TNT"
            +"\n P - Old cell phone"
            +"\n M - Monkey"
            +"\n A - Aid Bag"
            +"\n B - Back to the main menu"
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

    private boolean doAction(char choice) {
                
        switch (choice) {
            case 'C': // Open Clue Bag Menu
                this.startClueBag();
                break;
            case 'T': // View TNT Menu
                this.startTNT();
                break;
            case 'P': // View Old Cell Phone Menu
                this.startOldCellPhone();
                break;
            case 'M': // View Monkey Menu
                this.startMonkey();
                break;
            case 'A': // View Aid Bag Menu
                this.startAidBag();
                break;
            case 'B': // go back to previous menu
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startClueBag() {
        System.out.println("*** startClueBag function called ***");
    }

    private void startTNT() {
        System.out.println("*** startTNT function called ***");
    }

    private void startOldCellPhone() {
        System.out.println("*** startOldCellPhone function called ***");
    }

    private void startMonkey() {
        System.out.println("*** startMonkey function called ***");
    }

    private void startAidBag() {
        System.out.println("*** startAidBag function called ***");
    }


}
