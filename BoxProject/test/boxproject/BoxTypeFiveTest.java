/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BoxTypeFiveTest {
    
    public BoxTypeFiveTest() {
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
     * Test of getPrice method, of class BoxTypeFive.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BoxTypeFive instance = new BoxTypeFive(1.1f,1.9f,3, false, 5 );
        BigDecimal expResult = new BigDecimal(43.47);
        BigDecimal result = instance.getPrice();
        assertEquals(expResult.setScale(2, RoundingMode.HALF_UP), result.setScale(2, RoundingMode.HALF_UP));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class BoxTypeFive.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BoxTypeFive instance = new BoxTypeFive(1,2,3, false, 5 );
        String expResult = "Box Type 5";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
