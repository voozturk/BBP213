/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta11_1b_dosyayayazveoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String yol = System.getProperty("user.home") + "\\Documents\\Hafta11 Dosya İşlemleri";

        File dizin = new File(yol);

        boolean varMi = dizin.exists();
        System.out.println(dizin + " var mı = " + (varMi ? "VAR" : "YOK"));
        if (!varMi) {
            dizin.mkdirs();
            System.out.println(dizin + " üretildi mi= " + (dizin.exists() ? "evet" : "hayır"));
        } else {
            System.out.println("Dosya bulunuyor.");
        }

        File yeniDosya = new File(dizin.getPath() + "\\yeni bir not defteri.txt");

        System.out.println("#Önceki Okunan Veri = " + dosyaOku(yeniDosya));

        try {
            FileOutputStream dosyaCikisNesnesi = new FileOutputStream(yeniDosya, false);
            
            PrintWriter yazici  = new PrintWriter(dosyaCikisNesnesi);
            
            
//            Date d = new Date();
            
            for(long i =0; i<15; i++){
                yazici.println("i="+i+" i^2 = "+(i*i));
            }
                      
            
            yazici.close();        
            dosyaCikisNesnesi.close();
            
//            System.out.println("\n#Sonraki Okunan Veri = " + dosyaOku(yeniDosya));
            
        } catch (FileNotFoundException e) {
            System.err.println("Dosya bulunamadı!");
            e.printStackTrace();
        } catch(IOException e ){
            System.err.println("Dosya işlemlerinde bir hata ile karşılaşıldı!");
            e.printStackTrace();
        } 
    }

    public static String dosyaOku(File dosya) {
        if (!dosya.exists()) {
            try {
                dosya.createNewFile();
                return null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (dosya.exists()) {
            try {
                Scanner dosyaOkuyucu = new Scanner(dosya);

                StringBuilder okunanMetin = new StringBuilder("");

                while (dosyaOkuyucu.hasNext()) {
                    okunanMetin.append("\n" + dosyaOkuyucu.nextLine());
//                    System.out.println("==> "+dosyaOkuyucu.next());
                }

                return okunanMetin.toString();

            } catch (FileNotFoundException e) {
                System.err.println("Dosya yok!");
                e.printStackTrace();
            }
        }
        return null;
    }

}
