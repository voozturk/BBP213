package sekillerabstract;

/**
 *
 * @author vozturk
 */
public class Kare extends AbstractSekil {

    int kenarUzunlugu;

    public Kare(int kenarUzunlugu) {
        super("KARE");
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public int alanHesapla() {
        return (int) Math.pow(kenarUzunlugu, 2);  // kenarUzunlugu*kenarUzunlugu; 
    }

    @Override
    public double cevreHesapla() {
        return kenarUzunlugu * 4;
    }

    @Override
    public String toString() {
        return sekilAdi + " : KenarUzunluğu=" + kenarUzunlugu + " ==> " + super.toString();
    }
}
