/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_and_event;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author vozturk
 */
public class Ekran extends JFrame implements ActionListener{
    
    private JPanel pnlKapsayici;
    private JButton btnTikla1;
    private JButton btnTikla2;
    
    private JTextField tfYaziAlani;
    
    public Ekran(String baslik){
        super(baslik);
//        this.setTitle("This: "+baslik);
//        super.setTitle("Super: "+baslik);
//        setTitle("Normal: "+baslik);
        
        Dimension pencereBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(ozelBoyut(pencereBoyutu)); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        initComponents();
    }
    
    
    private void initComponents(){
        pnlKapsayici = new JPanel();
        pnlKapsayici.setLayout(null);
        pnlKapsayici.setBackground(new Color(180, 180, 230));
        
//        System.out.println(pnlKapsayici.getLayout().getClass().getName());
        
        btnTikla1 = new JButton("Onayla");
        btnTikla1.setSize(150,50);
        btnTikla1.setLocation(200,300);
        btnTikla1.addActionListener(this);        
        btnTikla1.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
        
        btnTikla2 = new JButton("Tıkla2");
        btnTikla2.setSize(200, 70);
        btnTikla2.setLocation(
                btnTikla1.getLocation().x, 
                btnTikla1.getLocation().y+btnTikla1.getSize().height);
        
        btnTikla2.addActionListener(this);
        
        
        tfYaziAlani = new JTextField(); 
        tfYaziAlani.setBounds(
                btnTikla1.getLocation().x, 
                btnTikla1.getLocation().y-20-80, 
                btnTikla1.getSize().width, 
                80);
        
        Font fnt = new Font(Font.DIALOG, Font.BOLD+Font.ITALIC, 25);
        tfYaziAlani.setFont(fnt);
        
        
        pnlKapsayici.add(btnTikla1);
        pnlKapsayici.add(btnTikla2);
        pnlKapsayici.add(tfYaziAlani);
        add(pnlKapsayici); 
    }
    
    private Dimension ozelBoyut(Dimension d){
        return new Dimension(d.width/3, d.height/2);
    }

    int sayi=0;     
    @Override
    public void actionPerformed(ActionEvent olay) {
        sayi++;        
        JButton btnTiklanan = (JButton)olay.getSource();        
        btnTikla1.setText("="+sayi);
        btnTiklanan.setLocation(
                btnTiklanan.getLocation().x+((int)(Math.random()*10)),
                btnTiklanan.getLocation().y );
    }    
}
