/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_2o_unittest;

/**
 *
 * @author vozturk
 */
public class Islem {

    
    
    
    public String isminIlkHarfleriniGetir(String isim, int sayi){
        return isim.substring(0, sayi);
    }
    
    public String isminSonHarfleriniGetir(String isim, int sayi){
        return isim.substring(sayi);
    }
    
}
