/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database;

import hafta12_.database.entity.Entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vozturk
 */
public class DatabaseManager{

    AbstractDatabase db; 
    public DatabaseManager(AbstractDatabase db){
        try {
            this.db = db;
            db.connect();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean close(){
        try {
            return db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
    public int add(Entity entity) throws SQLException {
        return db.add(db.createAddQuery(entity));
    }

    
    public int delete(String query) throws SQLException {
        return db.delete(query);
    }

    public int update(String query) throws SQLException {
        return db.update(query);
    }

    public ResultSet query(String query) throws SQLException {
        return db.query(query);
    }
    
}
