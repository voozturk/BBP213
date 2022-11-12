/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta06_1a_gorsel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vozturk
 */
public class Ekran extends JFrame{
    
    
    public Ekran(){
        setTitle("Yeni Pencere");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        
        JPanel kapsayiciPanel = new JPanel(new BorderLayout());
        kapsayiciPanel.setBackground(Color.CYAN);
        
        
        JButton btn1 = new JButton("Tıkla");
//        btn1.setText("Düğmeye bas");
        
        kapsayiciPanel.add(btn1, BorderLayout.NORTH);
        
        
        JTextField yaziAlani = new JTextField("varsayılan yazı");
       
        
        kapsayiciPanel.add(yaziAlani, BorderLayout.CENTER);
        
        add(kapsayiciPanel);
        


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Butona tıklandı!!");
                btn1.setText(yaziAlani.getText());
                
            
            }
        });
    }
    
    
}
