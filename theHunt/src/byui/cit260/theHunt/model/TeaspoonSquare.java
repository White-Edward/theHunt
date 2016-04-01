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
public class TeaspoonSquare implements Serializable {
    
    //class instance variables
    private String teaspoonSquare;
    boolean used;

    public TeaspoonSquare() {
    }

    public String getTeaspoonSquare() {
        return teaspoonSquare;
    }

    public void setTeaspoonSquare(String teaspoonSquare) {
        this.teaspoonSquare = teaspoonSquare;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.teaspoonSquare);
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
        final TeaspoonSquare other = (TeaspoonSquare) obj;
        if (this.used != other.used) {
            return false;
        }
        if (!Objects.equals(this.teaspoonSquare, other.teaspoonSquare)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TeaspoonSquare{" + "teaspoonSquare=" + teaspoonSquare + ", used=" + used + '}';
    }
    
    
}
