/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author vozturk
 */
public class Uygulama extends JFrame implements ActionListener {

    private JPanel pnlKapsayici;
    private JButton btn1, btn2;
    private JTextField tfYaziAlani;

    public Uygulama(String baslik) {
        super(baslik);
        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();

        setSize(ozelOlcu(ekranBoyutu));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        initComponents();
    }

    private void initComponents() {
        pnlKapsayici = new JPanel();
//        pnlKapsayici.setBackground(Color.ORANGE);
        pnlKapsayici.setBackground(new Color(80, 160, 50).brighter());
        pnlKapsayici.setLayout(null);

        btn1 = new JButton("Buton 1");
        btn1.setSize(120, 80);
        btn1.setLocation(250, 300);
        btn1.addActionListener(this);

        btn2 = new JButton("Buton 2");
        btn2.setSize(btn1.getSize());
        btn2.setLocation(btn1.getLocation().x, btn1.getLocation().y - 150);
        btn2.addActionListener(this);

        tfYaziAlani = new JTextField(20);
        tfYaziAlani.setSize(250, 100);
        tfYaziAlani.setLocation(btn1.getLocation().x, 30);
        tfYaziAlani.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 25));

//        btn3 = new JButton("Bu butona kesinlikle tıkalma");
        pnlKapsayici.add(btn1);
        pnlKapsayici.add(btn2);
        pnlKapsayici.add(tfYaziAlani);

        add(pnlKapsayici);

    }

    private Dimension ozelOlcu(Dimension d) {
        return new Dimension(d.width / 2, d.height / 2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn1)) {
            System.out.println("\nButon 1'e tıklandı..");
        } else {
            System.out.println("\nDiğer butona tıklandı..");
        }
        JButton btnTiklanan = (JButton)ae.getSource();
        System.out.print("Butonun mevcut rengi =>"+btnTiklanan.getBackground());        
        btnTiklanan.setBackground(btnTiklanan.getBackground().equals(Color.YELLOW)? new ColorUIResource(10, 10, 10) :Color.YELLOW);
        btnTiklanan.setLocation(btnTiklanan.getLocation().x+20, btnTiklanan.getLocation().y);
        System.out.println("\t\t Güncel rengi => "+btnTiklanan.getBackground());
        
        
    }
    
}
