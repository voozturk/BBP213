package hafta10_1b_exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author vozturk
 */
public class ExceptionHandlingDeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExceptionHandlingDeneme nesne = new ExceptionHandlingDeneme();

        int sayi1 = 0, sayi2 = 0, sonuc=0;

        

        while (true) {
            Scanner tara = new Scanner(System.in);
            try {
                System.out.print("1. sayıyı giriniz: ");
                sayi1 = tara.nextInt();
                System.out.print("2. sayıyı giriniz: ");
                sayi2 = tara.nextInt();
                System.gc();
                break;
            } catch (InputMismatchException ex) {
            System.err.println("# "+ex);
//            System.err.println("2 İstisna = "+ex.toString());
//            System.err.println("3 İstisna = "+ex.getMessage());
//            System.err.println("4 İstisna = "+ex.getLocalizedMessage());     
//                ex.printStackTrace();
            }
        }
        
        try{
            sonuc = nesne.bolme(sayi1, sayi2);
        }catch(SifiraBolunmeException e){
            e.printStackTrace();
        }catch(NegatifSayiException e){
            System.out.println("Uyarı negatif bir değer algılandı.");
            System.out.println("Uyarı negatif bir değer algılandı.");
            System.out.println("Uyarı negatif bir değer algılandı.");
            System.out.println("Uyarı negatif bir değer algılandı.");
            e.printStackTrace();
        }
        

        System.out.println("Sonuç = " + sonuc);

    }

    
    /**
     * bu metod pozitif sadece pozitif sayılar ile bölme işlemi gerçekleştirir.
     * @param a bölünen
     * @param b bölen
     * @return a/b sonucunu çevir
     * @throws SifiraBolunmeException b sayısı (bölen) sıfır olduğunda bu istisna fırlatılır. 
     * @throws NegatifSayiException sayılarldan herhangi biri negatif ise bu istisna fırlatılır.
     */
    public int bolme(double a, double b) throws SifiraBolunmeException, NegatifSayiException{
        new SifiraBolunmeException().kontrol(b);
        new NegatifSayiException(a).kontrol();
        new NegatifSayiException(b).kontrol();
        
        return (int) (a / b);
    }
}
