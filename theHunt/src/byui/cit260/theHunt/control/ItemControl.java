/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Constants;
import byui.cit260.theHunt.model.Item;
import java.util.Arrays;

/**
 *
 * @author Ann
 */
public class ItemControl {
    
    public static Item[] createItems() {
        // created array(list) of items
        Item[] item = new Item[Constants.NUMBER_OF_ITEMS];
        
        Item clueBag = Item.ClueBag;
        clueBag.setDescription("Clue Bag");
        clueBag.setQuantityInStock(0);
        clueBag.setRequiredAmount(0);
        item[Item.ClueBag.ordinal()] = clueBag;
        
        Item monkey = Item.Monkey;
        monkey.setDescription("Monkey");
        monkey.setQuantityInStock(0);
        monkey.setRequiredAmount(0);
        item[Item.Monkey.ordinal()] = monkey;
        
        Item oldCellPhone = Item.OldCellPhone;
        oldCellPhone.setDescription("Old Cell Phone");
        oldCellPhone.setQuantityInStock(0);
        oldCellPhone.setRequiredAmount(0);
        item[Item.OldCellPhone.ordinal()] = oldCellPhone;
        
        Item aidBag = Item.AidBag;
        aidBag.setDescription("Aid Bag");
        aidBag.setQuantityInStock(0);
        aidBag.setRequiredAmount(0);
        item[Item.AidBag.ordinal()] = aidBag;

        Item tnt = Item.TNT;
        tnt.setDescription("TNT");
        tnt.setQuantityInStock(0);
        tnt.setRequiredAmount(0);
        item[Item.TNT.ordinal()] = tnt;
        
        return item;
    }
        
    public static void main (String[] args) {

     
     String[] item = new String[5] ;
     
     item[0] = "Clue Bag";
     item[1] = "TNT";
     item[2] = "Old Cell Phone";
     item[3] = "Monkey";
     item[4] = "Aid Bag";
    
      for(int i = 0; i < item.length; i++) {
          Arrays.sort(item);
                 System.out.print( "\n"+item[i]);
                       
          
      }
      
   
      }
}
