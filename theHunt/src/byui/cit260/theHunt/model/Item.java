/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Ann
 */
public enum Item implements Serializable {

    ClueBag("This bag holds the hints you received from answering a riddle correctly."),
    TNT("TNT will let you destroy one riddle and receive the clue."),
    OldCellPhone("An old cell?  Don't discard it, it might become of use!"),
    Monkey("A monkey that doesn't do anything"),
    AidBag("Use the Aid Bag to help heal yourself.");
    
    private final String itemType;
    private boolean used;
    
    Item(String itemType) {
        this.itemType = itemType;
        used = false;
    }
    
    public String getItemType() {
        return itemType;
    }

    public boolean isUsed() {
        return used;
    }

    public void useItem() {
        this.used = true;
    }

    public void dropItem() {
        // Remove item from item bag
    }   

    public void setDescription(String clue_Bag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}