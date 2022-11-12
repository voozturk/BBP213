/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta06_1b_gorsel;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author vozturk
 */
public class Hafta06_1B_Gorsel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit arac = Toolkit.getDefaultToolkit();

        System.out.println("Ekran boyutu = " + arac.getScreenSize());

        JFrame pencere = new JFrame();
        pencere.setAlwaysOnTop(true);

        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pencere.setSize(500,700);
        pencere.setSize(
                (int) arac.getScreenSize().getWidth() / 2,
                (int) arac.getScreenSize().getHeight() / 2);
//        pencere.setLocation(300,300);
        pencere.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);

        JButton btn = new JButton("BTN");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Butona tıklandı..");
            }
        });

        panel.add(btn);
        pencere.add(panel);

        pencere.setVisible(true);
    }
}
