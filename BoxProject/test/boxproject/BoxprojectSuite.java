/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ivanlebanov
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({boxproject.BoxTypeThreeTest.class, boxproject.BoxTypeTwoTest.class, boxproject.BoxFactoryTest.class, boxproject.BoxTypeFourTest.class, boxproject.BoxTypeFiveTest.class, boxproject.base.BaseSuite.class, boxproject.BoxTypeOneTest.class})
public class BoxprojectSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
