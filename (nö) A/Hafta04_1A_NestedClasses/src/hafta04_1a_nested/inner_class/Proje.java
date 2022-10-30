package hafta04_1a_nested.inner_class;

public class Proje {

    int sayi1 = 15;

    public void baslat() {
        System.out.println("Proje Başladı!");
    }

    public class Bilgisayar {// inner class  (non-static)

        int sayi2 = 50;

        public void calistir() {
            System.out.println("Bilgisayar Çalıştı!");
        }
    }

    public static class Ev {// inner class (static)

        int sayi3 = 80;

        public void kapiyiAc() {
            System.out.println("Kapı açıldı!");
        }
    }
}
