/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt;

import byui.cit260.theHunt.model.AidBag;
import byui.cit260.theHunt.model.Clue;
import byui.cit260.theHunt.model.ClueBag;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Monkey;
import byui.cit260.theHunt.model.OldCell;
import byui.cit260.theHunt.model.Player;

/**
 *
 * @author Ann Lloyd
 */
public class TheHunt {

    /**
     * @param args the command line arguments
     */
    private static void RyanFunderburkTests() {
        Game newGame = new Game();

        newGame.setName("Jim");
        newGame.setWelcomeMessage("Hi Jim, welcome to The Hunt!");

        String gameInfo = newGame.toString();
        System.out.println(gameInfo);

        Location newLocation = new Location();

        newLocation.setHasQuestion(true);
        newLocation.setHasAttribute(false);

        String locationInfo = newLocation.toString();
        System.out.println(locationInfo);

        Map currentMap = new Map();

        currentMap.setRowCount(5);
        currentMap.setColumnCount(5);
        currentMap.setLocationTileLayout(2);

        String mapInfo = currentMap.toString();
        System.out.println(mapInfo);

        Clue clueOne = new Clue();

        clueOne.setClue("Here is your Clue.");
        clueOne.setViewed(true);

        String clueInfo = clueOne.toString ();
        System.out.println(clueInfo);

    }
            
    private static void AnnLloydTests() {
        // Item Class
        Item item = new Item(); 
        item.setItemType("SomeItemType");
        item.setUsed(false);
        System.out.println(item.toString());
        
        // ClueBag Class
        ClueBag clueBag = new ClueBag();
        clueBag.setItemType("ClueBag");
        clueBag.setNumClues(0);
        clueBag.setUsed(false);
        System.out.println(clueBag.toString());
        
        // OldCell Class
        OldCell oldCell = new OldCell();
        oldCell.setItemType("OldCell");
        oldCell.setUsed(true);
        System.out.println(oldCell.toString());
        
        // Monkey Class
        Monkey monkey = new Monkey();
        monkey.setItemType("Monkey");
        monkey.setUsed(false);
        System.out.println(monkey.toString());
        
        // AidBag Class
        AidBag aidBag = new AidBag();
        aidBag.setItemType("AidBag");
        aidBag.setUsed(true);
        System.out.println(aidBag.toString());
    }
    
    private static void EdwardWhiteTests() {
        
    }
    
    private static void GroupAssignmentTests() {
        Player playerOne = new Player();
        
        playerOne.setCharacterName("Mr Bob");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
    public static void main(String[] args) {
        AnnLloydTests();
        RyanFunderburkTests();
        EdwardWhiteTests();  
        GroupAssignmentTests();
    }
    
}
