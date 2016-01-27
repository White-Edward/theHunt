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
public class Player implements Serializable {
    
    //class instance variables
    private String characterName;

    public Player() {
    }
    
    

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.characterName);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "characterName=" + characterName + '}';
    }
    
    
    
}
