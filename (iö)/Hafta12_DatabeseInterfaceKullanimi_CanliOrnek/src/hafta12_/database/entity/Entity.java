/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database.entity;

import com.sun.istack.internal.NotNull;
import java.util.HashMap;

/**
 *
 * @author vozturk
 */
public abstract class Entity {
    private HashMap<String, Object> entities;    
    public Entity(){
        entities = new HashMap<>(); 
    }    
    
    public Object addValue(String key, Object value){
        return this.entities.put(key, value);
    }
    
    
    public HashMap<String, Object> getEntities(){
        return this.entities;
    }

    @Override
    public String toString() {
        return "Entity{" + "entities=" + entities + '}';
    }
    
    
}
