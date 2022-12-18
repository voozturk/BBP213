/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta11_1b_veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static class Kisi{
        String ad;
        String soyad; 

        public Kisi(ResultSet sonuc) throws SQLException{
            this.ad = sonuc.getString("adi");
            this.soyad = sonuc.getString("soyadi");
        }

        @Override
        public String toString() {
            return "=======>>>>>Kisi{" + "ad=" + ad + ", soyad=" + soyad + '}';
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        String dbPath = System.getProperty("user.dir")+"\\db\\Vatansdas.db";
       
        
        String  baglantiCumlesi = "jdbc:sqlite:"+dbPath;
        
        try {
            Connection baglanti = DriverManager.getConnection(baglantiCumlesi);
            
            Statement komutgonderici = baglanti.createStatement();
//            komutgonderici.executeUpdate("insert into Kisi(adi, soyadi, yas) values('cem','sözer','24')");
//            komutgonderici.executeUpdate("insert into Kisi(adi, soyadi, yas) values('süleyman','eş','37')");
            
            ResultSet sonuclar = komutgonderici.executeQuery("select * from Kisi where  yas<25");
            
            while(sonuclar.next()){
                System.out.println(">> Adi ="+sonuclar.getString("adi")+" soyadı="+sonuclar.getString("soyadi") );
            }
            
            
            PreparedStatement tanimliKomutGonderici = baglanti.prepareStatement("UPDATE Kisi SET yas = ? WHERE id >= ?");
            tanimliKomutGonderici.setInt(1, 15);
            tanimliKomutGonderici.setInt(2, 4);
            tanimliKomutGonderici.execute();
            
            
            komutgonderici.execute("select adi, soyadi from Kisi");
            sonuclar = komutgonderici.getResultSet();
            
            System.out.println("güncel durum:\n");
            while(sonuclar.next()){
                System.out.println(new Kisi(sonuclar));
            }
            PreparedStatement idGoreSilici = baglanti.prepareStatement("delete from Kisi where id=(?)");
            
            idGoreSilici.setInt(1, 2);
            idGoreSilici.executeUpdate();            
            
            idGoreSilici.setInt(1, 5);
            idGoreSilici.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
