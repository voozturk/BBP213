package soyutsinif;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kedi boncuk = new Kedi();
        Kopek karabas = new Kopek();

        for (int i = 0; i < 2; i++) {
            System.out.println("--> "+i+". tekrar >> ");
            boncuk.sesCikar();
            karabas.sesCikar();
        }
//        String yolKedi = System.getProperty("user.home") +"\\Downloads\\kedi.wav";
//        System.out.println(yolKedi);
//        Ses ses = new Ses(yolKedi);
//        
//        ses.sesCal();

    }

}
