/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject.base;

import boxproject.BoxTypeTwo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CardBoxTest {
    
    public CardBoxTest() {
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
     * Test of getName method, of class CardBox.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        String expResult = "Box Type 2";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPrice method, of class CardBox.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        BigDecimal expResult = new BigDecimal(35.09);
        BigDecimal result = instance.getPrice();
        assertEquals(expResult.setScale(2, RoundingMode.HALF_UP), result.setScale(2, RoundingMode.HALF_UP));
    }

    /**
     * Test of getArea method, of class CardBox.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        float expResult = 22.18000030517578F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getGrade method, of class CardBox.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        int expResult = 5;
        int result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWidth method, of class CardBox.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        float expResult = 1.1F;
        float result = instance.getWidth();
        assertEquals(expResult, result, 1.1);
    }

    /**
     * Test of setWidth method, of class CardBox.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        float width = 1.1F;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setWidth(width);
        
        assertEquals(instance.getWidth(), width, 1.1F);
  
    }

    /**
     * Test of getHeight method, of class CardBox.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        float expResult = 1.9F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 1.9);
    }

    /**
     * Test of setHeight method, of class CardBox.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        float height = 2.0F;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setHeight(height);
        assertEquals(instance.getWidth(), height, 2.0F);
    }

    /**
     * Test of getLength method, of class CardBox.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        float expResult = 3.0F;
        float result = instance.getLength();
        assertEquals(expResult, result, 3.0);
    }

    /**
     * Test of setLength method, of class CardBox.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        float length = 2.0F;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setLength(length);
        assertEquals(instance.getLength(), length, 2.0F);
    }

    /**
     * Test of isSealableTop method, of class CardBox.
     */
    @Test
    public void testIsSealableTop() {
        System.out.println("isSealableTop");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        boolean expResult = false;
        boolean result = instance.isSealableTop();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setSealableTop method, of class CardBox.
     */
    @Test
    public void testSetSealableTop() {
        System.out.println("setSealableTop");
        boolean sealableTop = false;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setSealableTop(sealableTop);
        assertEquals(instance.isSealableTop(), sealableTop);
    }

    /**
     * Test of getColourTints method, of class CardBox.
     */
    @Test
    public void testGetColourTints() {
        System.out.println("getColourTints");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        int expResult = 1;
        int result = instance.getColourTints();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColourTints method, of class CardBox.
     */
    @Test
    public void testSetColourTints() {
        System.out.println("setColourTints");
        int colourTints = 2;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setColourTints(colourTints);
        assertEquals(instance.getColourTints(), colourTints, 2);
    }

    /**
     * Test of isHasReinforcedBottom method, of class CardBox.
     */
    @Test
    public void testIsHasReinforcedBottom() {
        System.out.println("isHasReinforcedBottom");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        boolean expResult = false;
        boolean result = instance.isHasReinforcedBottom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHasReinforcedBottom method, of class CardBox.
     */
    @Test
    public void testSetHasReinforcedBottom() {
        System.out.println("setHasReinforcedBottom");
        boolean hasReinforcedBottom = true;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setHasReinforcedBottom(hasReinforcedBottom);
        assertEquals(instance.isHasReinforcedBottom(), hasReinforcedBottom);
    }

    /**
     * Test of isHasReinforcedCorners method, of class CardBox.
     */
    @Test
    public void testIsHasReinforcedCorners() {
        System.out.println("isHasReinforcedCorners");
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        boolean expResult = false;
        boolean result = instance.isHasReinforcedCorners();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHasReinforcedCorners method, of class CardBox.
     */
    @Test
    public void testSetHasReinforcedCorners() {
        System.out.println("setHasReinforcedCorners");
        boolean hasReinforcedCorners = false;
        BoxTypeTwo instance = new BoxTypeTwo(1.1f,1.9f,3, false, 5 );
        instance.setHasReinforcedCorners(hasReinforcedCorners);
        assertEquals(instance.isHasReinforcedCorners(), hasReinforcedCorners);
    }

    public class CardBoxImpl extends CardBox {

        public CardBoxImpl() {
            super(0.0F, 0.0F, 0.0F, false, 0, false, false, 0);
        }

        public String getName() {
            return "";
        }

        public BigDecimal getPrice() {
            return null;
        }
    }
    
}
