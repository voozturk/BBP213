/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_2o_unittest;

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
public class IslemTest {

    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("sınıf için ön ayarlamalar yapıldı. BeforeClass ");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Sınıfın tüm testleri bitti son işlemler yapılıyor.... AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Test metodu için Before çalıştı. ");
    }
    
    @After
    public void tearDown() {
        System.out.println("Test metodu için After çalıştı. ");
    }

    @Test
    public void testIsminIlkHarfleriniGetir() {
        System.out.println("isminIlkHarfleriniGetir() metodu test ediliyor..");
        String isim = "emir";
        int sayi = 1;
        
        Islem ornek = new Islem();
        String beklenen = "e";
        
        
        String sonuc = ornek.isminIlkHarfleriniGetir(isim, sayi);
        assertEquals(beklenen, sonuc);
    }
    @Test
    public void testIsminIlkHarfleriniGetir2() {
        System.out.println("isminIlkHarfleriniGetir2() metodu test ediliyor..");
        String isim = "Berkant";
        int sayi = 3;
        
        Islem ornek = new Islem();
        String beklenen = "be*";
        
        
        String sonuc = ornek.isminIlkHarfleriniGetir(isim, sayi);
        assertEquals(beklenen, sonuc);
    }
    
}
