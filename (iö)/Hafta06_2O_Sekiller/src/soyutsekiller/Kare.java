package soyutsekiller;

/**
 *
 * @author vozturk
 */
public class Kare extends AbstractSekil {

    int kenar;

    public Kare(int kenar) {
        super("KARE");
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return Math.pow(kenar, 2); // kenar*kenar;
    }

    @Override
    public double cevreHesapla() {
        return kenar * 4;
    }
}
