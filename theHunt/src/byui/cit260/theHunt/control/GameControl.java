/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

/*import static byui.cit260.theHunt.control.MapControl.assignClueBagToLocation;*/
import static byui.cit260.theHunt.control.MapControl.assignPlayerToLocation;
import byui.cit260.theHunt.exceptions.GameControlException;
import byui.cit260.theHunt.exceptions.MapControlException;
/*import byui.cit260.theHunt.model.ClueBag;*/
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Item;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Question;
import byui.cit260.theHunt.view.ErrorView;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
public class GameControl {
    
    protected static final PrintWriter console = TheHunt.getOutFile();

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setCharacterName(name);
        
        return player;
    }
    
    public static void createNewGame() {
        Game game = new Game();  // Create new game
        TheHunt.setCurrentGame(game); // Save in TheHunt
        
        Player player = TheHunt.getPlayer();
        game.setPlayer(player); // save player in game
        
/*        ClueBag cluebag =ClueBag.ClueBag;

        Item[] items = ItemControl.createItems();
        game.setItems(items);*/
        
       
        // Create a list of the different questions in the game
        ArrayList<Question> questions = QuestionControl.createQuestions();
        game.setQuestions(questions);
        
        
        Map map = MapControl.createMap(); // Create and initialize new map
        game.setMap(map);
        
        Point coordinates = new Point(1,1);  // Set default starting location
        try {
            assignPlayerToLocation(player, coordinates); // Assign Player to location 1,1
            /*assignClueBagToLocation(cluebag, coordinates); // Assign ClubBag to location 1,1*/
        } 
        catch (MapControlException e)
        {
            ErrorView.display("GameControl", e.getMessage());
        }
        console.println("You are currently at map location (1,1)"
                        +"\nClue Bag is currently located at (1,1), "
                        +"\npick up the bag so you can hold future items and clues");
        
        
    }

    public static void saveGame(Game game, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject(); // read the game object from the file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        TheHunt.setCurrentGame(game);
    }
    
    
}
