/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.ItemControl;

/**
 *
 * @author Edward
 */
public class AidBagView extends View {
    
        public AidBagView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| Aid Bag  -- This will restore you health to 100             |"
            +"\n---------------------------------------------------------------"
            +"\n D - Put Down"
            +"\n U - Use Aid Bag"    
            +"\n B - Back"
            +"\n---------------------------------------------------------------", "Choose an option: ");
        }
        
     
    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'D': // put down Aid Bag
                this.startDropAidBag();
                break;
            case 'U': // use the Aid Bag
                this.startUseAidBag();
                break;    
            case 'B': // go back
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startDropAidBag(){
        boolean result = ItemControl.dropAidBag();
         if (result) {
            this.console.println("Aid Bag dropped");
        } else {
            this.console.println("Fine! Hope you enjoy your early demise!");
        }
    }   

    private void startUseAidBag() {
        boolean result = ItemControl.useAidBag();
        if (result) {
            this.console.println("Aid Bag sucessfully used.");
        } else {
            this.console.println("Aid Bag was not successfully used.");
        }
    }


  }

