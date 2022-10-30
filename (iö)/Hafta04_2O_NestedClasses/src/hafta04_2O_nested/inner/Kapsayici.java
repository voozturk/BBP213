/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_2O_nested.inner;

/**
 *
 * @author vozturk
 */
public class Kapsayici {

    int sayi1 = 55;

    public void baslat() {
        System.out.println("Başlatıldı...");
    }

    public static class Kapi { // static inner class

        int sayi3 = 150;

        public void kapiyiAc() {
            System.out.println("Kapı açıldı..");
        }
    }

    public class Monitor { // non-static inner class

        int sayi2 = 100;

        public void ekraniCalistir() {
            System.out.println("Ekran açıldı.");
        }
    }

}
