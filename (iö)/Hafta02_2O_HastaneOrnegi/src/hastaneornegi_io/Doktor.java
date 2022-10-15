/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

import java.util.EnumSet;

/**
 *
 * @author vozturk
 */
public class Doktor extends Personel{
    EnumSet<Poliklinik> uzmanlikAlanlari;

    public Doktor() {
        this.uzmanlikAlanlari = EnumSet.noneOf(Poliklinik.class);
    }
    
    
    
    
}
