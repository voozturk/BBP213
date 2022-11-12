package soyutsekiller;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kare kareSekil = new Kare(15);
        Ucgen ucgenSekil = new Ucgen(6, 8);

        sekilBilgileriniGoster(kareSekil);
        sekilBilgileriniGoster(ucgenSekil);
    }

    public static void sekilBilgileriniGoster(AbstractSekil birsey) {
        System.out.println("\nSınıf = " + birsey.getClass().getName());
        System.out.println("Şeklin Adı= " + birsey.getSekilAdi());
        System.out.println("Alanı \t= " + birsey.alanHesapla());
        System.out.println("Çevresi\t= " + birsey.cevreHesapla());
    }
}
