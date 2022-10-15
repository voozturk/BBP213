/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasitornek_1b;

import tasitornek_1b.Kisi.Cinsiyet;

/**
 *
 * @author vozturk
 */
public class Yolcu extends Kisi{

    public Yolcu(Kisi k) {
        super(k);      
    }
    
    @Override
    public String toString() {
        return super.toString()+" (C:"+super.cinsiyet+", Yaş:"+super.yas+")";
    }
    
    
    
    
    
}
