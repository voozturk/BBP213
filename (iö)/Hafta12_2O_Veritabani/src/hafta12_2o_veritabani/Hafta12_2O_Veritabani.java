/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_2o_veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class Hafta12_2O_Veritabani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\db\\Cuzdan.db";

        try {
            Connection baglanti = DriverManager.getConnection(url);
            Statement sorguNesnesi = baglanti.createStatement();
            
            
            ResultSet sonuc = sorguNesnesi.executeQuery("Select * From Kullanicilar");
            
            List<Kullanici> kullanicilar= new ArrayList<>();
            
            while(sonuc.next()){
                Kullanici k = new Kullanici(sonuc);
                System.out.println(k);
                kullanicilar.add(k);
                
//                System.out.print(sonuc.getInt("id"));
//                System.out.print(sonuc.getString("ad"));
//                System.out.print(sonuc.getString("soyad"));
//                System.out.print(sonuc.getInt("yas"));
//                System.out.println(sonuc.getInt("borc"));
            }
            
            for(Kullanici vatandas :kullanicilar)
                System.out.println("****** "+vatandas.toString());
            
            
//            int etkilenenSatirSayisi = sorguNesnesi.executeUpdate("insert into Kullanicilar(id, ad, soyad, yas, borc) values(85, 'berkant', 'ahmadi',85, 99999999999)");
            
//            System.out.println("etkilenen satır = "+etkilenenSatirSayisi);
            
        

            PreparedStatement hazirYasaGoreUpdate = baglanti.prepareStatement("update Kullanicilar set borc=borc*2 where yas<? and ad like ?");
            
            hazirYasaGoreUpdate.setInt(1, 20);
            hazirYasaGoreUpdate.setString(2, "%e%");
            hazirYasaGoreUpdate.execute();
            
            
            PreparedStatement istenenVerilerYasaGore  = baglanti.prepareStatement("Select * From Kullanicilar where (yas>=? and yas<=?) or order by yas");
            
            istenenVerilerYasaGore.setInt(1, 20);
            istenenVerilerYasaGore.setInt(2, 30);
            istenenVerilerYasaGore.execute();
            
            ResultSet sonuc2 = istenenVerilerYasaGore.getResultSet();
            
            System.out.println("\n\n === Sonuç2 ==== ");
            while(sonuc2.next()){
                System.out.println(new Kullanici(sonuc2));
            }
            
            
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
