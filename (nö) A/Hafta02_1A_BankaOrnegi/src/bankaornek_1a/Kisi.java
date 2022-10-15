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
public class Kisi {
    
    String ad; 
    String soyad;
    String kimlikNo;
    String date;

    public Kisi(String ad, String soyad, String kimlikNo, String date) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.date = date;
    }
    
    public Kisi(Kisi kisi){
        this.ad = kisi.ad;
        this.soyad = kisi.soyad;
        this.kimlikNo = kisi.kimlikNo;
        this.date = kisi.date;
    }
    
}
