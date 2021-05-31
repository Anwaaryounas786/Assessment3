package ass3.mygame2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author Anwaar and Aitzaz
 * @version 2021.05.26
 */

public class RoomCreation {

    private ArrayList<Room> allRoomInGame = new ArrayList();

    private ItemCreation itemCreation;

    /**
     * create room and initialize the room and item
     */
    public RoomCreation() {
        itemCreation = new ItemCreation();
        createRooms();
    }
    
    /**
     * create rooms and give different values to the rooms
     * then define the exist of the rooms
     * add different items into different rooms
     * and add rooms into list
     */
    private void createRooms() {

        Room castle, kitchen, frontGate;

        castle = new Room("castle", "You are at the castle", false);
        kitchen = new Room("kitchen", "The kitchen door has a shape of a heart", false);
        frontGate = new Room("frontGate", "There is a giant ogre", true);
        

        castle.setExit("east", kitchen);
        castle.setExit("south", frontGate);
        frontGate.setExit("north", castle);

        castle.addItemInRoom(itemCreation.getItem("excaliburSword"));
        castle.addItemInRoom(itemCreation.getItem("key"));
        kitchen.addItemInRoom(itemCreation.getItem("frontGateKey"));

        allRoomInGame.add(castle);
        allRoomInGame.add(frontGate);
        allRoomInGame.add(kitchen);

    }

    /**
     * get the details of a specific room from all rooms
     * @param stringRoom the name of room passed by the calling function which needs to find
     * @return the name of room
     */
    public Room getRoom(String stringRoom) {
        Room roomToReturn = null;
        for (Room room : allRoomInGame) {
            if (room.getName().contains(stringRoom)) {
                roomToReturn = room;
            }
        }
        return roomToReturn;
    }
    // Sprint number 5
    /**
     * this function get the details of added rooms and added items into these rooms
     * @return it return the both values into a string
     */
    public String checkitemroom()
    {
        String [] addedrooms;
        addedrooms = null;
        String [] items;
        items = null;
        Room r;
        for(int i=0;i<allRoomInGame.size();i++)
        {
            r=allRoomInGame.get(i);
            addedrooms[i]=r.getName();
            items[i]=r.getAllItems();
        }
        return (Arrays.toString(items)+Arrays.toString(addedrooms));
        
    }
}
