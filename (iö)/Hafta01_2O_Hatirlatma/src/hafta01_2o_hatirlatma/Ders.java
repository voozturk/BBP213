/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta01_2o_hatirlatma;

/**
 *
 * @author vozturk
 */
public class Ders {
    
    private String adi;
    private String kodu; 
    private int dersSaati; 

    public Ders(String adi, String kodu, int dersSaati) {
        this.adi = adi;
        this.kodu = kodu;
        this.dersSaati = dersSaati;
    }
    
    public String getDersAdi(){
        return this.adi; 
    }
    
    public int getDersSaati(){
        return this.dersSaati;
    }
    
    
    
    
}
