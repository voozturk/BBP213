package hafta01_2o_hatirlatma;

public class Insan {


    
    String isim = null;
    
    
    public Insan(String isim) {
        this.isim = isim; 
    }

    
    public void yemekYe() {
        String menu[] = {"İçli Köfte",
            "Mercimek Çorbası",
            "Fındık Lahmacun", 
            "Künefe", 
            "Çay", 
            "Kola"};

        for (int i = 0; i <menu.length ; i++) {
            if(i==2){
                continue;
            }
            System.out.println(isim +" yemek yedi : " + menu[i]);
        }
//        for (String eleman : menu) {
//            System.out.println(isim + " yemek yedi : " + eleman);   
  
//        }

        System.out.println("Yemek yenildi!");

    }
}
