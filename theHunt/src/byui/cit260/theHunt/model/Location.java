/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;

/**
 *
 * @author Ryan
 */
public class Location implements Serializable{
    
    // class instance variables.
    private boolean hasQuestion;
    private boolean hasAttribute;

    public Location() {
    }
    
    

    public boolean isHasQuestion() {
        return hasQuestion;
    }

    public void setHasQuestion(boolean hasQuestion) {
        this.hasQuestion = hasQuestion;
    }

    public boolean isHasAttribute() {
        return hasAttribute;
    }

    public void setHasAttribute(boolean hasAttribute) {
        this.hasAttribute = hasAttribute;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.hasQuestion ? 1 : 0);
        hash = 23 * hash + (this.hasAttribute ? 1 : 0);
        return hash;
        
    }

    @Override
    public String toString() {
        return "Location{" + "hasQuestion=" + hasQuestion + ", hasAttribute=" + hasAttribute + '}';
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
        final Location other = (Location) obj;
        if (this.hasQuestion != other.hasQuestion) {
            return false;
        }
        if (this.hasAttribute != other.hasAttribute) {
            return false;
        }
        return true;
    }
    
    


    
}


    