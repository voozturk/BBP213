/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_2o_castingdemo;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Insan vatandas = new Insan();
        Calisan isci1 = new Calisan("Tesisatçı");
        Ogrenci talha = new Ogrenci();
        
//        System.out.println(vatandas instanceof Insan);
//        System.out.println(vatandas instanceof Calisan);
//        System.out.println(vatandas instanceof Ogrenci);
//        System.out.println(isci1 instanceof Insan);
//        System.out.println(isci1 instanceof Calisan);
//        System.out.println(isci1 instanceof Ogrenci);// hatalı
////        System.out.println(talha instanceof Insan);
////        System.out.println(talha instanceof Calisan); // hatalı
////        System.out.println(talha instanceof Ogrenci);
        
        System.exit(0);        
        
//        System.out.println("**** INSAN *** ");
//        vatandas.yemekYe();
//        insanYemekYesin(vatandas);
//        

        System.out.println("\n**** ÇALIŞAN *** ");
        isci1.yemekYe();
        isci1.maasAl();
        insanYemekYesin(isci1);

        System.out.println("\n**** ÖĞRENCİ *** ");
        talha.yemekYe();
        insanYemekYesin(talha);    

//        System.out.println("İşçi 1 mesleği = "+isci1.meslek);

    }

    public static void insanYemekYesin(Insan kisi) {

        System.out.println("**Metod içerisinde yemek yedirildi!.... ");
        kisi.yemekYe();
        
//        System.out.println("===> "+kisi.getClass());

        if (kisi instanceof Calisan) {
            System.out.println("Bu kişi çalışandır. Maaş alabilir.");
            Calisan tesisatci = (Calisan) kisi;
            tesisatci.maasAl();
        } else {
            System.out.println("Bu kişi çalışan değildir. Maaş alamaz.");
        }

    }

}
