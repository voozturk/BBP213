/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutsinif;

/**
 *
 * @author vozturk
 */
public class Kedi extends AbstractHayvan {

    public Kedi() {
        sesiAyarla(System.getProperty("user.home") + "\\Downloads\\kedi.wav");
    }

    @Override
    public void sesCikar() {
        System.out.println("\nKedi Miyavladı..");
        ses.sesCal();
    }
}
