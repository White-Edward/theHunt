/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.MapControl;
import byui.cit260.theHunt.exceptions.MapControlException;
import byui.cit260.theHunt.model.Player;
import java.awt.Point;
import thehunt.TheHunt;

/**
 *
 * @author Edward
 */
public class LocationView extends View {
    
    public LocationView() {
        super("\n","Choose a location to move to (x,y), or Q to cancel: ");
    }
    
    @Override
    public boolean doAction(String value) {
        Player player = TheHunt.getPlayer();
        try {
            String[] coordinates = value.split(",");
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            Point point = new Point(row,column);
            MapControl.assignPlayerToLocation(player, point);
        } catch (NumberFormatException e) { // catch parseInt error
            System.out.println("x and y locations must be numeric");
            return false;
        } catch (MapControlException e) { // catch assignPlayerToLocation error
            System.out.println(e.getMessage());
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid point - new location must be int and 'x,y' format");
            return false;
        }
        System.out.println("You are now at location (" 
                + player.getCoordinates().x + "," + player.getCoordinates().y + ")");
        return true;
    }
}
