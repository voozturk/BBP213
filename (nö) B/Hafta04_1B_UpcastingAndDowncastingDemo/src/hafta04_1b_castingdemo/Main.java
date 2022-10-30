package hafta04_1b_castingdemo;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Makine cihaz = new Makine();
        Bilgisayar pc = new Bilgisayar();
        CamasirMakinasi bosch = new CamasirMakinasi();

        Makine cihaz2 = pc;

//        System.out.println(bosch instanceof CamasirMakinasi);
//        System.out.println(bosch instanceof Makine);
//        System.out.println(pc instanceof CamasirMakinasi); // hatalı
        System.out.println(cihaz2 instanceof CamasirMakinasi);

//        System.exit(0);
//        Makine aygıt = cihaz;
        cihaz.sayi = 80;
        System.out.println("\n** Main içerisinde**");
        cihaz.calistir();

        System.out.println("\n** Bilgisayar için: ");
        pc.calistir();
        pc.excelCalistir();
        makineyiCalistir(pc);

        System.out.println("\n** ÇamaşırMakinası için :");
        bosch.calistir();
        makineyiCalistir(bosch);
//        makineyiCalistir(cihaz);    
    }

    public static void makineyiCalistir(Makine m) {
        System.out.println("** Çalıştırıcı metodu içerisinde**");

        m.calistir();

        boolean bilgisayarMi = m instanceof Bilgisayar;
        if (bilgisayarMi) {
            System.out.println("Evet m nesnesi bir bilgisayardır!");
            Bilgisayar herhangiBirBilgisayar = (Bilgisayar) m;
            herhangiBirBilgisayar.excelCalistir();
        } else {
            System.out.println("Hayır, m1 nesnesi bir bilgisayar olmadığı için excel çalıştırılamıyor..");
        }
    }
}
