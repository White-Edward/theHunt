/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;
import java.io.Serializable;
/**
 *
 * @author Ed White
 */
public class Question implements Serializable{
    //Class instance veriables
    private boolean hasClue;
    private boolean hasTwoTrainSquare;
    private boolean hasTeaspoonSquare;
    private boolean hasWaterSquare;

    public Question() {
    }
    
 
    public boolean isHasClue() {
        return hasClue;
    }

    public void setHasClue(boolean hasClue) {
        this.hasClue = hasClue;
    }

    public boolean isHasTwoTrainSquare() {
        return hasTwoTrainSquare;
    }

    public void setHasTwoTrainSquare(boolean hasTwoTrainSquare) {
        this.hasTwoTrainSquare = hasTwoTrainSquare;
    }

    public boolean isHasTeaspoonSquare() {
        return hasTeaspoonSquare;
    }

    public void setHasTeaspoonSquare(boolean hasTeaspoonSquare) {
        this.hasTeaspoonSquare = hasTeaspoonSquare;
    }

    public boolean isHasWaterSquare() {
        return hasWaterSquare;
    }

    public void setHasWaterSquare(boolean hasWaterSquare) {
        this.hasWaterSquare = hasWaterSquare;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.hasClue ? 1 : 0);
        hash = 41 * hash + (this.hasTwoTrainSquare ? 1 : 0);
        hash = 41 * hash + (this.hasTeaspoonSquare ? 1 : 0);
        hash = 41 * hash + (this.hasWaterSquare ? 1 : 0);
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
        final Question other = (Question) obj;
        if (this.hasClue != other.hasClue) {
            return false;
        }
        if (this.hasTwoTrainSquare != other.hasTwoTrainSquare) {
            return false;
        }
        if (this.hasTeaspoonSquare != other.hasTeaspoonSquare) {
            return false;
        }
        if (this.hasWaterSquare != other.hasWaterSquare) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "hasClue=" + hasClue + ", hasTwoTrainSquare=" + hasTwoTrainSquare + ", hasTeaspoonSquare=" + hasTeaspoonSquare + ", hasWaterSquare=" + hasWaterSquare + '}';
    }
    
    
    
}
