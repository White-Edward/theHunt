/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.IOException;

/**
 *
 * @author Ann
 */
public interface ViewInterface {
    public void display();
    public String getInput();
    public boolean doAction(String value);
}
