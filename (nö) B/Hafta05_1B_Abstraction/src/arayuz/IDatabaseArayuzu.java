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
public interface IDatabaseArayuzu {

    default public void oturumAc() {
        System.out.println("Login oldu..");
    }

    public void ekle();

    public void sil();

    public void guncelle();

    public void sorgu();

}
