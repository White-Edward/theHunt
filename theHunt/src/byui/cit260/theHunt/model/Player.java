/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Ann
 */
public class Player implements Serializable {
    
    //class instance variables
    private String characterName;
    private Location location;
    private Point coordinates;
    private boolean hasAidBag;
    private boolean hasClueBag;
    private boolean hasTNT;
    private boolean hasMonkey;
    private boolean hasOldCellPhone;
    private ArrayList<Item> itemInventory;
    /*private double Health;*/

    public Player() {
        this.hasAidBag = false;
        this.hasClueBag = false;
        this.hasTNT = false;
        this.hasMonkey = false;
        this.hasOldCellPhone = false;
        itemInventory = new ArrayList();
        /*this.Health = 100;*/

    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Location getLocation() {
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
    }

    public boolean isHasAidBag() {
        return hasAidBag;
    }

    public void setHasAidBag(boolean hasAidBag) {
        this.hasAidBag = hasAidBag;
    }

    public boolean isHasClueBag() {
        return hasClueBag;
    }

    public void setHasClueBag(boolean hasClueBag) {
        this.hasClueBag = hasClueBag;
    }

    public boolean isHasTNT() {
        return hasTNT;
    }

    public void setHasTNT(boolean hasTNT) {
        this.hasTNT = hasTNT;
    }

    public boolean isHasMonkey() {
        return hasMonkey;
    }

    public void setHasMonkey(boolean hasMonkey) {
        this.hasMonkey = hasMonkey;
    }

    public boolean isHasOldCellPhone() {
        return hasOldCellPhone;
    }

    public void setHasOldCellPhone(boolean hasOldCellPhone) {
        this.hasOldCellPhone = hasOldCellPhone;
    }

    public ArrayList<Item> getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(ArrayList<Item> itemInventory) {
        this.itemInventory = itemInventory;
    }
    
    public void addItemInventory(Item item) {
        this.itemInventory.add(item);
    }
    
    /*public double getHealth() {
        return Health;
    }

    public void setHealth(double Health) {
        this.Health = Health;
    }*/
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.characterName);
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + Objects.hashCode(this.coordinates);
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
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "characterName=" + characterName + ", location=" + location + ", coordinates=" + coordinates + /*"Health=" + Health +*/ '}';
    }

}
