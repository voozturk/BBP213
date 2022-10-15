/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaornek_1a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class Banka {
    String adi;
    List<Hesap> hesaplar;
    
    
    public Banka(String adi){
        this.adi = adi;  
        this.hesaplar = new ArrayList<>();
        
    }
    
    public Banka(String adi, Hesap ilkHesap){
        this(adi);
        hesapEkle(ilkHesap);        
    }
    
    
    public Banka(String adi, Hesap ... hesaplar){
        this(adi);          
        for(int i=0; i<hesaplar.length; i++){
            System.out.println(i+". hesap oluşturuldu = "+hesaplar[i]);
            hesapEkle(hesaplar[i]);
        }
    }    
    
    public Banka(String adi, List<Hesap> hesaplar){
        this(adi);
        for(int i=0; i<hesaplar.size(); i++){
            System.out.println(i+". hesap oluşturuldu = "+hesaplar.get(i));
            hesapEkle(hesaplar.get(i));
        }
    }
    
    public void hesapEkle(Hesap hesap){
        this.hesaplar.add(hesap);
        hesap.setBanka(this);
    }
    
    public Hesap getHesap(int indis){
        return hesaplar.get(indis);
    }
    
    public int getHesapSayisi(){
        return hesaplar.size();
    }
    
}
