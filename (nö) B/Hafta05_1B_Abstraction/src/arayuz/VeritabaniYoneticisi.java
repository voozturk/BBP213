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
public class VeritabaniYoneticisi implements IDatabaseArayuzu{

    IDatabaseArayuzu vekilDatabase; 
    
    public VeritabaniYoneticisi(IDatabaseArayuzu db){
        this.vekilDatabase = db; 
    }
    
    
    @Override
    public void ekle() {
        vekilDatabase.ekle();
    }

    @Override
    public void sil() {
        vekilDatabase.sil();
    }

    @Override
    public void guncelle() {
        vekilDatabase.guncelle();
    }

    @Override
    public void sorgu() {
        vekilDatabase.sorgu();
    }
    
}
