/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaornek_1a;

/**
 *
 * @author vozturk
 */
public class Musteri extends Kisi{
    
      
    Hesap hesap; 
    
    public Musteri(Kisi kisi, Hesap hesap){
        super(kisi);       
        this.hesap = hesap;
        this.hesap.setMusteri(this);                 
    }

    @Override
    public String toString() {
        return super.ad+" "+super.soyad+" ("+super.kimlikNo+")"; 
    }
    
    
}
