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
public class Location implements Serializable{
    
    // class instance variables.
    private boolean hasQuestion;
    private boolean hasAttribute;
    private boolean hasItem;
    private Question question;
    private Item item;
    private int row;
    private int column;
    private boolean visited;
    private String clue;
    private boolean hasClue;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
        this.setHasQuestion(true);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Location() {
    }

    public boolean hasQuestion() {
        return hasQuestion;
    }

    public void setHasQuestion(boolean hasQuestion) {
        this.hasQuestion = hasQuestion;
    }

    public boolean isHasAttribute() {
        return hasAttribute;
    }

    public void setHasAttribute(boolean hasAttribute) {
        this.hasAttribute = hasAttribute;
    }

    public boolean hasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        this.setHasItem(true);
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public boolean hasClue() {
        return hasClue;
    }

    public void setHasClue(boolean hasClue) {
        this.hasClue = hasClue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.hasQuestion ? 1 : 0);
        hash = 53 * hash + (this.hasAttribute ? 1 : 0);
        hash = 53 * hash + (this.hasItem ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.question);
        hash = 53 * hash + Objects.hashCode(this.item);
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        hash = 53 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.hasQuestion != other.hasQuestion) {
            return false;
        }
        if (this.hasAttribute != other.hasAttribute) {
            return false;
        }
        if (this.hasItem != other.hasItem) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "hasQuestion=" + hasQuestion + ", hasAttribute=" + hasAttribute + ", hasItem=" + hasItem + ", question=" + question + ", item=" + item + ", row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
}


    