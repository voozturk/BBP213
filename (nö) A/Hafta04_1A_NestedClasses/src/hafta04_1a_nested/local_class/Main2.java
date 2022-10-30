/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1a_nested.local_class;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class Main2 {

    public static void main(String[] args) {
        baskaMetod();
    }

    public static void baskaMetod() {
        String veriler[][] = {
            {"58", "Gelişim Üniversitesi"},
            {"25", "İstanbul Ünniveresitesi"}
        };

        class Okul { // local class

            private int ogrSayisi;
            private String isim;

            public Okul(int ogrSayi, String isim) {
                this.ogrSayisi = ogrSayi;
                this.isim = isim;
            }

            @Override
            public String toString() {
                return isim + " üniversitesinin " + ogrSayisi + " öğrencisi var.";
            }

            public int kacOgrencinVar() {
                return ogrSayisi;
            }

            public int kacDerslikVar() {
                return (int) Math.ceil(((double) ogrSayisi) / 5);
            }
        }

        List<Okul> okullar = new ArrayList<>();

        for (String[] veri : veriler) {
            Okul tmp = new Okul(Integer.parseInt(veri[0]), veri[1]);
            okullar.add(tmp);

        }

        for (int i = 0; i < okullar.size(); i++) {
            System.out.println(okullar.get(i));
        }

        System.out.println("\n##");
        System.out.println(okullar.get(0).isim + " >> Kaç öğrenci = " + okullar.get(0).kacOgrencinVar());
        System.out.println(okullar.get(0).isim + " >> Kaç derslik = " + okullar.get(0).kacDerslikVar());

    }

}
