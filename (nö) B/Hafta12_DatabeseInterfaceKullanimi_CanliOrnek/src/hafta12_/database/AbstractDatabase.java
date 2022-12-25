/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vozturk
 */
public abstract class AbstractDatabase implements IDatabase{    
    protected Connection connection;
    protected Statement statement;   
    
    public abstract boolean connect() throws SQLException;
    public abstract boolean close() throws SQLException;
    
    public void createStatement() throws SQLException{        
        statement = connection.createStatement(); 
    }
}
