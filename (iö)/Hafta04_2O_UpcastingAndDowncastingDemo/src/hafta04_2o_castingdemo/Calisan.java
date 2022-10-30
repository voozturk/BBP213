/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_2o_castingdemo;

/**
 *
 * @author vozturk
 */
public class Calisan extends Insan {

    String meslek;

    public Calisan(String meslek) {
        this.meslek = meslek;
    }

    @Override
    public void yemekYe() {
        System.out.println("Çalışan yemek yedi.");
    }

    public void maasAl() {
        System.out.println("Çalışan maaş aldı..");
    }

}
