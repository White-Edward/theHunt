/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

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
                this.startPickUpTNT();
                break;
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
    
    private void startPickUpTNT() {
         this.console.println("*** startPickupTNT function called ***");
    }
    
    private void startDropTNT(){       
        this.console.println("*** startDropTNT function called ***");
    }   

    private void startUseTNT() {
        this.console.println("*** startUseTNT function called ***");
    }


  }
  

