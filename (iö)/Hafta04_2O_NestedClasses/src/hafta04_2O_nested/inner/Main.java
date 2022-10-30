/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_2O_nested.inner;

/**
 *
 * @author vozturk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kapsayici k = new Kapsayici();
        k.sayi1=15;
        k.baslat();
        
        Kapsayici.Kapi kapi = new Kapsayici.Kapi();
//        kapi.kapiyiAc();
//        System.out.println("==> "+kapi.sayi3);
        
        
        Kapsayici.Monitor monitor = k.new Monitor();
        System.out.println(monitor.sayi2);
        
        System.out.println(k instanceof Kapsayici);
        
        
        


    }
    
}
