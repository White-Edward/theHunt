/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setCharacterName(name);
        
        TheHunt.setPlayer(player); // save the player
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        // System.out.println("\n*** createNewGame stub function called ***");
        Game game = new Game();  // Create new game
        TheHunt.setCurrentGame(game); // Save in TheHunt
        
        game.setPlayer(player); // save player in game

        Item[] items = GameControl.createItems();
        game.setItems(items);
        
        Map map = MapControl.createMap(); // Create and initialize new map
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static Item[] createItems() {
        // created array(list) of items
        Item[] item = new Item[Constants.NUMBER_OF_ITEMS];
        
        Item ClueBag = new Item();
        ClueBag.setDescription("Clue Bag");
        ClueBag.setQuantityInStock(0);
        ClueBag.setRequiredAmount(0);
        item[Item.ClueBag.ordinal()] = ClueBag;
        
        Item Monkey = new Item();
        Monkey.setDescription("Monkey");
        Monkey.setQuantityInStock(0);
        Monkey.setRequiredAmount(0);
        item[Item.Monkey.ordinal()] = Monkey;
        
        Item OldCellPhone = new Item();
        OldCellPhone.setDescription("Old Cell Phone");
        OldCellPhone.setQuantityInStock(0);
        OldCellPhone.setRequiredAmount(0);
        item[Item.OldCellPhone.ordinal()] = OldCellPhone;
        
        Item AidBag = new Item();
        AidBag.setDescription("Aid Bag");
        AidBag.setQuantityInStock(0);
        AidBag.setRequiredAmount(0);
        item[Item.AidBag.ordinal()] = AidBag;

        return inventory;
    }
}
