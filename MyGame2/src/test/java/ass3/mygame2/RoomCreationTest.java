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
public class RoomCreationTest {
    
    RoomCreation c;
    
    public RoomCreationTest() {
        c=new RoomCreation();
    }

    /**
     * Test of checkitemroom method, of class RoomCreation.
     */
    @Test
    public void testCheckitemroom() {
        String expected=null;
        String actual=c.checkitemroom();
        System.out.println(actual);
    }
    
}
