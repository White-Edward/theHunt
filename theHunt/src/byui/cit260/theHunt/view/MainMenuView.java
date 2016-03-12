/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import java.util.Scanner;
import thehunt.TheHunt;

/**
 *
 * @author Edward
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Main Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n N - New Game"
            +"\n L - Load Saved Game"
            +"\n S - Save Game"
            +"\n H - Help"
            +"\n Q - Quit Game"
            +"\n A - About Us"
            +"\n---------------------------------------------------------------";
    private String promptMessage = "Select an option: ";
    
    public void displayMenu() {
        
    char selection = ' ';
    do {
            
        System.out.println(MENU); // display the main menu
            
        String input = this.getInput().toUpperCase(); // get the user's selection
        selection = input.charAt(0); //get first character of string
            
        this.doAction(selection); // do action based on selection
            
    } while (selection != 'Q'); // an selection is not "Quit"
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'L': // get and start existing game
                this.startExistingGame();
                break;
            case 'S': // save a game in progress
                this.startSaveGame();
                break;
            case 'H': // load help menu
                this.startHelpMenu();
                break;
            case 'Q': // quit game
                this.startQuitGame();
                break;
            case 'A': // load about us 
                this.startAboutUs();
                break;
            case 'I': // load Item Menu (temporary, hidden)
                this.startItemMenu();
                break;
            case 'T': // load TwoTrains Question (temporary, hidden)
                this.startTwoTrainsQuestionView();
                break;
            case 'W': // load Water questoin
                this.startWaterQuestionView();
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(TheHunt.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void startSaveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void startHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void startQuitGame() {
        System.out.println("*** startQuitGame function called ***");
    }

    private void startAboutUs() {
        AboutUsView AboutUs = new AboutUsView();
        AboutUs.displayMenu();
    }
    
    /**
     * Temporary function to test item menu
     */
    private void startItemMenu() {
        ItemMenuView itemMenu = new ItemMenuView();
        itemMenu.displayMenu();
    }
    
    /**
     * Temporary function to test two trains question
     */
    private void startTwoTrainsQuestionView() {
        TwoTrainsQuestionView question = new TwoTrainsQuestionView();
        question.displayQuestion();
    }
    
    /**
     * Temporary function to test two trains question
     */
    private void startWaterQuestionView() {
        WaterQuestionView water = new WaterQuestionView();
        water.displayQuestion();
    }
}
