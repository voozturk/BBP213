/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vozturk
 */
public class Hastane {

     private EnumSet<Poliklinik> poliklinikler;
     private String ad;
     private int odaSayisi;

    private HashSet<Personel> personeller;

    public Hastane(String ad, int odaSayisi) {
        this.ad = ad;
        this.odaSayisi = odaSayisi;
        this.personeller = new HashSet<>();
        this.poliklinikler = EnumSet.noneOf(Poliklinik.class);
        
    }

    public Hastane(String ad, int odaSayisi, Poliklinik ... poliklinikler) {
        this(ad, odaSayisi);
        for(Poliklinik   p : poliklinikler){
            this.poliklinikler.add(p);
        } 
    }  
    
    public void personelEkle(Personel eklenecekPersonel){
        this.personeller.add(eklenecekPersonel);
    }
    
    public void personelCikar(Personel cikarilacakPersonel){
//        this.personeller.remove(cikarilacakPersonel);
        // veya
        Iterator iterator = personeller.iterator();
        while(iterator.hasNext()){
            Personel p =(Personel)iterator.next();
            if(p.equals(cikarilacakPersonel)){
                iterator.remove();
            }
        }
        
    }

    /**
     * @return the poliklinikler
     */
    public EnumSet<Poliklinik> getPoliklinikler() {
        return poliklinikler;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @return the odaSayisi
     */
    public int getOdaSayisi() {
        return odaSayisi;
    }

    /**
     * @return the personeller
     */
    public HashSet<Personel> getPersoneller() {
        return personeller;
    }
    

}
