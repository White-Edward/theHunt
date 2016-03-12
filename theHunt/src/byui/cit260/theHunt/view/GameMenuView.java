/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import thehunt.TheHunt;


/**
 *
 * @author Ed
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Game Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n M - Show game map"
            +"\n S - Save game progress"
            +"\n H - Help menu"
            +"\n I - Item menu"
            +"\n Q - Quit game"
            +"\n R - Return to main menu"
            +"\n G - Return to game"
            +"\n---------------------------------------------------------------", "Select an option: ");
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);  // get the first character in the string
        switch (choice) {
            case 'M': // Open Game map
                this.startGameMap();
                break;
            case 'S': // Save game progress
                this.startSaveGame();
                break;
            case 'H': // View Help Menu
                this.startHelpMenu();
                break;
            case 'I': // View Help Menu
                this.startItemMenu();
                break;                
            case 'Q': // Quit game
                this.startQuitGame();
                break;
            case 'R': // View Main Menu
                this.startMainMenu();
                break;
            case 'G': // Return to game 
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startGameMap() {
        Game game = TheHunt.getCurrentGame();
        Map map = game.getMap();
        System.out.println("---------------------------------");
        for (Location[] x : map.getLocations()){
            for (Location y : x) {
                System.out.print("|    " + y.getQuestion().getRiddle() + "    ");
                //System.out.println(y.getQuestion().getAnswer());
            }
            System.out.println("|\n---------------------------------");
        }
        //System.out.println("*** startGameMap function called ***");
    }

    private void startSaveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void startHelpMenu() {
                // display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void startItemMenu() {
                // display the game menu
        ItemMenuView itemMenu = new ItemMenuView();
        itemMenu.display();
    }
    private void startQuitGame() {
        System.out.println("*** startQuitGame function called ***");
    }

    private void startMainMenu() {
        // display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
