/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_1a_unittest;

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
public class MatematikselIslemlerTest {
    
    MatematikselIslemler ornek;
        
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass çalıştı");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass çalıştı");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before çalıştı");
    }
    
    @After
    public void tearDown() {
        ornek=null;
        System.gc();
        System.out.println("After çalıştı..");
    }
    
    @Test
    public void testTopla_Normal() {
        System.out.println("topla metodu test ediliyor...");
        double x= 25, y=35;
        
        
        ornek = new MatematikselIslemler(x, y);        
        double beklenen = x+y;        
        double cikanSonuc = ornek.topla();       
        
        
        
        assert beklenen == cikanSonuc;
    }
    
    @Test
    public void testTopla_BuyukSayilar() {
        System.out.println("topla metodu test ediliyor...");
        double x= 800, y=300;
        
        MatematikselIslemler ornek = new MatematikselIslemler(x, y);        
        double beklenen = 1100;   
        
        assertEquals(beklenen, ornek.topla(), 0.0);
        
    }
    @Test
    public void testTopla_BuyukSayilar_SiniriGecti() {
        System.out.println("topla metodu test ediliyor...");
        double x= 800, y=600;
        
        MatematikselIslemler ornek = new MatematikselIslemler(x, y);        
        double beklenen = 1400;   
        double sonuc = ornek.topla();
        
        
        
        assertEquals(beklenen, sonuc, 0.0);
        
    }

    /**
     * Test of topla method, of class MatematikselIslemler.
     */
    @Test
    public void testTopla() {
        System.out.println("topla");
        ornek = new MatematikselIslemler(55, 1500);
        
        double expResult = 0.0;
        double result = ornek.topla();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of cikar method, of class MatematikselIslemler.
     */
    @Test
    public void testCikar() {
        System.out.println("cikarma testi calisiyor..");
        ornek = new MatematikselIslemler(180, 30);
        double expResult = 150;
        assertNull(ornek);
//        double result = ornek.cikar();
//        assertEquals(expResult, result, 0.0);
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
    }

}
