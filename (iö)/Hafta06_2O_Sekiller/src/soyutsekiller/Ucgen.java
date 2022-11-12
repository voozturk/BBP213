package soyutsekiller;

/**
 *
 * @author vozturk
 */
public class Ucgen extends AbstractSekil {

    int taban;
    int yukseklik;

    public Ucgen(int taban, int yukseklik) {
        super("ÜÇGEN");
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    @Override
    public double alanHesapla() {
        return (taban * yukseklik) / 2;
    }

    @Override
    public double cevreHesapla() {
        return taban + yukseklik + hipotenus();
    }

    public double hipotenus() {
        return Math.sqrt(Math.pow(taban, 2) + Math.pow(yukseklik, 2));
    }
}
