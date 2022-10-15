package bankaornek_1a;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {
        
        Kisi kisi1 = new Kisi("Metin", "NİF", "12345678911", "01.01.2000");         
        Hesap hesap1 = new Hesap(Hesap.Tip.BIREYSEL, Hesap.ParaBirimi.USD);
        Musteri musteri1 = new Musteri(kisi1, hesap1);
        
        Kisi kisi2 = new Kisi("Ahmet", "NİF", "456456456", "01.01.2000"); 
        Hesap hesap2 = new Hesap(Hesap.Tip.BIREYSEL, Hesap.ParaBirimi.TRY);
        Musteri musteri2 = new Musteri(kisi2, hesap2);
        
        
        Banka bankam = new Banka("Ekmek Bank");
        bankam.hesapEkle(hesap1);
        bankam.hesapEkle(hesap2);
        
        
        
        
        
        //System.out.println(bankam.getHesap(0).getMusteri().toString());
        
        
        
        for(int i =0; i<bankam.getHesapSayisi(); i++){
            System.out.println(i+". hesabın sahibi  = "+bankam.getHesap(i).getMusteri());
        }
        
        
        
        
        
        
        
        
    }
    
}
