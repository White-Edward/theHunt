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
 * @author Edward White
 */
public class WaterSquare implements Serializable {
    
    //class instance variable
    private String waterSquare;
    private boolean used;

    public WaterSquare() {
    }
    
    
    public String getWaterSquare() {
        return waterSquare;
    }

    public void setWaterSquare(String waterSquare) {
        this.waterSquare = waterSquare;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.waterSquare);
        hash = 67 * hash + (this.used ? 1 : 0);
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
        final WaterSquare other = (WaterSquare) obj;
        if (this.used != other.used) {
            return false;
        }
        if (!Objects.equals(this.waterSquare, other.waterSquare)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WaterSquare{" + "waterSquare=" + waterSquare + ", used=" + used + '}';
    }
    
    
    
    
}
