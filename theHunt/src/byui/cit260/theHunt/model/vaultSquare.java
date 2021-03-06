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
public class vaultSquare implements Serializable{
    
    
    //class instance variables
    private String vaultSquare;
    private boolean used;
    private final String question;
    private String combo;

    public vaultSquare() {
        this.question = "\n"
                + "\n You have reached the treasure vault! All you need is the correct combination."
                + "\n Use your clues to enter in the correct combination and reaceive the treasure!";
    }
        
    public String getVaultSquare() {
        return vaultSquare;
    }

    public void setVaultSquare(String twoTrainsSquare) {
        this.vaultSquare = twoTrainsSquare;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.vaultSquare);
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
        final vaultSquare other = (vaultSquare) obj;
        if (this.used != other.used) {
            return false;
        }
        return Objects.equals(this.vaultSquare, other.vaultSquare);
    }

    @Override
    public String toString() {
        return "VaultSquare{" + "vaultSquare=" + vaultSquare + ", used=" + used + '}';
    }


        }
    
    
    
    

