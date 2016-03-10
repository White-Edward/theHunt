/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Ann
 */
public enum Actor implements Serializable  {
    
    SomeActor("We don't have actors!");
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
