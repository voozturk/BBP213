/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database;

import hafta12_.database.entity.Entity;

/**
 *
 * @author vozturk
 */
public interface QueryExecuter {
    public enum Process{
        QUERY, DELETE, UPDATE, INSERT;
    }    
    String createAddQuery(Entity values);
    String createDeleteQuery(Entity values);
    String createUpdateQuery(Entity ruleValues, Entity manipulateValues);
}
