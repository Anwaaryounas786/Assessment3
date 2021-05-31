package ass3.mygame2;


import java.util.ArrayList;


/**
 * This class create item inventory for player
 * it add and remove items from inventory
 * and it also return the items of a player when it is called
 * it creates a string of inventory items and return it into calling function 
 * @author Anwaar and Aitzaz
 * @version 2021.05.26
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
    
    // create player inventory and initialize the player inventory
    public Player()
    {
        playerItem = new ArrayList();
    }
    
    /**
     * add item into player inventory
     * @param item to process the item and add into inventory
     * also display the add message
     */
    public void addItemInventory(Item item){

        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        //System.out.println(item.getDescription() + " was removed from the room"); // add extra information to inform user that the item has been taken
    }

    /**
     * remove item from inventory
     * @param item to process the item and add into inventory
     * also display the remove message
     */
    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    /**
     * to get the specific item from the list
     * @param stringItem passing item from the calling function
     * @return after processing the name of item
     */
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    /**
     * print the name of all items from inventory
     * @return items in the form of string
     */
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }
    
    // Sprint number 3
    /**
     * check the redundancy of an item in list 
     * @param item check this item is it in the list or not
     * @return return the number how many times an item repeat in the list
     */

    public int checkinventory(Item item)
    {
        int repeat=0;
        for(int i=0; i<playerItem.size();i++){
            if(playerItem.get(i)==item)
            {
                repeat++;
            }
        }
        return repeat;
    }
            
}
