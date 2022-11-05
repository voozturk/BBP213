package arayuz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vozturk
 */
public interface IVeritabaniArayuzu {
    
    
    public void ekle();
    public void sil();
    public void guncelle();
    public void sorgu();
    
    default public void oturumAc(){
        System.out.println("Oturum açıldı.");
    }
    
    
    
    
        
}
