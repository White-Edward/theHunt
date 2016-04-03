/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.MapControl;
import byui.cit260.theHunt.control.PlayerControl;
import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.model.QuestionType;
/*import byui.cit260.theHunt.model.Health;*/
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class LocationView extends View {
    public LocationView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Location  Menu                                              |"
            +"\n---------------------------------------------------------------"
            +"\n R - Search location for riddles"
            +"\n I - Search location for items"
            +"\n C - Show unlocked clues"
            +"\n B - Go back"
            +"\n---------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'R': // Display riddle
                this.displayRiddle();
                break;
            case 'I': // Open Game map
                this.displayItem();
                break;
            case 'C': // Open Game map
                this.displayClue();
                break;
            case 'B': // Back to previous menu 
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void displayRiddle() {
        // Backup display and prompt message
        String displayMessage = this.displayMessage;
        String promptMessage = this.promptMessage;
        
        Location location = TheHunt.getCurrentGame().getPlayer().getLocation();
        if (location.hasQuestion()) {
            Question question = location.getQuestion();
            if (question.getQuestionType().equals(QuestionType.empty)) {
                this.console.println("No questions were found.  Try looking in another map location");
            } else {
                this.displayMessage = question.getRiddle();
                // Set the display and prompt message
                this.promptMessage = "Answer: ";

                String playerResponse = this.getInput(); // Get player response

                this.displayMessage = displayMessage;
                this.promptMessage = promptMessage;

                if (QuestionControl.answerQuestion(question,playerResponse.toUpperCase())) {
                    if (question.getQuestionType().equals(QuestionType.vault)) {
                        // Win the game
                    this.console.println("\n Correct! You have found the treasure and completed"
                             + "\n The Hunt. You may continue to roam the map or you may quit and start"
                             + "\n a new game.");
                    } else {
                        // clue unlocked
                        this.console.println("Correct!  Clue Unlocked.");
                        // TODO: need to add clue to the clue bag
                    }
                } else {                   
                    this.console.println("Sorry, try again");
                }
            }
        } else {
            this.console.println("No questions were found.  Try looking in another map location");
        }
    }
    
    private void displayItem() {
        Location location = TheHunt.getCurrentGame().getPlayer().getLocation();
        if (location.hasItem()) {
            // Backup display and prompt message
            String displayMessage = this.displayMessage;
            String promptMessage = this.promptMessage;

            // Set the display and prompt message
            this.displayMessage = location.getItem().name();
            this.promptMessage = "Do you want to pickup this item? [y/n]: ";

            
            String playerResponse = this.getInput(); // Get player response

            this.displayMessage = displayMessage;
            this.promptMessage = promptMessage;
            
            if (playerResponse.toUpperCase().charAt(0) == 'Y') {
                // Save the item to the player's item inventory
                PlayerControl.addItemToPlayerInventory(location.getItem());
                MapControl.removeItemFromLocation(location);
            }
        } else {
            this.console.println("No items were found.  Try looking in another map location.");
        }
    }
    
    private void displayClue() {
        Location location = TheHunt.getCurrentGame().getPlayer().getLocation();
        if (location.hasQuestion()) {
            if (location.getQuestion().isAnswered()) {
                if (location.hasClue()) {
                    // Show the player the clue
                    this.console.println(location.getClue());
                } else {
                    this.console.println("No clues were found.  Try looking in another map location.");
                }
            } else {
                this.console.println("You have to answer the question correctly before you can see the clue!");                
            }
        } else {
            this.console.println("No clues were found.  Try looking in another map location.");
        }
    }
}
