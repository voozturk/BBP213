/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hafta12_1a_unittest.MatematikselIslemler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vozturk
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    
    @Test
    public void testToplaBirsey(){
        // given
        int a=15, b=80;
        
        
        // when 
        //// beklenen // expected
        double beklenen= 80;
        
        
        MatematikselIslemler islem = new MatematikselIslemler(a, b);
        
        // actual
        double sonuc = islem.topla();
        
        
        
        //then
        assertEquals(beklenen, sonuc, 0.0);
        
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
