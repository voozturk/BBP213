/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutsinif;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractHayvan hayvan1 = new Kartal();
        AbstractHayvan hayvan2 = new Aslan();
        
        hayvan1.sesCikar();
        hayvan2.sesCikar();
        
    }
    
}
