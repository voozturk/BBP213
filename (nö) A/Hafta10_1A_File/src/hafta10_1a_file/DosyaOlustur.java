/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1a_file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author vozturk
 */
public class DosyaOlustur {
    
    public static void main(String[] args) {
        
        try {
            String homeDizin = System.getProperty("user.home");
            System.out.println(homeDizin);
            
            
            File dosya = new File(homeDizin+"\\Downloads\\OrnekKlasor\\deneme.txt");
            dosya.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
          
        
    }
    
}
