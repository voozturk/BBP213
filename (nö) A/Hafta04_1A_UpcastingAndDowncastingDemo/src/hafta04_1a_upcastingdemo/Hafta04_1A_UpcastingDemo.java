package hafta04_1a_upcastingdemo;
/**
 *
 * @author vozturk
 */
public class Hafta04_1A_UpcastingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba mustang = new Araba();
        Bilgisayar pc = new Bilgisayar();
        
//        boolean d2 = pc instanceof Bilgisayar;
//        System.out.println(d2);
        
        System.out.println("---Main içerisinde---");
        
        System.out.println("*** ARABA  *** ");
        mustang.calistir();   
        mustang.hizlan();
        aracCalistir(mustang);
        
        System.out.println("*** PC  *** ");
        pc.calistir();
        aracCalistir(pc);
        
    }
    
    /**
     * bu metod içerisine <b>gönderilen</b> aracın 
     * sür işlevini <br>çalıştırır.
     * @param arac surulecek araç
     */
    public static void aracCalistir(Arac arac){
        System.out.println(">>> aracCalistir içerisinde");
        
        arac.calistir();     
        
        
        if(arac instanceof Araba){
            System.out.println("Gönderilen nesne bir arabadır...");
            Araba tmpAraba = (Araba)arac;
            tmpAraba.hizlan();
        }else{
            System.out.println("gönderilen nesne araba değildir!");
        }
    }
    
}
