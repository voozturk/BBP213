/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_nested.inner;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {
        Proje projeNesne = new Proje();

        System.out.println(projeNesne.sayi1);
        projeNesne.projeyiBaslat();

        System.out.println("\nNon-Static Class = arac");
        Proje.Araba arac = projeNesne.new Araba();
        System.out.println(arac.sayi2);
        arac.gazla();

        
        System.out.println("\nStatic Class object = otoyol");
        Proje.Yol otoyol = new Proje.Yol();
        System.out.println(otoyol.sayi3);
        System.out.println(otoyol.getSeritSayisi());

    }

}
