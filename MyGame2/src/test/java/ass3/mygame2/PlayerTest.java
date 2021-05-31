/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Irfan Ilyas
 */
public class PlayerTest {
    Player p;
    Item item1;
    public PlayerTest() {
        p=new Player();
        item1=new Item("Item test","This is a test",100);
    }

    /**
     * Test of check inventory method, of class Player.
     */
    @Test
    public void testCheckinventory() {
        p.addItemInventory(item1);
        int expected=1;
        int actual=p.checkinventory(item1);
        assertEquals(expected,actual);
    }
    
}
