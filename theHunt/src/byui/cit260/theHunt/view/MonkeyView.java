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
            +"\n F - Feed Monkey"
            +"\n M - Poke Monkey"
            +"\n B - Back"
            +"\n---------------------------------------------------------------", "Choose an option: ");
    }

    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'P': // create and start a new game
                this.startPickUpMonkey();
                break;
            case 'D': // get and start existing game
                this.startDropMonkey();
                break;
            case 'F': // get and start existing game
                this.startFeedMonkey();
                break;
            case 'M': // get and start existing game
                this.startPokeMonkey();
                break;
            case 'B':
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startPickUpMonkey(){
        this.console.println("*** startPickUpMonkey function called ***");
    }
    
    private void startDropMonkey(){       
        this.console.println("*** startDropMonkey function called ***");
    }

    private void startFeedMonkey() {
        this.console.println("*** The monkey loves the bananas and does a dance in appreciation ***");
    }

    private void startPokeMonkey() {
        this.console.println("*** You made the monkey mad.  He throws poo at you! ***");
    }
}
