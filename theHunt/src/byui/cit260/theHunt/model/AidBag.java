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
public class AidBag implements Serializable {
    private String itemType;
    private boolean used;

    public AidBag() {
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.itemType);
        hash = 17 * hash + (this.used ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AidBag other = (AidBag) obj;
        if (this.used != other.used) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AidBag{" + "itemType=" + itemType + ", used=" + used + '}';
    }
    
    
}
