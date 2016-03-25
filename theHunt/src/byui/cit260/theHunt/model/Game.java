/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Ryan
 */
public class Game implements Serializable {
    
    //class instance variables
    private String name;
    private String welcomeMessage;
    
    private String[] actors;
    private Player player;
    private Item[] items;
    private ArrayList<Question> questions;
    private Map map;

    public Game() {
    }

    public String[] getActors() {
        return actors;
    }

    public Player getPlayer() {
        return player;
    }

    public Item[] getItems() {
        return items;
    }

    public Map getMap() {
        return map;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.welcomeMessage);
        hash = 71 * hash + Arrays.deepHashCode(this.actors);
        hash = 71 * hash + Objects.hashCode(this.player);
        hash = 71 * hash + Arrays.deepHashCode(this.items);
        hash = 71 * hash + Objects.hashCode(this.questions);
        hash = 71 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.welcomeMessage, other.welcomeMessage)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", welcomeMessage=" + welcomeMessage + ", actors=" + actors + ", player=" + player + ", items=" + items + ", questions=" + questions + ", map=" + map + '}';
    }

    
    
    
}
