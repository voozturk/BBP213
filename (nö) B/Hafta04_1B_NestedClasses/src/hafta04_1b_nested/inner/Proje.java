/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_nested.inner;

/**
 *
 * @author vozturk
 */
public class Proje {
    int sayi1=50;
    
    public void projeyiBaslat(){
        System.out.println("Proje başlatıldı.");
    }
    
    public class Araba{
        int sayi2=80;   
        public void gazla(){
            System.out.println("Araba gidiyor...");
        }
    }
    
    public static class Yol{
        int sayi3=170; 
        public String getSeritSayisi(){
            return 5+" şerit  var";
        }
    }
    
    
    
}

