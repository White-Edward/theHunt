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
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Help Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n M - How to move the character"
            +"\n A - Actions"
            +"\n B - Back to the main menu"
            +"\n---------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        switch (choice) {
            case 'M': // create and start a new game
                this.startMoveHelp();
                break;
            case 'A': // get and start existing game
                this.startActionsHelp();
                break;
            case 'B':
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startMoveHelp() {
        System.out.println("\n================================================="
                            + "\n W - Moves the user forward one space"
                            + "\n D - Turns the user clockwise 90 degrees"
                            + "\n A - Turns the user counter-clockwise 90 degrees"
                            + "\n S - Moves the user backward one space"
                            + "\n================================================"
                          );
    }

    private void startActionsHelp() {
        System.out.println("\n================================================================================"
                          + "\n Search Location - Searches the location you are in for clues and items"
                          + "\n Answer Riddle - Allows you to attempt to answer a question to receive a clue"
                          + "\n Pickup Item - Moves an item from the location you are in to your item bag"
                          + "\n Drop Item - Moves an item from your item bag to the location you are in"
                          + "\n================================================================================"
                          );
    }

}
