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
public class Daire extends AbstractSekil{
    
    int yaricap; 
    public Daire(int yaricap){
        this.yaricap = yaricap;
    }
    
    @Override
    public double alanHesapla(){
        return Math.PI* (yaricap*yaricap);
    }
    
    @Override
    public double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }

    @Override
    public String bilgileriVer() {
        return "DAİRE : { Yarıçap="+yaricap+"  }";
    }
    
    
}
