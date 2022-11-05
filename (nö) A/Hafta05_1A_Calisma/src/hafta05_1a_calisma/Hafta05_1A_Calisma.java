/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta05_1a_calisma;

/**
 *
 * @author vozturk
 */
public class Hafta05_1A_Calisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ornek nesne = new Ornek().deneme().setDeger(15).deneme().deneme().setDeger(30).deneme();
        nesne.setDeger(55);
        
        Ornek nesne2 = nesne.deneme();
        
        nesne2.setDeger(78);
        Ornek nesne3 = nesne2.deneme();
        nesne3.deneme();
        
        System.out.println(nesne.hashCode());
        System.out.println(nesne2.hashCode());
        System.out.println(nesne3.hashCode());
        System.out.println(new Ornek().setDeger(99999).deneme().hashCode());
    }

    static class Ornek {

        int deger = 0;

        /**
         *
         * @param deger içerideki değer değişkenini değiştirir.
         * @return geriye sınıfın kendi nesnesini gönderir.
         */
        public Ornek setDeger(int deger) {
            this.deger = deger;
            return this;
        }

        /**
         * Bu metod sınıfıon tuttuğu değeri konsola yazdırır.
         *
         * @return geriye sınıfın kendi nesnesini gönderir.
         */
        public Ornek deneme() {
            System.out.println("sayi=" + deger);
            return this;
        }
    }

}
