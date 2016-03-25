/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.IOException;

/**
 *
 * @author Ryan
 */
public class AboutUsView extends View{
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| About the Creators Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n A - Ann Lloyd"
            +"\n E - Edward White"
            +"\n R - Ryan Funderburk"
            +"\n B - Back to the main menu"
            +"\n---------------------------------------------------------------";
    private final String promptMessage = "Select an option: ";
    
    public void displayMenu() {
        
    char selection = ' ';
    do {
            
        this.console.println(MENU); // display the main menu
            
        String input = this.getInput().toUpperCase(); // get the user's selection
        selection = input.charAt(0); //get first character of string
            
        this.doAction(selection); // do action based on selection
            
    } while (selection != 'B'); //  selection is not "Back"
}

    @Override
    public String getInput() {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value in entered
            this.console.print("\n" + this.promptMessage);
            this.console.flush();
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
            
            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    
    private void doAction(char choice) {
        
        switch (choice) {
            case 'A': // View Ann's Bio
                this.startAboutAnn();
                break;
            case 'E': // View Edward's Bio
                this.startAboutEdward();
                break;
            case 'R': // View Ryan's Bio
                this.startAboutRyan();
                break;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
    }

    private void startAboutAnn() {
        this.console.println("\n================================================="
                            + "\n Origin of the name Ann:"
                            + "\n The English form of Anna (gracious, full of" 
                            + "\n grace and mercy). In medieval Christian "
                            + "\n tradition, the name assigned to the mother of "
                            + "\n the Virgin Mary, as Joachim was assigned to her"
                            + "\n father."
                            + "\n================================================"
                          );
    }

    private void startAboutEdward() {
        this.console.println("\n================================================="
                            + "\n Origin of the name Edward:"
                            + "\n Derived from the Old English Eadweard (wealthy " 
                            + "\n or fortunate guardian), a compound name"
                            + "\n composed of the elements ēad (prosperity,"
                            + "\n wealth) and weard (guardian, protector). Edward"
                            + "\n is a royal name, having been borne by three"
                            + "\n Anglo-Saxon kings and eight kings of England."
                            + "\n================================================"
                          );
    }
    
    private void startAboutRyan() {
        this.console.println("\n================================================="
                            + "\n Origin of the name Ryan:"
                            + "\n From the Irish surname O'Riain (descendant of" 
                            + "\n Rian).  Rian is an ancient Irish name believed"
                            + "\n to be a diminutive form of rí (king): hence,"
                            + "\n 'little King.'"
                            + "\n "
                            + "\n================================================"
                          );
    }    

    @Override
    public boolean doAction(String value) {
        this.console.println("*** Called function doAction in AboutUsView ***");
        return false;
    }

}
