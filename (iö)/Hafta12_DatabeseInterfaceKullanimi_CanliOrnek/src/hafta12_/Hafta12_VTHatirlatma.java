/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_;

import hafta12_.database.AbstractDatabase;
import hafta12_.database.DatabaseManager;
import hafta12_.database.SqliteDb;
import hafta12_.database.entity.Entity;
import hafta12_.database.entity.Hesap;

/**
 *
 * @author vozturk
 */
public class Hafta12_VTHatirlatma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        AbstractDatabase db = new SqliteDb("Cuzdan.db");
        
        Entity eklenecekHesap = new Hesap("deneme", "bankalar", 100);
        
        DatabaseManager dbm = new DatabaseManager(db);
        dbm.add(eklenecekHesap);
    }
    
}
