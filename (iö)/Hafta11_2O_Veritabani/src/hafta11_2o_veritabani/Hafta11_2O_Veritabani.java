/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta11_2o_veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vozturk
 */
public class Hafta11_2O_Veritabani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vtYolu = System.getProperty("user.dir")+"\\db\\Okul.db";
        
        System.out.println("Veritabanı dosya yolu = "+vtYolu);
        
        String baglantiCumlesi = "jdbc:sqlite:"+vtYolu;
        
        try { 
            Connection baglanti = DriverManager.getConnection(baglantiCumlesi);
        
            Statement sorguIfadesi = baglanti.createStatement();
            
            // select 
            ResultSet sonuc = sorguIfadesi.executeQuery("Select * From Ogrenci where id>2"); 
            while(sonuc.next()){
                int id= sonuc.getInt("id"); 
                String ad = sonuc.getString("ad"); 
                String soyad = sonuc.getString("soyad");                 
                System.out.println("Veri: id="+id+" \t ad="+ad+" \t soyad="+soyad);
            }
            
            // insert 
            sorguIfadesi.executeUpdate("Insert into Ogrenci(ad, soyad) values('volkan','öztürk')");
            
            // delete
            sorguIfadesi.executeUpdate("delete from Ogrenci where ad='volkan'");
            
            // update
            sorguIfadesi.executeUpdate("update Ogrenci set id=99 where ad='arda'");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Logger.getLogger(Hafta11_2O_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
