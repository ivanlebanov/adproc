/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import boxproject.base.CardBox;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BoxFactoryTest {
    
    public BoxFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBox method, of class BoxFactory.
     */
    @Test
    public void testGetBox() {
        System.out.println("getBox");
        float width = 0.0F;
        float height = 0.0F;
        float length = 0.0F;
        boolean sealableTop = false;
        int tints = 0;
        boolean hasReinforcedBottom = false;
        boolean hasReinforcedCorners = false;
        int grade = 0;
        CardBox expResult = null;
   
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        CardBox result = BoxFactory.getBox(width, height, length, sealableTop, tints, hasReinforcedBottom, hasReinforcedCorners, grade);
        assertEquals(result,null);
   
        width = 1;
        height = 1;
        length = 1;
        grade = 1;
        CardBox result2 = BoxFactory.getBox(width, height, length, sealableTop, tints, hasReinforcedBottom, hasReinforcedCorners, grade);
        Class cls = result2.getClass();
        assertEquals(BoxTypeOne.class, cls);
        
        CardBox result3 = BoxFactory.getBox(-1, -1, -1, true, 1, true, false, 0);
        assertEquals(result3,null);
        
        CardBox result4 = BoxFactory.getBox(-100, 1, 1, true, 1, true, false, 0);
        assertEquals(result4,null);
    }
    
    
}
