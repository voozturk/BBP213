/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekil_paket;

/**
 *
 * @author vozturk
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kare kareNesnesi = new Kare(5);
        Ucgen ucgenNesnesi = new Ucgen(30, 40);
        Daire daireNesnesi = new Daire(10);
        
        bilgileriGoster(kareNesnesi);
        bilgileriGoster(ucgenNesnesi);
        bilgileriGoster(daireNesnesi);        
    }
    
    public static void bilgileriGoster(AbstractSekil sekil){
        System.out.println("\nSınıfı: "+sekil.getClass().getName());
        System.out.println("Şeklin detayları = "+sekil.bilgileriVer());
        System.out.println("Şeklin alanı = "+sekil.alanHesapla());
        System.out.println("Şeklin çevresi = "+sekil.cevreHesapla());
    }
}
