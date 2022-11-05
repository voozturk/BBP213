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
public class AccessVeritabani implements IDatabaseArayuzu {

    @Override
    public void ekle() {
        System.out.println("Access ile ekleme yapıldı ..");
    }

    @Override
    public void sil() {
        
        System.out.println("Access ile silme yapıldı ..");
    }

    @Override
    public void guncelle() {
        System.out.println("Access ile güncelleme yapıldı ..");
    }

    @Override
    public void sorgu() {
        System.out.println("Access ile veri çağırma yapıldı ..");
    }
    
}
