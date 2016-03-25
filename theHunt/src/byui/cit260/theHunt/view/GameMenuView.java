/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.model.Game;
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
            +"\n G - Go to new map location"
            +"\n H - Help menu"
            +"\n I - Item menu"
            +"\n Q - Quit game"
            +"\n R - Return to main menu"
            +"\n B - Go back"
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
            case 'G': // Go to new map location
                this.displayGoToNewMapLocation();
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
            case 'B': // Back to previous menu 
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void displayGameMap() {
        Game game = TheHunt.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        this.console.println("\nMap");
        this.console.println("    ---------------------"); // Row Divider
        this.console.print("    "); //Print the empty corner
        for (int i = 0; i < locations.length; i++) {
            this.console.print("| " + (i + 1) + " ");
        }
//        locations[0][3].setVisited(true); // Set position to visited
//        locations[1][3].setVisited(true); // Set position to visited
//        locations[2][3].setVisited(true); // Set position to visited
//        locations[3][3].setVisited(true); // Set position to visited
//        locations[4][3].setVisited(true); // Set position to visited
        this.console.print("|\n"); //End header row
        this.console.println("-------------------------");  // Row Divider
        for (int x = 0; x < locations.length; x++) {
            this.console.print("| " + (x + 1) + " "); // Print row number
            for (int y = 0; y < locations[x].length; y++) {
                Location location = locations[x][y];
                //locations[x][y].setVisited(true); // Test setting all locations
                if (location.isVisited()) {
                    if (location.hasQuestion() && location.getQuestion().getQuestionType() != QuestionType.empty) {
                        if (location.hasItem()) {
                            this.console.print("| q "); // If an item is also on this location, small queue to make room (lowercase)
                        } else {
                            this.console.print("| Q "); // If only a question is on this location, take up all the room it can (capital)
                        }
                    } else if (location.hasItem()) {
                        switch (location.getItem()) {
                            case AidBag:
                                this.console.print("| A ");
                                break;
                            case ClueBag:
                                this.console.print("| C ");
                                break;
                            case Monkey:
                                this.console.print("| M ");
                                break;
                            case TNT:
                                this.console.print("| T ");
                                break;
                            case OldCellPhone:
                                this.console.print("| O ");
                                break;
                        }
                    } else {
                        this.console.print("| * ");
                    }
                } else {
                    this.console.print("| ? ");
                }
            }
            this.console.println("|\n-------------------------");
        }
        this.console.println("Legend:");
        this.console.println("  ? - Location has not been visited");
        this.console.println("  Q - Location has a question");
        this.console.println("  q - Location has a question and an item");
        this.console.println("  C - Location has a clue bag");
        this.console.println("  A - Location has an aid bag");
        this.console.println("  M - Location has a monkey");
        this.console.println("  T - Location has TNT");
        this.console.println("  O - Location has an old cell phone");
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

    private void displayGameProgress() {
        this.console.println("Number of questions answered:   " + QuestionControl.countAnweredQuestions());
        
        this.console.println("Number of questions unanswered: " + QuestionControl.countUnansweredQuestions());
    }
    
    private void displayGoToNewMapLocation()  {
        LocationView locationMenu = new LocationView();
        locationMenu.display();
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
        this.console.println("*** startQuitGame function called ***");
    }

    private void startMainMenu() {
        // display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
