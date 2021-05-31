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
 * @author Anwaar
 */
public class ItemTest {
    
    Item item,item1;
    public ItemTest() {
        item=new Item("Item test","This is a test",100.0);
        item1=new Item("Item test","This is a test",100);
    }
    /**
     * Test of gethPower method, of class Item.
     */
    @Test
    public void testGethPower() {
        double expected=100.0;
        double actual=item.gethPower();
        assertEquals(expected,actual);
    }

    /**
     * Test of getdPower method, of class Item.
     */
    @Test
    public void testGetdPower() {
        int expected=100;
        int actual=item1.getdPower();
        assertEquals(expected,actual);
    }
    
}
