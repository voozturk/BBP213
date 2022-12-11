/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1b_file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vozturk
 */
public class KlasorOlustur {
    
    public static void main(String[] args) {
        String homeDizin = System.getProperty("user.home");
        System.out.println(homeDizin);

//        File f = new File(homeDizin + "\\Downloads/Ela/a/B/cc/deneme.txt");
//        
////        f.mkdirs();
//
//        try {            
//            f.createNewFile();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        for(int i=0; i<25000;i++){
            try { 
                new File(homeDizin + "\\Downloads/Ela/"+(i*2)+" Test.txt").createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(KlasorOlustur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }    
}
