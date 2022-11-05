/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutsinif;

/**
 *
 * @author vozturk
 */
public abstract class AbstractHayvan {
    String sesDosyasi;
    
    Ses ses;
    public void sesiAyarla(String sesDosyasi){
        this.sesDosyasi = sesDosyasi;
        ses = new Ses(sesDosyasi);
    }
    
    
    public abstract void sesCikar();
    
    
}
