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
public class OldCellPhoneView extends View {
    
        public OldCellPhoneView() {
        super("\n"
            +"\n---------------------------------------------------------------"
            +"\n| An old cell? It might become of use                         |"
            +"\n---------------------------------------------------------------"
            +"\n P - Pick Up"
            +"\n D - Put Down"
            +"\n U - Use Phone"    
            +"\n B - Back"
            +"\n---------------------------------------------------------------", "Choose an option: ");
        }
        
     
    @Override
    public boolean doAction(String value) {
        char choice = value.toUpperCase().charAt(0);  // get the first character in the string, change to uppercase
        switch (choice) {
            case 'D': // put down cell phone
                this.startDropOldCellPhone();
                break;
            case 'U': // use the old cell phone
                this.startUseOldCellPhone();
                break;    
            case 'B': // go back
                return true;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startDropOldCellPhone(){
        boolean result = ItemControl.dropOldCellPhone();
         if (result) {
            this.console.println("Phone dropped");
        } else {
            this.console.println("You can't drop that dirty old thing here!");
        }
    }   

    private void startUseOldCellPhone() {
        boolean result = ItemControl.useOldCellPhone();
        if (result) {
            this.console.println("Dirty Old Cell Phone successfully used. ");
        } else {
            this.console.println("Sorry, you didn't pay your bill. You can't use the phone here.");
        }
    }


  }

