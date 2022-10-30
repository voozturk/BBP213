/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1a_upcastingdemo;

/**
 *
 * @author vozturk
 */
public class Araba extends Arac{
    
    
    @Override
    public void calistir(){
        System.out.println("Araba sürülüyor...");
    }
    
    public void hizlan(){
        System.out.println("Araba hizlandi!!");
    }
    
}
