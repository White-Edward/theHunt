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
        char choice = value.charAt(0);  // get the first character in the string
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
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(TheHunt.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void startSaveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void startHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void startQuitGame() {
        System.out.println("*** startQuitGame function called ***");
    }

    private void startAboutUs() {
        System.out.println("*** startAboutUs function called ***");
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
}
