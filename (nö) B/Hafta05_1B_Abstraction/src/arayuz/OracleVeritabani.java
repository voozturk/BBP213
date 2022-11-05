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
public class OracleVeritabani implements IDatabaseArayuzu{
    
    @Override
    public void ekle() {
        System.out.println("ORACLE ile veri eklendi.");
    }

    @Override
    public void sil() {        
        System.out.println("ORACLE ile veri silindi.");    
    }

    @Override
    public void guncelle() {
        System.out.println("ORACLE ile veri güncellendi.");      
    }

    @Override
    public void sorgu() {
        System.out.println("ORACLE ile veri çağırıldı.");      
    
    }
}
