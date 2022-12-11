package hafta10_2o_file;

import java.io.File;

/**
 *
 * @author vozturk
 */
public class Hafta10_2O_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.setProperty("mode", "deneme");
//        System.out.println(System.getProperty("mode"));
        String homeDizin= System.getProperty("user.home");
        System.out.println(homeDizin);
        
        File dosya = new File(homeDizin+"/Downloads/denemeler/a,b,c"); 
        dosya.mkdirs();
        System.out.println(dosya.exists());
        
        
        

        
    }
    
}
