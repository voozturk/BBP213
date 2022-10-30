/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_nested.local;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {

        deneme2(); 

    }
    
    public static void deneme2(){
        String ogrenciBilgileri[][]
                = {
                    {"Ahmet", " Matematik", "80"},
                    {"Veli", " Türkçe", "90"}
                };
        
        
        class Ogrenci {

            String ad;
            String ders;
            int not;

            public Ogrenci(String ad, String ders, int not) {
                this.ad = ad;
                this.ders = ders;
                this.not = not;
            }

            @Override
            public String toString() {
                return ad + " " + ders + " dersinden " + not + " puan aldı.";
            }
        }

        List<Ogrenci> ogrenciler = new ArrayList<>();

        for (String[] eleman : ogrenciBilgileri) {
            Ogrenci tmpOgr = new Ogrenci(eleman[0], eleman[1], Integer.parseInt(eleman[2]));
            ogrenciler.add(tmpOgr);
        }

//        for (int i = 0; i < ogrenciler.size(); i++) {
//            System.out.println(i+". =>  "+ogrenciler.get(i).toString());
//        }
        for (Ogrenci ogr : ogrenciler) {
            System.out.println("=>  "+ogr.toString());
        }
    }

}
