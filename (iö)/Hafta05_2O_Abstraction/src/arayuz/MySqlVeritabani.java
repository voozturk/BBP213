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
public class MySqlVeritabani implements IVeritabaniArayuzu {

    @Override
    public void ekle() {
        System.out.println("Mysql ile ekleme yapıldı");
    }

    @Override
    public void sil() {
        System.out.println("Mysql ile silme işlemi yapıldı");
    }

    @Override
    public void guncelle() {
        System.out.println("Mysql ile güncelleme işlemi yapıldı");
    }

    @Override
    public void sorgu() {
        System.out.println("Mysql ile sorgu çalıştırıldı.");
    }

}
