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
public class MysqlDatabase implements IDatabaseArayuzu {

    @Override
    public void ekle() {
        System.out.println("Mysql ile eklendi!");
    }

    @Override
    public void sil() {
        System.out.println("Mysql ile silindi!");
    }

    @Override
    public void guncelle() {
        System.out.println("Mysql ile güncellendi!");
    }

    @Override
    public void sorgu() {
        System.out.println("Mysql ile veri alındı!");
    }

}
