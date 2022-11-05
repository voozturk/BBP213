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
public class OracleDatabase implements IDatabaseArayuzu {

    @Override
    public void ekle() {
        System.out.println("Oracle ile eklendi!");
    }

    @Override
    public void sil() {
        System.out.println("Oracle ile silindi!");
    }

    @Override
    public void guncelle() {
        System.out.println("Oracle ile güncellendi!");
    }

    @Override
    public void sorgu() {
        System.out.println("Oracle ile veri alındı!");
    }

}
