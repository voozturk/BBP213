/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayuz;

/**
 *
 * @author vozturk
 */
public class Main2 {
    
    
    
    public static void main(String[] args) {
        
        MySqlVeritabani mysqlDB = new MySqlVeritabani(); 
        OracleVeritabani oracleDB = new OracleVeritabani(); 
        AccessVeritabani accessDB = new AccessVeritabani();
        
        VeritabaniYoneticisi veritabani = new VeritabaniYoneticisi(accessDB);
        
        veritabani.oturumAc();
        veritabani.ekle();
        veritabani.sil();
        veritabani.guncelle();
        veritabani.sorgu();
        
        
        
        
        
    }
}
