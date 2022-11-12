package soyutsekiller;

/**
 *
 * @author vozturk
 */
public class Dikdortgen extends AbstractSekil {

    int kenar1, kenar2;

    public Dikdortgen(int kenar1, int kenar2) {
        super("DİKDÖRTGEN");
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public double alanHesapla() {
        return kenar1 * kenar2;
    }

    @Override
    public double cevreHesapla() {
        return (kenar1 + kenar2) * 2;
    }
}
