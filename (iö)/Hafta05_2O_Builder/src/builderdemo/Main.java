/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdemo;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Araba arac1 = new Araba("Mercedes",Araba.Tip.SEDAN, "Otomatik", true, false, true,true);

        Araba arac2 = new Araba.Builder("Mustang", Araba.Tip.SEDAN)
                .camTavan(true)
                .hizSabitleme(true)
                .build();

        Araba.Builder uretici
                = new Araba.Builder("Maseratti", Araba.Tip.SEDAN)
                .camTavan(true)
                .hizSabitleme(true)
                .camTavan(true)
                .otomatikFren(true)
                .yokusKalkis(true);

        Araba arac3 = uretici.build();

        System.out.println("Arac2 özellikleri = " + arac2.toString());
        System.out.println("Arac3 özellikleri = " + arac3.toString());

    }

}
