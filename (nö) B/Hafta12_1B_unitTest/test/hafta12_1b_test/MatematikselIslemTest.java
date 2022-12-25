/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_1b_test;

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
public class MatematikselIslemTest {
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {        
        System.out.println("After");
    }

    /**
     * Test of topla method, of class MatematikselIslem.
     */
    @Test
    public void testTopla() {
        System.out.println("topla metodu test ediliyor");
        int i = 15;
        int j = 20;
        
        MatematikselIslem instance = new MatematikselIslem();
        
        int beklenen = 35;
        int sonuc = instance.topla(i, j);
        
        
        assertEquals(beklenen, sonuc);
    }
    @Test
    public void testToplaNegatif() {
        System.out.println("topla metodu negatif sayılar için test ediliyor");
        int i = -15;
        int j = 20;
        
        MatematikselIslem instance = new MatematikselIslem();
        
        int beklenen = 0;
        int sonuc = instance.topla(i, j);
        
        assertEquals(beklenen, sonuc);
    }
    
}
