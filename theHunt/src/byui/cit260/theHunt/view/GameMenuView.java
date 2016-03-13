/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.QuestionType;
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
            +"\n P - Show game progress"
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
                this.displayGameMap();
                break;
            case 'S': // Save game progress
                this.startSaveGame();
                break;
            case 'P': // Show game progress
                this.displayGameProgress();
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

    private void displayGameMap() {
        Game game = TheHunt.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        System.out.println("\nMap");
        System.out.println("    ---------------------"); // Row Divider
        System.out.print("    "); //Print the empty corner
        for (int i = 0; i < locations.length; i++) {
            System.out.print("| " + i + " ");
        }
//        locations[0][3].setVisited(true); // Set position to visited
//        locations[1][3].setVisited(true); // Set position to visited
//        locations[2][3].setVisited(true); // Set position to visited
//        locations[3][3].setVisited(true); // Set position to visited
//        locations[4][3].setVisited(true); // Set position to visited
        System.out.print("|\n"); //End header row
        System.out.println("-------------------------");  // Row Divider
        for (int x = 0; x < locations.length; x++) {
            System.out.print("| " + x + " "); // Print row number
            for (int y = 0; y < locations[x].length; y++) {
                Location location = locations[x][y];
                //locations[x][y].setVisited(true); // Test setting all locations
                if (location.isVisited()) {
                    if (location.hasQuestion() && location.getQuestion().getQuestionType() != QuestionType.empty) {
                        if (location.hasItem()) {
                            System.out.print("| q "); // If an item is also on this location, small queue to make room (lowercase)
                        } else {
                            System.out.print("| Q "); // If only a question is on this location, take up all the room it can (capital)
                        }
                    } else if (location.hasItem()) {
                        switch (location.getItem()) {
                            case AidBag:
                                System.out.print("| A ");
                                break;
                            case ClueBag:
                                System.out.print("| C ");
                                break;
                            case Monkey:
                                System.out.print("| M ");
                                break;
                            case TNT:
                                System.out.print("| T ");
                                break;
                            case OldCellPhone:
                                System.out.print("| O ");
                                break;
                        }
                    } else {
                        System.out.print("| * ");
                    }
                } else {
                    System.out.print("| ? ");
                }
            }
            System.out.println("|\n-------------------------");
        }
        System.out.println("Legend:");
        System.out.println("  ? - Location has not been visited");
        System.out.println("  Q - Location has a question");
        System.out.println("  q - Location has a question and an item");
        System.out.println("  C - Location has a clue bag");
        System.out.println("  A - Location has an aid bag");
        System.out.println("  M - Location has a monkey");
        System.out.println("  T - Location has TNT");
        System.out.println("  O - Location has an old cell phone");
    }

    private void startSaveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void displayGameProgress() {
        System.out.println("Number of questions answered:   " + QuestionControl.countAnweredQuestions());
        
        System.out.println("Number of questions unanswered: " + QuestionControl.countUnansweredQuestions());
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
