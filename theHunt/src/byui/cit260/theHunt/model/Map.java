/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

/**
 *
 * @author Ryan
 */
public class Map {
    
    private int rowCount;
    private int columnCount;
    private int locationTileLayout;

    public Map() {
    }
    
    public Map(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.columnCount;
        hash = 97 * hash + this.locationTileLayout;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", locationTileLayout=" + locationTileLayout + '}';
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
        return true;
    }
    
    
    
}
