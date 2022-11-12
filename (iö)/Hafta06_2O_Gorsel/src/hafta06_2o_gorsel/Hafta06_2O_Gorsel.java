package hafta06_2o_gorsel;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author vozturk
 */

public class Hafta06_2O_Gorsel {

    public static void main(String[] args) {
        Toolkit arac = Toolkit.getDefaultToolkit();
        System.out.println("Ekran = "+arac.getScreenSize());

        JFrame pencere = new JFrame();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        Dimension boyut = new Dimension();
//        boyut.width=600; // arac.getScreenSize().width
//        boyut.height=300; // arac.getScreenSize().height
                
        pencere.setSize(arac.getScreenSize().width/2, arac.getScreenSize().height/2);
        pencere.setAlwaysOnTop(true);
//        pencere.setLocation(300, 300);
        pencere.setLocationRelativeTo(null);
        pencere.setResizable(false);
        
        JPanel panel = new JPanel(null);
        panel.setBackground(Color.yellow);
        
        JButton btn = new JButton("Tıkla");        
        btn.setBounds(100, 100, 200, 50);      
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Butona tıklandı..");
//                System.exit(0);
            }
        });       
          
        panel.add(btn);
        pencere.add(panel);        
        pencere.setVisible(true);     
    }
}
