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
public class Main {
    
    public static void main(String[] args) {
        
        MysqlDatabase mysql_db = new MysqlDatabase();
        OracleDatabase oracle_db = new OracleDatabase();
        
        DatabaseManager vekilDatabse = new DatabaseManager(oracle_db);
        
        vekilDatabse.ekle();
        vekilDatabse.sil();
        vekilDatabse.guncelle();
        vekilDatabse.sorgu();
        
        
        
        
    }
    
    
}
