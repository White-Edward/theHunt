/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

/**
 *
 * @author Edward
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Main Menu                                                   |"
            +"\n---------------------------------------------------------------"
            +"\n N - New Game"
            +"\n L - Load Saved Game"
            +"\n S - Save Game"
            +"\n H - Help"
            +"\n Q - Quit Game"
            +"\n A - About Us"
            +"\n---------------------------------------------------------------";
    
    public void displayMenu() {
        
    char selection = ' ';
    do {
            
        System.out.println(MENU); // display the main menu
            
        String input = this.getInput(); // get the user's selection
        selection = input.charAt(0); //get first character of string
            
        this.doAction(selection); // do action based on selection
            
    } while (selection != 'Q'); // an selection is not "Quit"
}

    void displayMainMenuView() {
        System.out.println("\n*** displayMenu() funcation called***");
    }
    
}
