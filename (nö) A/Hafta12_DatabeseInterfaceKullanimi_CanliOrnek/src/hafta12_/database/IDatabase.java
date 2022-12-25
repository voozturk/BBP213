/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vozturk
 */
interface IDatabase extends QueryExecuter{
    public int add(String query) throws SQLException;
    public int delete(String query) throws SQLException;
    public int update(String query) throws SQLException; 
    public ResultSet query(String query) throws SQLException;
}
