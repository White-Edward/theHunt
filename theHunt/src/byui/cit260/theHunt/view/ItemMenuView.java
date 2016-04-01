/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Item;
import java.util.ArrayList;
import thehunt.TheHunt;


/**
 *
 * @author Ann
 */
public class ItemMenuView extends View {
    
    public ItemMenuView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Item Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n C - Clue bag"
            +"\n T - TNT"
            +"\n P - Old cell phone"
            +"\n M - Monkey"
            +"\n A - Aid Bag"
            +"\n B - Back to the main menu"
            +"\n---------------------------------------------------------------");
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            String itemMenu;
            // Generate an item menu based on the items that the player has in inventory
            ArrayList<Item> items = TheHunt.getCurrentGame().getPlayer().getItemInventory();
            if (items.isEmpty()) {
                itemMenu = "\n"
                            +"\n---------------------------------------------------------------"
                            +"\n| Item Menu - You don't have any items yet!                   |"
                            +"\n---------------------------------------------------------------";
            } else {
                itemMenu = "\n"
                            +"\n---------------------------------------------------------------"
                            +"\n| Item Menu                                                   |"
                            +"\n---------------------------------------------------------------";
                for (Item item : items) {
                    switch (item) {
                        case AidBag:
                            itemMenu += "\n A - Aid Bag";
                            break;
                        case ClueBag:
                            itemMenu += "\n C - Clue Bag";
                            break;
                        case Monkey:
                            itemMenu += "\n M - Monkey";
                            break;
                        case OldCellPhone:
                            itemMenu += "\n P - Old Cell Phone";
                            break;
                        case TNT:
                            itemMenu += "\n T - TNT";
                            break;
                    }
                }
            }
            itemMenu += "\n B - Back to the main menu"
                +"\n---------------------------------------------------------------";

            this.displayMessage = itemMenu;
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) { //user wants to quit
                return; // exit the view
            }
            
            //do the requsted action and display the next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'C': // Open Clue Bag Menu
                this.startClueBag();
                break;
            case 'T': // View TNT Menu
                this.startTNTview();
                break;
            case 'P': // View Old Cell Phone Menu
                this.startOldCellPhoneView();
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
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startClueBag() {
        this.console.println("*** startClueBag function called ***");
    }

    private void startTNTview() {
        TNTview TNT = new TNTview();
        TNT.display();
    }

    private void startOldCellPhoneView() {
        OldCellPhoneView phone = new OldCellPhoneView();
        phone.display();
    }

    private void startMonkey() {
        MonkeyView monkey = new MonkeyView();
        monkey.display();
    }
    private void startAidBag() {
        this.console.println("*** startAidBag function called ***");
    }


}
