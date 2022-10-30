/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderDemo;

/**
 *
 * @author vozturk
 */
public class MainBuilder {
    
    public static void main(String[] args) {
//        Laptop laptop = new  Laptop("16gb", "250ssd", true, false);
        Laptop laptop = 
                new Laptop.Builder("16gb", "250ssd")
                        .bluetooth(true)
                        .ekranKarti(false)
                        .build();
        
        System.out.println("Bilgiler: "+laptop.toString());
        
        
    }
    
}
