/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import static byui.cit260.theHunt.model.Item.AidBag;
import static byui.cit260.theHunt.model.Item.ClueBag;
import static byui.cit260.theHunt.model.Item.Monkey;
import static byui.cit260.theHunt.model.Item.OldCellPhone;
import static byui.cit260.theHunt.model.Item.TNT;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Question;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class ItemControl {

    protected static final PrintWriter console = TheHunt.getOutFile();
    
    public static Item[] createItems() {
        // created array(list) of items
        Item[] item = new Item[Constants.NUMBER_OF_ITEMS];
        
        Item clueBag = Item.ClueBag;
        clueBag.setDescription("Clue Bag");
        item[Item.ClueBag.ordinal()] = clueBag;
        
        Item monkey = Item.Monkey;
        monkey.setDescription("Monkey");
        item[Item.Monkey.ordinal()] = monkey;
        
        Item oldCellPhone = Item.OldCellPhone;
        oldCellPhone.setDescription("Old Cell Phone");
        item[Item.OldCellPhone.ordinal()] = oldCellPhone;
        
        Item aidBag = Item.AidBag;
        aidBag.setDescription("Aid Bag");
        item[Item.AidBag.ordinal()] = aidBag;

        Item tnt = Item.TNT;
        tnt.setDescription("TNT");
        item[Item.TNT.ordinal()] = tnt;
        
        return item;
    }
    
    /*public Item[] doAction(Item[] item){

             item[0] = Item.ClueBag;
             item[1] = Item.Monkey;
             item[2] = Item.OldCellPhone;
             item[3] = Item.AidBag;
             item[4] = Item.TNT;
              for(int i = 0; i < item.length; i++) {
                Arrays.sort(item);
                 this.console.println( "\n"+item[i]);
              }
              return item;
    }*/


    /*public static ItemControl getItemControl() {
      ItemControl item =  new ItemControl(); 
     return item;
    }*/

    public static boolean useTNT() {
        Game game = TheHunt.getCurrentGame();
        Question question = game.getPlayer().getLocation().getQuestion();
        question.setAnswered(true);
        Player player = game.getPlayer();
        player.setHasTNT(false);
        player.getItemInventory().remove(TNT);
        return question.isAnswered();
    }

    public static boolean dropTNT() {
        Game game = TheHunt.getCurrentGame();
        Player player = game.getPlayer();
        player.setHasTNT(false);
        player.getItemInventory().remove(TNT);
        return !player.isHasTNT();
    }

    public static boolean dropOldCellPhone() {
        Game game = TheHunt.getCurrentGame();
        Player player = game.getPlayer();
        player.setHasOldCellPhone(false);
        player.getItemInventory().remove(OldCellPhone);
        return !player.isHasOldCellPhone();
    }

    public static boolean useOldCellPhone() {
        Game game = TheHunt.getCurrentGame();
        Question question =game.getPlayer().getLocation().getQuestion();
        question.setAnswered(true);
        Player player = game.getPlayer();
        player.setHasOldCellPhone(false);
        player.getItemInventory().remove(OldCellPhone);
        return question.isAnswered();

        
    }

}
