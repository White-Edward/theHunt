/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import thehunt.TheHunt;

/**
 *
 * @author Edward
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Main Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n N - New Game"
            +"\n L - Load Saved Game"
            +"\n S - Save Game"
            +"\n H - Help"
            +"\n Q - Quit Game"
            +"\n A - About Us"
            +"\n---------------------------------------------------------------");
    }
   
    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
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
            case 'B': // go back to previous menu
                return true;                
            case 'I': // load Item Menu (temporary, hidden)
                this.startItemMenu();
                break;
            case 'T': // load TwoTrains Question (temporary, hidden)
                this.startTwoTrainsQuestionView();
                break;
            case 'W': // load Water questoin
                this.startWaterQuestionView();
            case 'P': // load Water questoin
                this.startTeaspoonQuestionView();
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame();
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        // Backup display and prompt message
        String displayMessage = this.displayMessage;
        String promptMessage = this.promptMessage;
        
        // Set the display and prompt message for saving the file
        this.displayMessage = "";
        this.promptMessage = "\n\nEnter the file path for the file of the game to load: ";
        
        // prompt for and get the name of the file the game is saved in
        String filePath = this.getInput(); // Get filename from the user
        
        // Set the display and prompt back to original
        this.displayMessage = displayMessage;
        this.promptMessage = promptMessage;
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSaveGame() {
        // Backup display and prompt message
        String displayMessage = this.displayMessage;
        String promptMessage = this.promptMessage;
        
        // Set the display and prompt message for saving the file
        this.displayMessage = "";
        this.promptMessage = "\n\nEnter the file path for the file where the game"
                            + " is to be saved: ";
        
        // prompt for and get the name of the file to save the game in
        String filePath = this.getInput(); // Get filename from the user
        
        // Set the display and prompt back to original
        this.displayMessage = displayMessage;
        this.promptMessage = promptMessage;
        try {
            GameControl.saveGame(TheHunt.getCurrentGame(), filePath);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

    private void startHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void startQuitGame() {
        this.console.println("*** startQuitGame function called ***");
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
        itemMenu.display();
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

    private void startTeaspoonQuestionView() {
        TeaspoonQuestionView yeaspoon = new TeaspoonQuestionView();
        yeaspoon.displayQuestion();
    }
}
