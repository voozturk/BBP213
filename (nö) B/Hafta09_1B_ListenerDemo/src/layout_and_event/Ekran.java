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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author vozturk
 */
public class Ekran extends JFrame implements ActionListener, KeyListener, MouseListener {

    private JPanel pnlKapsayici;
    private JButton btnTikla1;
    private JButton btnTikla2;
    private JLabel lblUstYazi;

    private JTextField tfYaziAlani;

    int maasTeklifi;

    public Ekran(String baslik) {
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

    private void initComponents() {
        pnlKapsayici = new JPanel();
        pnlKapsayici.setLayout(null);
        pnlKapsayici.setBackground(new Color(180, 180, 230));

//        System.out.println(pnlKapsayici.getLayout().getClass().getName());
        btnTikla1 = new JButton("Yekili");
        btnTikla1.setSize(150, 50);
        btnTikla1.setLocation(200, 300);
        btnTikla1.setActionCommand("yetkili biri");
        btnTikla1.addActionListener(this);
        btnTikla1.addMouseListener(this);
        btnTikla1.setFont(new Font(Font.DIALOG, Font.BOLD, 30));

        btnTikla2 = new JButton("Yetkisiz");
        btnTikla2.setSize(200, 70);
        btnTikla2.setLocation(
                btnTikla1.getLocation().x,
                btnTikla1.getLocation().y + btnTikla1.getSize().height);

        btnTikla2.setActionCommand("yoldan geçen");
        btnTikla2.addActionListener(this);

        tfYaziAlani = new JTextField("0");
        tfYaziAlani.setBounds(
                btnTikla1.getLocation().x,
                btnTikla1.getLocation().y - 20 - 80,
                btnTikla1.getSize().width,
                80);

        Font fnt = new Font(Font.DIALOG, Font.BOLD + Font.ITALIC, 25);
        tfYaziAlani.setFont(fnt);
        tfYaziAlani.addKeyListener(this);

        lblUstYazi = new JLabel("Maaş beklentiniz :");
        lblUstYazi.setSize(350, 60);
        lblUstYazi.setLocation(200, 150);
//        lblUstYazi.setOpaque(true);

        pnlKapsayici.add(btnTikla1);
        pnlKapsayici.add(btnTikla2);
        pnlKapsayici.add(tfYaziAlani);
        pnlKapsayici.add(lblUstYazi);
        add(pnlKapsayici);
    }

    private Dimension ozelBoyut(Dimension d) {
        return new Dimension(d.width / 3, d.height / 2);
    }

    @Override
    public void actionPerformed(ActionEvent olay) {
        String strActionCommand = olay.getActionCommand();

        System.out.println("Komut = " + strActionCommand);

        switch (strActionCommand) {
            case "yetkili biri":
                String yazi = tfYaziAlani.getText(); // Wrapper Class  ==> Integer, Long, Short , Byte, Double..... 
                int teklif = Integer.parseInt(yazi);
                JOptionPane.showMessageDialog(this, "Teklifiniz = " + teklif);
                break;
            case "yoldan geçen":
                JOptionPane.showMessageDialog(this, "Sizi tanımıyorum ");

                break;

        }

//        JButton btn = (JButton)ae.getSource();        
////        btn.setVisible(false);        
//        System.out.println("deneme");
//        
//        
//        if(btn.equals(btnTikla1)){
//            System.out.println("buton 1 ");
//        }else if(btn.equals(btnTikla2)){        
//            System.out.println("buton 2 tıklandı. ");            
//        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent olay) {

        if (olay.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }

        btnTikla1.setVisible(true);
        btnTikla2.setVisible(true);

        String girdi = tfYaziAlani.getText().replace(" ", "");

        try {
            maasTeklifi = Integer.parseInt(girdi);
        } catch (NumberFormatException e) {
            System.out.println("Girilen sayı hatalı...");
            if (girdi.equals("")) {
                maasTeklifi = 0;
            }
        }
        tfYaziAlani.setText(maasTeklifi + "");

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    boolean dugmeKactiMi = false;

    @Override
    public void mouseEntered(MouseEvent me) {
        if (maasTeklifi >= 30000) {
            btnTikla1.setLocation(
                    btnTikla1.getLocation().x + ((btnTikla1.getSize().width + 10) * (dugmeKactiMi ? -1 : 1)),
                    btnTikla1.getLocation().y);

            dugmeKactiMi = !dugmeKactiMi;
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
}
