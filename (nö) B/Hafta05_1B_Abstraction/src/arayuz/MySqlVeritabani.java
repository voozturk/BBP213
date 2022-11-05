/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayuz;

/**
 *
 * @author vozturk
 */
public class MySqlVeritabani implements IDatabaseArayuzu{

    @Override
    public void ekle() {
        System.out.println("MYSQL ile veri eklendi.");
    }

    @Override
    public void sil() {        
        System.out.println("MYSQL ile veri silindi.");    
    }

    @Override
    public void guncelle() {
        System.out.println("MYSQL ile veri güncellendi.");      
    }

    @Override
    public void sorgu() {
        System.out.println("MYSQL ile veri çağırıldı.");      
    
    }
    
    
    
    
}
