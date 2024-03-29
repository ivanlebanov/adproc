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


public class BoxTypeOneTest {
    
    public BoxTypeOneTest() {
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
     * Test of getPrice method, of class BoxTypeOne.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BoxTypeOne instance = new BoxTypeOne(1.1f,1.9f,3, false, 5 );
        BigDecimal expResult = new BigDecimal(31.05);
        BigDecimal result = instance.getPrice();
        assertEquals(expResult.setScale(2, RoundingMode.HALF_UP), result.setScale(2, RoundingMode.HALF_UP));
    }

    /**
     * Test of getName method, of class BoxTypeOne.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BoxTypeOne instance = new BoxTypeOne(1f,2f,3f, false, 4 );
        String expResult = "Box Type 1";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}
