/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.ItemControl;

/**
 *
 * @author Ryan
 */
public class TNTview extends View {
    
        public TNTview() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n|TNT will let you destroy one riddle and receive the clue. Use wisely only one TNT per game|"
            +"\n---------------------------------------------------------------"
            +"\n D - Put Down"
            +"\n U - Use TNT"    
            +"\n B - Back"
            +"\n---------------------------------------------------------------", "Choose an option: ");
        }
        
     
    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'D': // put down cell phone
                this.startDropTNT();
                break;
            case 'U': // use the old cell phone
                this.startUseTNT();
                break;    
            case 'B': // go back
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startDropTNT(){       
        boolean result = ItemControl.dropTNT();
        if (result) {
            this.console.println("TNT dropped");
        } else {
            this.console.println("Can't drop TNT here");
        }
    }   

    private void startUseTNT() {
        boolean result = ItemControl.useTNT();
        if (result) {
            this.console.println("TNT used successfully");
        } else {
            this.console.println("Can't use TNT here");
        }
    }


  }
  

