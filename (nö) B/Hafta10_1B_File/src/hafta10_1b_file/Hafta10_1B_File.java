/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1b_file;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author vozturk
 */
public class Hafta10_1B_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.setProperty("34", "istanbul");
//        System.setProperty("01", "adana");//  
//        System.out.println(System.getProperty("01"));

        String homeDizin = System.getProperty("user.home");
        System.out.println(homeDizin);

        File f = new File(homeDizin + "\\Downloads\\final_proje_raporu.docx");

        System.out.println("Dosya mı ? ==> " + f.isFile());
        System.out.println("Klasör mü ? ==> " + f.isDirectory());

        System.out.println(f.getName());
        System.out.println(f.getParentFile());
        System.out.println(f.getParentFile().getParentFile());

        File dosya2 = f.getParentFile().getParentFile();
//        for (String s : dosya2.list()) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.deepToString( dosya2.list()));
        System.out.println(String.join(" > ",  dosya2.list()));

    }

}
