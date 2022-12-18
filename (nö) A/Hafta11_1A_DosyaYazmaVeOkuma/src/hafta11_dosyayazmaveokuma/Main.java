/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta11_dosyayazmaveokuma;

import java.io.File;
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

//        System.out.println(System.getProperty("user.home"));
//        System.out.println(System.getProperty("user.dir"));
        String homePath = System.getProperty("user.home");

        File dosya = new File(homePath + "\\Documents\\BugünGüzelBirGün");

        System.out.println("Dosya var mı ? = " + (dosya.exists() ? "VAR" : "YOK"));
        if (!dosya.exists()) {
            dosya.mkdirs();
            System.out.println("Dosya oluşturma işlemi başlatıldı artık dosya " + (dosya.exists() ? "VAR" : "YOK"));
        }

        File metinBelgesi = new File(dosya.getPath() + "\\yeniBelge.txt");

        try {

            System.out.println("Dosya içeriği = \n" + dosyaIceriginiOku(metinBelgesi));

            FileOutputStream dosyaCikisi = new FileOutputStream(metinBelgesi, true);
            PrintWriter pw = new PrintWriter(dosyaCikisi);
            
            for(long i=0 ; i<1500; i++){
                pw.println(i+". satır = i^2==== => "+(i*i));
            }
            
            System.out.println("Dosya içeriği = \n" + dosyaIceriginiOku(metinBelgesi));
            
            
            
            pw.close();
            dosyaCikisi.close();
        } catch (IOException e) {
            e.printStackTrace();
            
        }finally{
            
        }

    }

    public static String dosyaIceriginiOku(File dosya) throws IOException {
        if (!dosya.exists()) {
            dosya.createNewFile();
        }
//            Scanner tara = new Scanner(System.in);
        Scanner dosyadanOku = new Scanner(dosya);

        StringBuilder metin = new StringBuilder();

        while (dosyadanOku.hasNext()) {
            metin.append(">> " + dosyadanOku.next() + "\n");
        }
//            System.out.println("Dosya içeriği = "+metin.toString());            
        dosyadanOku.close();
        return metin.toString();

    }
}
