/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1a_nested.anonymous;

/**
 *
 * @author vozturk
 */
public class Main3 {

    public static void main(String[] args) {
        Pencere p = new Pencere(3) {
            // anonymous class
            {
                camSayisi += 20;
            }

            public void pencereleriKapat() {
                System.out.println("pencere kapatıldı.");
            }

            @Override
            public void camiAc() {
                System.out.println("camlar açılmıştır!!!!!!!!!");
                pencereleriKapat();
            }
        };

        System.out.println("Pencere cam sayısı =" + p.getCamSayisi());
        p.camiAc();

    }

}
