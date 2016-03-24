/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.IOException;
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
    public boolean doAction(String value) throws IOException {
        char choice = value.charAt(0);
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
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startClueBag() {
        System.out.println("*** startClueBag function called ***");
    }

    private void startTNTview() throws IOException {
        TNTview TNT = new TNTview();
        TNT.display();
    }

    private void startOldCellPhoneView() throws IOException {
        OldCellPhoneView phone = new OldCellPhoneView();
        phone.display();
    }

    private void startMonkey() throws IOException {
        MonkeyView monkey = new MonkeyView();
        monkey.display();
    }
    private void startAidBag() {
        System.out.println("*** startAidBag function called ***");
    }


}
