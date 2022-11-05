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
public class OracleVeritabani implements IVeritabaniArayuzu{

    @Override
    public void ekle() {
        System.out.println("Oracle ile ekleme yapıldı");
    }

    @Override
    public void sil() {
        System.out.println("Oracle ile silme işlemi yapıldı");
    }

    @Override
    public void guncelle() {
        System.out.println("Oracle ile güncelleme işlemi yapıldı");
    }

    @Override
    public void sorgu() {
        System.out.println("Oracle ile sorgu çalıştırıldı.");
    }
    
}
