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
        char choice = value.charAt(0);
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
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        return false;
    }
    
    private void startPickUpOldCellPhone() {
         System.out.println("*** startPickupOldCellPhone function called ***");
    }
    
    private void startDropOldCellPhone(){       
        System.out.println("*** startDropOldCellPhone function called ***");
    }   

    private void startUseOldCellPhone() {
        System.out.println("*** startUseOldCellPhone function called ***");
    }


  }
