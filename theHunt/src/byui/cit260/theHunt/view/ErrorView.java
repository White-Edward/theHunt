/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.PrintWriter;
import thehunt.TheHunt;

/**
 *
 * @author Edward
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TheHunt.getOutFile();
    
    public static void desplay(String ClassName, String errorMessage) {
        
        errorFile.println(
                    "------------------------------------------------------"
                  + "\n- ERROR -" + errorMessage
                  + "\n------------------------------------------------------");
        
    }
    
}
