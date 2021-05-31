package ass3.mygame2;

import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * This class describe different features of a room
 * it define the room direction, is it locked or not, where is the exit for the room
 * it also return the list of items in room, all items 
 * and room description to the calling function
 * 
 * @author  Anwaar and Aitzaz
 * @version 2021.05.26
 */

public class Room 
{
    private String description;
    private String name;
    private boolean isLocked;
    private HashMap<String, Room> exits;        // stores exits of this room.
    private ArrayList<Item> roomItem;
    private HashMap<Room, Item> roomHashMapItem;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String name, String description, boolean isLocked) 
    {
        this.description = description;
        this.name = name;
        this.isLocked = isLocked;
        exits = new HashMap<>();
        roomItem = new ArrayList();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     * You are in the kitchen.
     * Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString() + ".\n" + getAllItems();
    }

    /**
     * get the name of all items in the room
     * @return the name in the form of string
     */
    public String getAllItems(){

        return "You have some " + listOfItems();

    }

    /**
     * process the list and get all items
     * @return return the item in from of string
     */
    private String listOfItems(){

        String returnString = "items:";
        for(Item item : roomItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }

    /**
     * Method getRoomItem
     *
     * @param stringItem taken from the command which was converted into a String
     * @return Item class according to the input String
     */
    public Item getRoomItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: roomItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    /**
     * calls the add function to add item into room 
     * @param item item passed by the calling function to add it into list
     */
    public void addItemInRoom(Item item){
        roomItem.add(item);
    }

    /**
     * remove item from room by calling remove function
     * @param item name of item which needs to remove
     */
    public void removeItemInRoom(Item item){
        if(roomItem.size() > 0){
            roomItem.remove(item);
        }
    }

    /**
     * to add the map of room and define where is the exist of room
     * @param room which room needs to put
     * @param item which item needs to put
     */
    public void addHashMapItemInRoom(Room room, Item item){
        roomHashMapItem.put(room, item);
    }

    /**
     * Method getLockedStatus
     *
     * @return The return value
     */

    public boolean getLockedStatus(){
        return isLocked;
    }

    /**
     * to set the lock status of room
     * @param newStatus lock the room if value is true
     */
    public void setLockedStatus(boolean newStatus){
        isLocked = newStatus;
    }
     /**
      * get the name of room
      * @return the name
      */
    public String getName(){
        return name;
    }
    // Sprint number 4
    /**
     * it return the type of room according to the items
     * so before putting a new item it can be easily to check the room type
     * and easy to manage and know the items
     * @return the string name of room and what kind of space it has
     */
    public String roomtype()
    { 
        String roomtype;
        int i=0;
        for(Item item : roomItem){
               i++;         
        }
        if(i>5)
        {
            roomtype="large space";
        }
        else
        {
            roomtype="small space";
        }
        return roomtype;
    }
}

