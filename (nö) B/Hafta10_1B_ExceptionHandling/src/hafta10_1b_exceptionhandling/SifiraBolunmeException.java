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
public class SifiraBolunmeException extends Exception {

    public SifiraBolunmeException() {
        super("0'a bölünme hatası!");
    }

    public void kontrol(double sayi) throws SifiraBolunmeException {
        if (sayi == 0) {
            throw this;
        }
    }

}
