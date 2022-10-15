/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneornegi_io;

import java.util.Objects;

/**
 *
 * @author vozturk
 */
public class Kisi {
    String ad; 
    String soyad;
    String kimlikNo;
    int yas;
    Cinsiyet cinsiyet;
    
    
    enum Cinsiyet{
        ERKEK, KADIN
    };

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ad);
        hash = 79 * hash + Objects.hashCode(this.soyad);
        hash = 79 * hash + Objects.hashCode(this.kimlikNo);
        hash = 79 * hash + this.yas;
        hash = 79 * hash + Objects.hashCode(this.cinsiyet);
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
        if (!Objects.equals(this.kimlikNo, other.kimlikNo)) {
            return false;
        }
        if (this.cinsiyet != other.cinsiyet) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
