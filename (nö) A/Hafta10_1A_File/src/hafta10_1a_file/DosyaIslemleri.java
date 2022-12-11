/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1a_file;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author vozturk
 */
public class DosyaIslemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.setProperty("mod1", "araba");
//        System.setProperty("mod2", "ev");
//        
//        
//        System.out.println(System.getProperty("mod1"));
//        System.out.println(System.getProperty("mod2"));

           String homeDizin = System.getProperty("user.home");
          System.out.println(homeDizin);
        
        
          File dosya = new File(homeDizin+"\\Downloads\\OrnekKlasor");
//          dosya.mkdirs();
            
            

          System.out.println(dosya.exists());
          System.out.println(dosya.getPath());
          System.out.println(dosya.getAbsolutePath());
          System.out.println(dosya.getParentFile());
          System.out.println(dosya.getParentFile().getParentFile());
          System.out.println(dosya.getParentFile().getParentFile().getParentFile());
          
          System.out.println("listele=\n\n"+Arrays.deepToString(dosya.getParentFile().list()));
          
          File dosyalar[] = dosya.getParentFile().listFiles();
          for(File d : dosyalar){
              System.out.println(">> "+(d.isFile()?"+":" ")+d);
          }
        
    }
    
}
