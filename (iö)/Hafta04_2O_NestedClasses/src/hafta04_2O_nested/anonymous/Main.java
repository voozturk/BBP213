/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_2O_nested.anonymous;

/**
 *
 * @author vozturk
 */
public class Main {
    
    public static void main(String[] args) {
        Araba mercedes = new Araba(90);
        Araba tofas = new Araba(55){
            // anonymous class
            {
                 hiz+=3;
            }
            
            @Override
            public void hizlan() {
               this.hiz+=10;
               yavasla();
            }
            
            public void yavasla(){
                hiz-=5;
            }
        };
        
        mercedes.hizlan();
        tofas.hizlan();
        
        
        System.out.println("Mercedes hizi = "+mercedes.hiz);
        System.out.println("Tofaş hizi = "+tofas.hiz);
    }
    
}
