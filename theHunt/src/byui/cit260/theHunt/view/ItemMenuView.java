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
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        switch (choice) {
            case 'C': // Open Clue Bag Menu
                this.startClueBag();
                break;
            case 'T': // View TNT Menu
                this.startTNT();
                break;
            case 'P': // View Old Cell Phone Menu
                this.startOldCellPhone();
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
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startClueBag() {
        System.out.println("*** startClueBag function called ***");
    }

    private void startTNT() {
        System.out.println("*** startTNT function called ***");
    }

    private void startOldCellPhone() {
        System.out.println("*** startOldCellPhone function called ***");
    }

    private void startMonkey() {
        System.out.println("*** startMonkey function called ***");
    }

    private void startAidBag() {
        System.out.println("*** startAidBag function called ***");
    }


}
