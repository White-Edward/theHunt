/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

/*import java.awt.Point;*/
import java.io.Serializable;
/*import java.util.Objects;*/

/**
 *
 * @author Ann
 */
public class ClueBag implements Serializable {

    /*public static ClueBag ClueBag;
    private Location location;
    private Point coordinates;*/
   
    private int numClues;

    public ClueBag() {
    }

    public int getNumClues() {
        return numClues;
    }

    public void setNumClues(int numClues) {
        this.numClues = numClues;
    }
    
    /*public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }*/
    

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
        /*if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }   */         
        
        return true;
    }

    @Override
    public String toString() {
        return "ClueBag{" + "numClues=" + numClues + '}';
    }


}
