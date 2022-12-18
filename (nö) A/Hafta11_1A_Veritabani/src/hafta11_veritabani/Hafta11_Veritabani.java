/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta11_veritabani;

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
public class Hafta11_Veritabani {

    /**
     * @param args the command line arguments
     */
    
    static class Urun{
        int id; 
        String adi; 
        int fiyat; 
        
        public Urun(ResultSet sonuc) throws SQLException{
            this.id = sonuc.getInt("id");
            this.adi = sonuc.getString("adi");
            this.fiyat = sonuc.getInt("fiyat");        
        }

        @Override
        public String toString() {
            return "Urun{" + "id=" + id + ", adi=" + adi + ", fiyat=" + fiyat + '}';
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String projeDizini = System.getProperty("user.dir");
        System.out.println(projeDizini);

        String url ="jdbc:sqlite:"+projeDizini+"\\db\\Magaza.db" ;
        Connection baglanti = null ;
        try { 
            baglanti = DriverManager.getConnection(url);
            
            Statement komutGonderici = baglanti.createStatement();  
//            ResultSet sonuc = komutGonderici.executeQuery("Select * From Urun Where fiyat>2");
//            komutGonderici.execute("Select * From Urun Where fiyat>2");
//            ResultSet sonuc = komutGonderici.getResultSet();
            
            PreparedStatement tanimliSorgu = baglanti.prepareStatement("Select * From Urun Where fiyat>?");
            tanimliSorgu.setInt(1, 1);
            
            ResultSet sonuc = tanimliSorgu.executeQuery();
            
            while(sonuc.next()){
                // sonuc.getString("adi");
                System.out.println(new Urun(sonuc));
            }
            
            
            
//            komutGonderici.executeUpdate("INSERT INTO Urun(adi, fiyat) VALUES('kalem',1500)");
            komutGonderici.executeUpdate("DELETE FROM Urun\n" +"      WHERE id = 3;");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Hafta11_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
