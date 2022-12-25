

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_2o_veritabani;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vozturk
 */
public class Kullanici {
    
    int id, yas, borc;
    String ad, soyad;
    
    public Kullanici(ResultSet veri) throws SQLException{ 
        this.id = veri.getInt("id");
        this.yas = veri.getInt("yas");
        this.borc = veri.getInt("borc");
        this.ad = veri.getString("ad");
        this.soyad = veri.getString("soyad");
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", yas=" + yas + ", borc=" + borc + ", ad=" + ad + ", soyad=" + soyad + '}';
    }
    
}
