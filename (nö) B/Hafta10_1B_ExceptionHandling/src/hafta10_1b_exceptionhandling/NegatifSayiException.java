/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1b_exceptionhandling;

/**
 *
 * @author vozturk
 */
public class NegatifSayiException extends Exception{
    
    double sayi;
    public NegatifSayiException(double sayi){
        super("Negatif sayı girdiniz. Girilen sayı = "+sayi);
        this.sayi = sayi;
    }
    
    public void kontrol() throws NegatifSayiException{
        if(this.sayi <0){
            throw this;
        }
    }
    
    
}
