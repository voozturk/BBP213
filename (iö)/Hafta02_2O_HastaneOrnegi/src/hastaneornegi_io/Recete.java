/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

import java.util.List;

/**
 *
 * @author vozturk
 */
public class Recete {
    
    // attribute
    // enum (sadece tipler var ise)
    // constructor
    // methods
    // enum (methodlar vs var ise)
    // inner class
    
    List<Ilac> ilaclar;
    
    static class Ilac{
        Tur tur;
        String ad;
        Kullanim acTokDurum;
        
        enum Tur{
            AGRI_KESICI, ANTIBIYOTIK, VITAMIN
        }
        enum Kullanim{ AC, TOK }    
    }
    
    
    
}
