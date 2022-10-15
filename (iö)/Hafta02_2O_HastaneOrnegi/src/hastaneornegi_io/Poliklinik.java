/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

import java.util.ArrayList;

/**
 *
 * @author vozturk
 */
public enum Poliklinik {
    
    IC_HASTALIKLARI(5),
    BEYIN_VE_SINIR(15),
    COCUK_HASTALIKLARI(6),
    KBB(16),
    FIZIK_TEDAVI(8),
    KALP_HASTALIKLARI(2);   
    
    int kapasite;
    ArrayList<Hasta> hastalar;
    
    private Poliklinik(int kapasite){
        this.kapasite= kapasite; 
        this.hastalar = new ArrayList<>();
    }
    
    public void hastaEkle(){
        
    }
    
    public void hastaTaburcuEt(){
        
    }
    
    
    
    
    
    
}
