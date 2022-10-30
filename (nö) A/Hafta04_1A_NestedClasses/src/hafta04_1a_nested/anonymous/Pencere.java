/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1a_nested.anonymous;

/**
 *
 * @author vozturk
 */
public class Pencere {

    int camSayisi;

    public Pencere(int p) {
        this.camSayisi = p;
    }

    public int getCamSayisi() {
        return camSayisi;
    }

    public void camiAc() {
        System.out.println("Cam açıldı.");
    }

}
