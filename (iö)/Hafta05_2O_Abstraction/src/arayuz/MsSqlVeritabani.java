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
public class MsSqlVeritabani implements IVeritabaniArayuzu{
    @Override
    public void ekle() {
        System.out.println("MsSql ile ekleme yapıldı");
    }

    @Override
    public void sil() {
        System.out.println("MsSql ile silme işlemi yapıldı");
    }

    @Override
    public void guncelle() {
        System.out.println("MsSql ile güncelleme işlemi yapıldı");
    }

    @Override
    public void sorgu() {
        System.out.println("MsSql ile sorgu çalıştırıldı.");
    }
}
