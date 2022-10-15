/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

/**
 *
 * @author vozturk
 */
public class Barkod {
    Poliklinik poliklinik;
    Hasta hasta;
    Recete recete;
    KayitDurumu kayitDurumu;
    int no; 
    
    
    enum KayitDurumu{
        ACIL, RANDEVULU, SEVK
    }
    
    
}
