/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpaterndemo;

/**
 *
 * @author vozturk
 */
public class Main4 {

    public static void main(String[] args) {

        Pc bilgisayar1 = new Pc.Builder("512 ssd", "16gb").build();
        Pc bilgisayar2
                = new Pc.Builder("256 hdd", "4gb")
                .grafikKarti(true)
                .bluetooth(true)
                .build();
        
        System.out.println("Nesnenin bilgileri => "+bilgisayar2.toString());

    }

}
