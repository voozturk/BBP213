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
public class Kopek extends AbstractHayvan{
    
    public Kopek(){
        sesiAyarla(System.getProperty("user.home") +"\\Downloads\\kopek.wav");
    }
    
    @Override
    public void sesCikar(){
        System.out.println("\nKöpek Havladı!");
        ses.sesCal();
    }

    
}
