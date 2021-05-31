package ass3.mygame2;

import java.util.ArrayList;


/**
 * This class holds the information about items creation
 * Item creation create items and put it into game
 * it also process the list of items in game.
 *
 * @author Anwaar and Aitzaz
 * @version 2021.05.26
 */
public class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    /**
     * Create items and initialize it
     */
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    
    /**
     * Create new items and add into the game
     */
    public void createItems(){
        
        Item item1, item2, excaliburSword, key, frontGateKey; // create items
        
        // define the items
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        // add items into game item list
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
    }
   /**
    * process the item list and get the name of item if it matches with the passing item name
    * @param stringItem name of item pass by the calling function and match it with item list
    * @return the name of item
    */
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
  
    // Sprint number 2
    /**
     * @return the name of all added items into list in the form of string
     */
    public String alladdeditems()
    {
        String i = null;
        for(Item item:allItemsInGame)
        {
            i+=" "+item.getName();
        }
        return i;
    }
}
