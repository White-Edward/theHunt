/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

/**
 *
 * @author Ann
 */
public class ClueBag extends Item {
    
    private int numClues;

    public ClueBag() {
    }

    public int getNumClues() {
        return numClues;
    }

    public void setNumClues(int numClues) {
        this.numClues = numClues;
    }
}
