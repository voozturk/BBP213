/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database;

import hafta12_.database.entity.Entity;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class SqliteDb extends AbstractDatabase {

    private final String sqliteFilePath;
    private final String db_connect_url;

    public SqliteDb(String sqliteFilePath) {
        this.sqliteFilePath = sqliteFilePath;
        this.db_connect_url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\vt\\" + sqliteFilePath;
        
        
        
    }
    
    

    
    
    @Override
    public boolean connect() throws SQLException{
        if (super.connection == null) {
            connection = DriverManager.getConnection(db_connect_url);            
        }  
        createStatement();
        return !connection.isClosed();
    }

    @Override
    public boolean close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        return connection.isClosed();
    }

    @Override
    public int add(String query)  throws SQLException {
        System.out.println("query = "+query);
       return statement.executeUpdate(query);       
    }

    @Override
    public int delete(String query)  throws SQLException {
       return statement.executeUpdate(query); 
    }

    @Override
    public int update(String query)  throws SQLException {
         return statement.executeUpdate(query); 
    }

    @Override
    public ResultSet query(String query) throws SQLException  {
         return statement.executeQuery(query);     
    }

    @Override
    public String createAddQuery(Entity e) {
        StringBuilder coloumns = new StringBuilder(); 
        StringBuilder values = new StringBuilder();         
        
        e.getEntities().forEach((k,v)->{
            coloumns.append((coloumns.length()>0?", ":"")+ k);
            values.append((values.length()>0?", ":"")+"'"+v+"'");
        });  
        
        String tableName = e.getClass().getSimpleName();        
        String query = "INSERT into "+tableName+"("+coloumns.toString()+") values("+values+")";
        return query;
    }

    @Override
    public String createDeleteQuery(Entity values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createUpdateQuery(Entity ruleValues, Entity manipulateValues) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
