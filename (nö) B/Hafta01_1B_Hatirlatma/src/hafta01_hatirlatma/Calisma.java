
package hafta01_hatirlatma;

public class Calisma {
    
  
    public static void main(String[] args){
        
        Insan ali  = new Insan();        
        ali.isim = "Ali";
        ali.kahvaltiYap();
        
        System.out.println("-----");
        
//        
        Insan veli  = new Insan();
        veli.isim = "Emre";
        veli.kahvaltiYap();
//        

        // Insan.kahvaltiYap(); // static olmadığı için hata verecektir.

//        System.out.println("Alinin adı  = "+ali.isim);
//        System.out.println("Veinin adı  = "+veli.isim);
//        
////        System.out.println("Sayı1 = " +Insan.ad ); 
//////        
//////        String isim1;
//////        String isim2=null;
//////        String isim3="";
//////        
//////        isim1="12312313";
//////        
//////        System.out.println(isim1);

        
    }   
    
}
