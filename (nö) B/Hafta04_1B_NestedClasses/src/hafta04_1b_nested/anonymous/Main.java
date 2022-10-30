/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_nested.anonymous;

import hafta04_1b_nested.inner.Proje;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {
        Kamyon arac1 = new Kamyon(80);
        Kamyon arac2 = new Kamyon(80){          
            // anonymous class
            {
                hiz+=10;
            }           
            public void yavasla(){
                this.hiz -=2;
            }
            
            @Override
            public void hizlan(){
                this.hiz +=5;
                yavasla();
            }
        };
        
        
        arac1.hizlan();
        arac2.hizlan();
        
        System.out.println("1. Arabanın hızı = "+arac1.getHiz());
        System.out.println("2. Arabanın hızı = "+arac2.getHiz());
        
        
    }

}
