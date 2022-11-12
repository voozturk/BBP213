
package hafta06_1a_gorsel;

import com.sun.javafx.perf.PerformanceTracker;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Hafta06_1A_Gorsel {

    public static void main(String[] args) {
        
        Toolkit arac = Toolkit.getDefaultToolkit();
        Dimension monitorBoyutu = arac.getScreenSize();
        Dimension pencereBoyutu = new Dimension(600, 500);
        
        
        System.out.println("Ekran boyutu = "+monitorBoyutu.width+" x "+monitorBoyutu.height);
        
        
        JFrame pencere = new JFrame("Nesne Tabanlı Programlama");
        
        
        pencere.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE
        
        pencere.setAlwaysOnTop(true);        
        pencere.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE
//        pencere.setSize(new Dimension(100, 100));
        pencere.setSize(pencereBoyutu);
//        pencere.setLocation( monitorBoyutu.width/2-pencereBoyutu.width/2  
//                ,monitorBoyutu.height/2-pencereBoyutu.height/2   );
        
        pencere.setLocationRelativeTo(null);
        
        
        
        
        
        pencere.setVisible(true);
        
        
    }
    
}
