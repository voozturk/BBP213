/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutSinif;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Kurt kurt = new Kurt();
//        Kaplan kaplan = new Kaplan();
        AbstractHayvan hayvan1 = new Kurt();
        AbstractHayvan hayvan2 = new Kaplan();
        
        hayvan1.sesCikar();
        hayvan2.sesCikar();        
        
        hayvan1.beslen();
        hayvan2.beslen();   
        
    }    
}
