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
    public void display() throws IOException;
    public String getInput() throws IOException;
    public boolean doAction(String value) throws IOException;
}
