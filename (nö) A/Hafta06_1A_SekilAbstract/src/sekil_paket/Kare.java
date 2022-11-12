/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekil_paket;

/**
 *
 * @author vozturk
 */
public class Kare extends AbstractSekil {

    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double cevreHesapla() {
        return kenar * 4;
    }

    @Override
    public double alanHesapla() {
        return Math.pow(kenar, 2);// kenar*kenar; 
    }

    @Override
    public String bilgileriVer() {
        return "Kare : { Kenar=" + kenar + "}";
    }
}
