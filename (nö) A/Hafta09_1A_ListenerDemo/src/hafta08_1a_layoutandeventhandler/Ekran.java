/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta08_1a_layoutandeventhandler;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vozturk
 */
public class Ekran extends JFrame implements ActionListener, MouseListener, KeyListener {

    private JPanel pnlKapsayici;
    private JButton btnLogin;
    private JTextField tfUserName;
    private JLabel lblSubtext;
    
    long deger = 0;

    public Ekran(String baslik) {
//        super(baslik);

        System.out.println("Pencere default layout = " + getLayout().getClass().getName());

        Dimension ekranBoyut = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Ekran boyutu = " + ekranBoyut);

        setSize(ozelBoyut(ekranBoyut));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle(baslik);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();

    }

    private void initComponents() {
        pnlKapsayici = new JPanel();
        pnlKapsayici.setBackground(new Color(50, 50, 50));
        pnlKapsayici.setLayout(null);

        btnLogin = new JButton("Yetkili");
        btnLogin.setSize(250, 100);

//        btnLogin.setBounds(250, 180, 300, 100);
        System.out.println((getSize().width));
        System.out.println((getSize().width / 2) - (btnLogin.getSize().width / 2));
        System.out.println((getSize().width / 2) - (btnLogin.getSize().width / 2));

        btnLogin.setLocation((getSize().width / 2) - (btnLogin.getSize().width / 2), 250);
        btnLogin.addActionListener(this);
        btnLogin.addMouseListener(this);
        btnLogin.setActionCommand("teklif");

        tfUserName = new JTextField(20);
        tfUserName.setSize(btnLogin.getSize());
        tfUserName.setBackground(Color.DARK_GRAY);
        tfUserName.setForeground(Color.white);
        tfUserName.addKeyListener(this);
        tfUserName.setText("0");
        tfUserName.addMouseListener(this);

        tfUserName.setLocation(btnLogin.getLocation().x,
                btnLogin.getLocation().y - 10 - tfUserName.getSize().height);
        Font fnt = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 25);
        tfUserName.setFont(fnt);

        lblSubtext = new JLabel("Maaş beklentiniz:");
        lblSubtext.setForeground(Color.yellow);

//        lblSubtext.setBackground(Color.blue);
//        lblSubtext.setOpaque(true);
        lblSubtext.setSize(tfUserName.getSize().width, tfUserName.getSize().height / 3);
        lblSubtext.setLocation(tfUserName.getLocation().x, tfUserName.getLocation().y - lblSubtext.getSize().height);
        lblSubtext.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));

//        System.out.println(pnlKapsayici.getLayout().getClass().getSimpleName());
        pnlKapsayici.add(btnLogin);
        pnlKapsayici.add(tfUserName);
        pnlKapsayici.add(lblSubtext);
        add(pnlKapsayici);
    }

    private Dimension ozelBoyut(Dimension d) {
        return new Dimension(d.width / 3, d.height / 2);
    }

    @Override
    public void actionPerformed(ActionEvent olay) {
        System.out.println("Komut = " + olay.getActionCommand());
        if (olay.getActionCommand().equals("teklif")) {
            System.out.println("tıklandı..(action performed)");
            JOptionPane.showMessageDialog(this, "Maaş beklentiniz onaylandı = " + tutar);
            System.out.println("tıklandı..(mouse clicked)");
        }
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

    int tutar;
    boolean konumDurum = false;

    @Override
    public void mouseEntered(MouseEvent olay) {

        if (olay.getSource().equals(btnLogin)) {
            System.out.println("Fare giriş yaptı");
            String yazi = tfUserName.getText();
            tutar = Integer.parseInt(yazi);
            if (tutar > 15000) {
                btnLogin.setLocation(btnLogin.getLocation().x, btnLogin.getLocation().y
                        + (btnLogin.getSize().height + 10)
                        * (konumDurum ? -1 : 1));
                konumDurum = !konumDurum;

            }
        } else if (olay.getSource().equals(tfUserName)) {
            tfUserName.setBackground(tfUserName.getBackground().brighter().brighter());
        }
    }

    @Override
    public void mouseExited(MouseEvent olay) {
        System.out.println("Fare çıkış yaptı");
//        btnLogin.setLocation(btnLogin.getLocation().x, btnLogin.getLocation().y - 10);
        if (olay.getSource().equals(tfUserName)) {
            tfUserName.setBackground(tfUserName.getBackground().darker().darker());
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }


    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        String yazi = tfUserName.getText();
        int keyCode = ke.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
        if (keyCode == KeyEvent.VK_T) {
            pnlKapsayici.setBackground(pnlKapsayici.getBackground().brighter());
        }
        if (keyCode == KeyEvent.VK_G) {
            pnlKapsayici.setBackground(pnlKapsayici.getBackground().darker());
        }
        pnlKapsayici.repaint();

        try {
//            System.out.println("BaSılan tuş kodu = "+ke.getKeyCode());
//            System.out.println("BaSılan tuş kodu = "+KeyEvent.VK_A);
            deger = Long.parseLong(yazi);

        } catch (NumberFormatException ex) {
            if (yazi.length() == 0 || yazi.equals(" ")) {
                tfUserName.setText("0");
            } else {
                tfUserName.setText(deger + "");
            }
        }
    }

}
