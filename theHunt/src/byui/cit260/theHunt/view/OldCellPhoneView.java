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
            case 'P': // pick up cell phone
                this.startPickUpOldCellPhone();
                break;
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
    
    private void startPickUpOldCellPhone() {
         this.console.println("*** startPickupOldCellPhone function called ***");
    }
    
    private void startDropOldCellPhone(){       
        this.console.println("*** startDropOldCellPhone function called ***");
    }   

    private void startUseOldCellPhone() {
        this.console.println("*** startUseOldCellPhone function called ***");
    }


  }

