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
public class ItemCreationTest {
    ItemCreation create;
    public ItemCreationTest() {
        create=new ItemCreation();
        
    }


    /**
     * Test of all added items method, of class ItemCreation.
     */
    @Test
    public void testAlladdeditems() {
        String expected="null excaliburSword key frontGateKey";
        String actual=create.alladdeditems();
        System.out.println(actual);
        assertEquals(expected,actual);
    }
    
}
