/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_nested.anonymous;

/**
 *
 * @author vozturk
 */
public class Kamyon {
    
    int hiz;
    
    public Kamyon(int hiz){
        
        this.hiz = hiz;
    }
    
    public void hizlan(){
        hiz++;
    }
    
    public int getHiz(){
        return hiz;
    }
    
}
