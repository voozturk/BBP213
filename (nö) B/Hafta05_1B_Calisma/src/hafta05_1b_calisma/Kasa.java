/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta05_1b_calisma;

/**
 *
 * @author vozturk
 */
public class Kasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Kasa.Ornek nesne = new Ornek();

        Kasa.Ornek ornekNesne = new Ornek().setRam(88);

        int x = (new Ornek())
                .goster()
                .setRam(155)
                .getRam();// .setRam(15).goster().goster().setRam(899999);
        System.out.println("x = " + x);

        System.out.println("**********");
        ornekNesne.goster();
    }

    static class Ornek {

        private int ram;

        public Ornek setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Ornek goster() {
            System.out.println("ram=" + ram);
            return this;
        }

        public int getRam() {
            return this.ram;
        }
    }

}
