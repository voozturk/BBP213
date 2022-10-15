package hafta01_2o_hatirlatma;

public class Hafta01_2O_Hatirlatma {

    
    public static void main(String[] args) {
        
        Insan vatandas1 = new Insan("Berkant");
//        vatandas1.isim = "Berkant";
        
        Insan vatandas2 = new Insan("Emir");
//        vatandas2.isim = "Emir";
        
        
        vatandas1.yemekYe();
        System.out.println("------");
        vatandas2.yemekYe();

//
////        System.out.println("1 = "+vatandas1.isim);
////        System.out.println("2 = "+vatandas2.isim);
//        System.out.println("=== "+Insan.isim);
        
        Ogrenci ogr = new Ogrenci("Ahmet", Ogrenci.OgrTuru.IKINCI_OGRETIM);
        System.out.println("Toplam ders : "+ogr.kacDakikaDersinVar());
        
        
        
        
    }
    
}
