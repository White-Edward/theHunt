/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

/**
 *
 * @author Ann
 */

public class MonkeyView extends View {
    
    public MonkeyView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| What do you want to do with the monkey????                  |"
            +"\n---------------------------------------------------------------"
            +"\n P - Pick Up"
            +"\n D - Put Down"
            +"\n B - Back"
            +"\n---------------------------------------------------------------", "Choose an option: ");
    }

    @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        switch (choice) {
            case 'P': // create and start a new game
                this.startPickUpMonkey();
                break;
            case 'D': // get and start existing game
                this.startDropMonkey();
                break;
            case 'B':
                return true;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startPickUpMonkey(){
        System.out.println("*** startPickUpMonkey function called ***");
    }
    
    private void startDropMonkey(){       
        System.out.println("*** startDropMonkey function called ***");
    }
}
