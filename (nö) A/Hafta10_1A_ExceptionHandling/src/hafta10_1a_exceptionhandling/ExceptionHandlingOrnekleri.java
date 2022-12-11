package hafta10_1a_exceptionhandling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandlingOrnekleri {

    public static void main(String[] args) {

        String isim = "Tolga";

        System.out.print(isim + " isminin kaçıncı karakterini görmek istersiniz =");
        int karakterNo = new Scanner(System.in).nextInt();
        System.out.println("Karakter =" + isim.charAt(karakterNo));

        ExceptionHandlingOrnekleri nesne = new ExceptionHandlingOrnekleri();

        int sayi1 = 0, sayi2 = 0;

        while (true) {
            try {
                Scanner tara = new Scanner(System.in);
                System.out.print("1. sayıyı giriniz :");
                sayi1 = tara.nextInt();
                System.out.print("2. sayıyı giriniz :");
                sayi2 = tara.nextInt();
                break;
            } catch (Exception istisna) {
//            System.out.println(istisna.toString());   
                System.gc();
                System.out.println(istisna + " Hatalı giriş yaptınız. Tekrar giriniz!");
            }
        }

        int toplamSonucu = nesne.topla(sayi1, sayi2);
        double bolmeSonucu = 0;
        
        try {
            bolmeSonucu = nesne.bol(sayi1, sayi2);
        } catch (SifiraBolunmeException ex) {
//            ex.printStackTrace();
            System.out.println("ex "+ex);
            System.out.println("ex.toString() "+ex.toString());
            System.out.println("ex.getMessage() "+ex.getMessage());
        }
        System.out.println(sayi1 + " + " + sayi2 + " = " + toplamSonucu);
        System.out.println(sayi1 + " / " + sayi2 + " = " + bolmeSonucu);
    }

    public int topla(int x, int y) {
        return x + y;
    }

    /**
     * 
     * @param sayi1 sdsadsa
     * @param sayi2 dsasad
     * @return
     * @throws SifiraBolunmeException  sayi 2 eğer sıfır gönderilir ise bu istisna fırlatılır.
     * @throws RuntimeException 
     */
    public double bol(double sayi1, double sayi2) throws  SifiraBolunmeException, RuntimeException{
        SifiraBolunmeException istisna = new SifiraBolunmeException();
        if (istisna.kontrol(sayi2)) {
            throw istisna;
        }

        System.out.println("program devam ediyor...");
        return sayi1 / sayi2;
    }
}
