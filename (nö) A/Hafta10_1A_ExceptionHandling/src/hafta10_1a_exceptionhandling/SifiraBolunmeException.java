/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta10_1a_exceptionhandling;

/**
 *
 * @author vozturk
 */
public class SifiraBolunmeException extends Exception{
    
    public SifiraBolunmeException(){    
        super("Gönderdiğiniz ikinci sayı 0!");
    }
    
    public SifiraBolunmeException(String uyari){
        super(uyari);
    }
    
    public boolean kontrol(double d){
        return d==0;
    }
    
}
