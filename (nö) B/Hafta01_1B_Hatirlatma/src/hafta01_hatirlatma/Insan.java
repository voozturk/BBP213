
package hafta01_hatirlatma;

public class Insan{
    
    String isim=null;
    
    
    public void kahvaltiYap(){
        
        String yiyecekler[] ={"Yumurta","Süt","Peynir","Zeytin"}; 
        
//        for(int i=0; i<  yiyecekler.length   ; i++){
//            
//            if(i==3){
//                break;
////                continue;
//            }
//             System.out.println(isim+" kahvaltı yapıyor : "+yiyecekler[i]);  
//        }
        
        for(String eleman :  yiyecekler){ // FOR EACH
            System.out.println(isim+" kahvaltı yapıyor : "+eleman);   
        }
        
        System.out.println("Kahvaltı yapıldı!");
        
    }
    
    
}

   
