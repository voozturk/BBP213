/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta07_1a_layoutandeventhandler;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vozturk
 */
public class Ekran extends JFrame implements ActionListener{

    private JPanel pnlKapsayici;
    private JButton btnLogin;
    private JTextField tfUserName;
    private JLabel lblSubtext;
    
    public Ekran(String baslik) {
//        super(baslik);

        System.out.println("Pencere default layout = "+getLayout().getClass().getName());        

        Dimension ekranBoyut = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Ekran boyutu = " + ekranBoyut);
        
        setSize( ozelBoyut(ekranBoyut));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle(baslik);
        setLocationRelativeTo(null);
        setResizable(false);
        
        initComponents();        
        
    }
    private void initComponents(){
        pnlKapsayici = new JPanel();  
        pnlKapsayici.setBackground(new Color(50,50,50));
        pnlKapsayici.setLayout(null);
        
        btnLogin = new JButton("Onayla");
        btnLogin.setSize(250, 100);
        
//        btnLogin.setBounds(250, 180, 300, 100);
        System.out.println((getSize().width));
        System.out.println((getSize().width/2)-(btnLogin.getSize().width/2));
        System.out.println((getSize().width/2)-(btnLogin.getSize().width/2));
        
        btnLogin.setLocation((getSize().width/2)-(btnLogin.getSize().width/2), 250);
        btnLogin.addActionListener(this);
        
        
        tfUserName = new JTextField(20);
        tfUserName.setSize(btnLogin.getSize());
        tfUserName.setBackground(Color.DARK_GRAY);
        tfUserName.setForeground(Color.white);
        
        tfUserName.setLocation( btnLogin.getLocation().x, 
                btnLogin.getLocation().y-10-tfUserName.getSize().height );
        Font fnt  =new Font(Font.SERIF, Font.BOLD+Font.ITALIC, 25);
        tfUserName.setFont(fnt);
        
        lblSubtext = new JLabel("Maaş beklentiniz:");
        lblSubtext.setForeground(Color.yellow);
//        lblSubtext.setBackground(Color.blue);
//        lblSubtext.setOpaque(true);
        lblSubtext.setSize(tfUserName.getSize().width, tfUserName.getSize().height/3);
        lblSubtext.setLocation(tfUserName.getLocation().x, tfUserName.getLocation().y-lblSubtext.getSize().height);
        lblSubtext.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
        
//        System.out.println(pnlKapsayici.getLayout().getClass().getSimpleName());
        pnlKapsayici.add(btnLogin);   
        pnlKapsayici.add(tfUserName); 
        pnlKapsayici.add(lblSubtext);
        add(pnlKapsayici);  
    }
    
    private Dimension ozelBoyut(Dimension d){
        return new Dimension(d.width/3, d.height/2);
    }
    
    int sayac=0;
    
    public void actionPerformed(ActionEvent olay){
        Date neZamanBasildi = new Date(olay.getWhen()); 
        SimpleDateFormat tarihSaatFormati = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss.SSS");
        sayac++; 
        System.out.println(sayac+". kez butona tıklama olayı gerçekleşti: "+tarihSaatFormati.format(neZamanBasildi));
    }
}
