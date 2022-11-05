/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayuz;

/**
 *
 * @author vozturk
 */
public class VeritabaniManager implements IVeritabaniArayuzu{

    IVeritabaniArayuzu vekil; 
    
    public VeritabaniManager(IVeritabaniArayuzu vt){
        this.vekil = vt;
    }
    
    
    @Override
    public void ekle() {
        vekil.ekle();
    }

    @Override
    public void sil() {
        vekil.sil();
    }

    @Override
    public void guncelle() {
        vekil.guncelle();
    }

    @Override
    public void sorgu() {
        vekil.sorgu();
    }    
}
