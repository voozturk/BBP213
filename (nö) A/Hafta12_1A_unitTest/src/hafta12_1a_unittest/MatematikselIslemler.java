/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta12_1a_unittest;

/**
 *
 * @author vozturk
 */
public class MatematikselIslemler {

    private double a, b;
    public MatematikselIslemler(double a, double  b) {
        this.a = a; 
        this.b = b; 
    }
    
    public double topla(){
        if((a+b)>1300){
            return 0;
        }
        return a+b;
    }
    public double cikar(){
        return a-b;
    }
    
    public static void main(String[] args) {
        MatematikselIslemler islem = new MatematikselIslemler(3, 15);
        
        System.out.println("=> "+islem.topla());
        System.out.println("=> "+islem.cikar());
    }
    
    
}
