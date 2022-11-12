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
public class Ucgen extends AbstractSekil {

    int taban;
    int yukseklik;

    public Ucgen(int taban, int yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    public double hipotenusBul() {

        double hipotenus = Math.sqrt(Math.pow(taban, 2) + Math.pow(yukseklik, 2));

        return hipotenus;
    }

    @Override
    public double alanHesapla() {
        return taban * yukseklik;
    }

    @Override
    public double cevreHesapla() {
        return hipotenusBul() + taban + yukseklik;
    }

    @Override
    public String bilgileriVer() {
        return "Üçgen : { Taban=" + taban + ", Yükseklik=" + yukseklik + ", Hipotenüs=" + hipotenusBul() + " }";
    }

}
