/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_.database.entity;

import com.sun.istack.internal.NotNull;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vozturk
 */
public class Hesap extends Entity{

    
    
    enum Field{
        ID("id"), 
        NAME("name"), 
        BANK_NAME("bankName"), 
        BALANCE("balance");
        
        private final String name;
        private Field(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    
    int id ; 
    String name;
    String bankName; 
    int balance; 
    
    public Hesap(String name,
                    String bankName, 
                    int balance){
        this.id=-1;
        this.name = name; 
        this.bankName = bankName;
        this.balance =balance;  
        
        getEntities().put(Field.NAME.getName(), name);
        getEntities().put(Field.BANK_NAME.getName(), bankName);
        getEntities().put(Field.BALANCE.getName(), balance);
    }
    
    @NotNull
    public Object getValue(@NotNull Field field){
        switch(field){
            case ID:
                return this.id;
            case NAME:
                return this.name;
            case BANK_NAME:
                return this.bankName;
            case BALANCE: 
                return this.balance;
        }
        throw new RuntimeException("İstenen field için veri bulunamadı.");
    }
    
    public Hesap(ResultSet result) throws SQLException {
        this.id = result.getInt(Field.ID.getName());
        this.name = result.getString(Field.NAME.getName());
        this.bankName = result.getString(Field.BANK_NAME.getName());
        this.balance = result.getInt(Field.BALANCE.getName());
    } 
    
}
