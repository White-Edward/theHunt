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
 * @author Ryan
 */
public class Clue implements Serializable{
    
    //class instance variables
    private String clue;
    private boolean viewed;

    public Clue() {
    }
    
    

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    /**
     *
     * @return
     */
    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.clue);
        hash = 47 * hash + (this.viewed ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Clue{" + "clue=" + clue + ", viewed=" + viewed + '}';
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
        final Clue other = (Clue) obj;
        if (this.viewed != other.viewed) {
            return false;
        }
        if (!Objects.equals(this.clue, other.clue)) {
            return false;
        }
        return true;
    }
    
    
    
}
