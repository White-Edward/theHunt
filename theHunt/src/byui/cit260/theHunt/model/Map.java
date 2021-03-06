/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import thehunt.TheHunt;

/**
 *
 * @author Ryan
 */
public class Map implements Serializable {
    
    private int rowCount;
    private int columnCount;
    private int locationTileLayout;
    private Location[][] locations;
    protected transient final PrintWriter console = TheHunt.getOutFile();

    public Map() {
    }
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            this.console.println("The number of rows and columns must be greater than zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        // create 2-D array for Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                this.locations[row][column] = location;
            }
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getLocationTileLayout() {
        return locationTileLayout;
    }

    public void setLocationTileLayout(int locationTileLayout) {
        this.locationTileLayout = locationTileLayout;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.rowCount;
        hash = 13 * hash + this.columnCount;
        hash = 13 * hash + this.locationTileLayout;
        hash = 13 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.locationTileLayout != other.locationTileLayout) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", locationTileLayout=" + locationTileLayout + ", locations=" + locations + ", console=" + console + '}';
    }

}
