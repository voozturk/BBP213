/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekillerabstract;

/**
 *
 * @author vozturk
 */
public abstract class AbstractSekil {
    final String sekilAdi;
    
    public abstract int alanHesapla();    
    public abstract double cevreHesapla();
    
    protected AbstractSekil(String sekilAdi){
        this.sekilAdi = sekilAdi;
    }
    
    public void govdeliDemo(){
        String sekilAdi="Çokgen";
        System.out.println("Şekil sınıfının govdeli metodu çalıştırıldı. (Şekil Adı ="+this.sekilAdi);
    }

    @Override
    public String toString() {
        return "bu bir şekildir("+sekilAdi+") ==> "+super.toString();
    }
    
    
}
