/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekillerabstract;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {
        Kare kareSekil1 = new Kare(40);
        Kare kareSekil2 = new Kare(10);
        Kare kareSekil3 = new Kare(20);

        Ucgen ucgenSekil = new Ucgen(6, 8);

        sekilBilgileriniGoster(kareSekil1);
        sekilBilgileriniGoster(kareSekil2);
        sekilBilgileriniGoster(kareSekil3);
        sekilBilgileriniGoster(ucgenSekil);
    }

    public static void sekilBilgileriniGoster(AbstractSekil sekil) {
        System.out.println("\n" + sekil.getClass().getName());
        System.out.println("==>" + sekil);
        System.out.println("Şeklin alanı\t=  " + sekil.alanHesapla());
        System.out.println("Şeklin çevresi\t=  " + sekil.cevreHesapla());
    }
}
