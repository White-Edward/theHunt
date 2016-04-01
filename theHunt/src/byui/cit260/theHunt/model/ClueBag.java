/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;

/**
 *
 * @author Ann
 */
public class ClueBag implements Serializable {

    private int numClues;

    public ClueBag() {
    }

    public int getNumClues() {
        return numClues;
    }

    public void setNumClues(int numClues) {
        this.numClues = numClues;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.numClues;
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
        final ClueBag other = (ClueBag) obj;
        if (this.numClues != other.numClues) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClueBag{" + "numClues=" + numClues + '}';
    }
}
