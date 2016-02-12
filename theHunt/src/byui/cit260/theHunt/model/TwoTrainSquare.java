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
public class TwoTrainSquare implements Serializable{
    
    
    //class instance variables
    private String twoTrainsSquare;
    private boolean used;

    public TwoTrainSquare() {
    }
        
    public String getTwoTrainsSquare() {
        return twoTrainsSquare;
    }

    public void setTwoTrainsSquare(String twoTrainsSquare) {
        this.twoTrainsSquare = twoTrainsSquare;
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
        hash = 97 * hash + Objects.hashCode(this.twoTrainsSquare);
        hash = 97 * hash + (this.used ? 1 : 0);
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
        final TwoTrainSquare other = (TwoTrainSquare) obj;
        if (this.used != other.used) {
            return false;
        }
        if (!Objects.equals(this.twoTrainsSquare, other.twoTrainsSquare)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TwoTrainSquare{" + "twoTrainsSquare=" + twoTrainsSquare + ", used=" + used + '}';
    }
    
    
    
}