/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasitornek_1b;

import java.util.Objects;

/**
 *
 * @author vozturk
 */
public class Kisi {    
    String ad;
    String soyad; 
    int yas;
    Cinsiyet cinsiyet; 
    
    enum Cinsiyet{
        ERKEK, KADIN;
    };

    public Kisi(String ad, String soyad, int yas, Cinsiyet cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }
    
    public Kisi(Kisi k){
        this.ad = k.ad;
        this.soyad = k.soyad;
        this.yas = k.yas;
        this.cinsiyet = k.cinsiyet;        
    }
    
    
    
    

    @Override
    public String toString() {
        return ad+" "+soyad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ad);
        hash = 53 * hash + Objects.hashCode(this.soyad);
        hash = 53 * hash + this.yas;
        hash = 53 * hash + Objects.hashCode(this.cinsiyet);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kisi other = (Kisi) obj;
        if (this.yas != other.yas) {
            return false;
        }
        if (!Objects.equals(this.ad, other.ad)) {
            return false;
        }
        if (!Objects.equals(this.soyad, other.soyad)) {
            return false;
        }
        if (this.cinsiyet != other.cinsiyet) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    
    
}
