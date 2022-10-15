/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta01_2o_hatirlatma;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class Ogrenci extends Insan {
    public enum OgrTuru{
        NORMAL_OGRETIM(40), 
        IKINCI_OGRETIM(30);

        final int DERS_SURESI;
        
        private OgrTuru(final int DERS_SURESI) {
            this.DERS_SURESI = DERS_SURESI;
        }
        
        public int toplamKacaSaatEder(int kacSaat){
            return kacSaat*DERS_SURESI;
        }
        
        
        
    };
    
    OgrTuru ogrt; 
    List<Ders> dersler; 
    
    public Ogrenci(String isim, OgrTuru ogrt){
        super(isim);
        this.ogrt=ogrt;
        
        dersler = new ArrayList<>();
        
        dersler.add(new Ders("NTP", "bbp213", 3));
        dersler.add(new Ders("NTP2", "bbp218", 4));
        
        
    }
    
    public int kacDakikaDersinVar(){
        int toplamDakika=0; 
        
        for(Ders drs : dersler){
            toplamDakika += ogrt.toplamKacaSaatEder(drs.getDersSaati()); 
        }
        
        return toplamDakika;
    }
    
    
    
}
