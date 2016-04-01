/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Player;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class PlayerControl {
    public static void addItemToPlayerInventory(Item item) {
        Player player = TheHunt.getCurrentGame().getPlayer();
        switch (item) {
            case AidBag:
                player.setHasAidBag(true);
                player.addItemInventory(item);
                break;
            case Monkey:
                player.setHasMonkey(true);
                player.addItemInventory(item);
                break;
            case OldCellPhone:
                player.setHasOldCellPhone(true);
                player.addItemInventory(item);
                break;
            case ClueBag:
                player.setHasClueBag(true);
                player.addItemInventory(item);
                break;
            case TNT:
                player.setHasTNT(true);
                player.addItemInventory(item);
                break;
        }
    }
}
