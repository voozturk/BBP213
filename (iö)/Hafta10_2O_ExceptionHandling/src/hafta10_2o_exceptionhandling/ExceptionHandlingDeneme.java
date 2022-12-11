package hafta10_2o_exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        Scanner tara = null;

        int sayi1 = 0, sayi2 = 0;
        double sonuc = 0;

        while (true) {
            try {
                tara = new Scanner(System.in);
                System.out.print("1. Sayıyı giriniz: ");
                sayi1 = tara.nextInt();

                System.out.print("2. Sayıyı giriniz: ");
                sayi2 = tara.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.gc();
                System.out.println("Hatalı bir giriş yaptınız!==> " + e);
//            System.out.println("o==> "+e.toString());
//            System.out.println("o==> "+e.getMessage());
//            System.err.println("e==> "+e);
//            System.err.println("e==> "+e.toString());
//            System.err.println("e==> "+e.getMessage());
//            e.printStackTrace(); // syncronized // thread // multi threading
            }
        }

        try {
            sonuc = nesne.bolme(sayi1, sayi2);
        } catch (SifiraBolunmeException  ex) {
            ex.printStackTrace();
        } catch(NegatifSayiException hata){
            System.err.println("Sıfırdan küçük sayı göndermemelisin!!");
            System.out.println(hata.getMessage());
//            hata.printStackTrace();
        }finally{
            
        }

        System.out.println("a / b = " + sonuc);

    }

    /**
     * Bu metod pozitif sayılar arasında bölme işlemi yapar.
     * @param sayi1 bölünen
     * @param sayi2 bölüm
     * @return sayi1/sayi2
     * @throws SifiraBolunmeException sayi2 = 0 durumunda bu istisna üretilir.
     * @throws NegatifSayiException  girdiler negatif olur ise bu istisna üretilir.
     */
    public double bolme(double sayi1, double sayi2) throws SifiraBolunmeException, NegatifSayiException {
        new SifiraBolunmeException().kontrol(sayi2);
        new NegatifSayiException(sayi1).kontrol();
        new NegatifSayiException(sayi2).kontrol();
        
        return sayi1 / sayi2;
    }

}
