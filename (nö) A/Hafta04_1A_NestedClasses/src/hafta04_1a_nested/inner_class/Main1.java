/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1a_nested.inner_class;

/**
 *
 * @author vozturk
 */
public class Main1 {

    public static void main(String[] args) {

        Proje p = new Proje();
        System.out.println(p.sayi1);
        p.baslat();

        // nonstatic inner class object = pc
        System.out.println("\n >> Non-Static inner class:");
        Proje.Bilgisayar pc = p.new Bilgisayar();
        System.out.println("Sayı: " + pc.sayi2);
        pc.calistir();

        // nonstatic inner class object = home
        System.out.println("\n>> Static inner class:");
        Proje.Ev home = new Proje.Ev();
        System.out.println(home.sayi3);
        home.kapiyiAc();

    }

}
