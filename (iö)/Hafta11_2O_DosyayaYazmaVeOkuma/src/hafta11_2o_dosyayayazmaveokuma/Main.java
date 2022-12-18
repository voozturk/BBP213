package hafta11_2o_dosyayayazmaveokuma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String yol = System.getProperty("user.home") + "\\Videos\\Hava Çok Güzel";

        File dosya = new File(yol);
        boolean klasorVarMi = dosya.exists();
        System.out.println("Belirtmiş olduğunuz klasör " + (klasorVarMi ? "VAR" : "YOK"));

        if (!klasorVarMi) {
            dosya.mkdirs();
            System.out.println("Belirtmiş olduğunuz klasör " + (klasorVarMi ? "VAR" : "YOK"));
        }

//        System.out.println("F = "+dosya.isFile());
//        System.out.println("D = "+dosya.isDirectory());
        File yeniBelge = new File(dosya.getPath() + "\\veriler.txt");
        System.out.println("\n\nBefore= "+dosyayıOku(yeniBelge));
        
        
        try {
            FileOutputStream fos = new FileOutputStream(yeniBelge, true );
            PrintWriter dosyayaYazici = new PrintWriter(fos);
            
            for(long i=0; i<Long.MAX_VALUE;i++){
                dosyayaYazici.println("i="+i+" "+(i^2));
            }
            
            
//            dosyayaYazici.println("antebin hamamları");
//            dosyayaYazici.println("mardin kapısı");
//            dosyayaYazici.println("urfalıyam ezelden");
            
            dosyayaYazici.close();
            fos.close();
            
            System.out.println("\n\nAfter= "+dosyayıOku(yeniBelge));
            
            
            
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException e){
            e.printStackTrace();
        } 
        
        
        
        
        
        
    }

    public static String dosyayıOku(File dosya) {
        if (!dosya.exists()) {
            try {
                dosya.createNewFile();
                return null;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bu bir dosya mı klasör mü ? => " + ((dosya.isFile()) ? "dosya" : "klasör"));
        try {
            Scanner tara = new Scanner(dosya);
            StringBuilder okunanVeri = new StringBuilder();
            while (tara.hasNext()) {
                okunanVeri.append("\n" + tara.nextLine());
            }
            tara.close();
            return okunanVeri.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
