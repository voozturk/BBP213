/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta09;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vozturk
 */
public class Uygulama extends JFrame implements ActionListener, KeyListener, MouseListener {

    private JPanel pnlKapsayici;
    private JButton btnVasifsiz, btnTecrubeli;
    private JTextField tfYaziAlani;
    
    boolean blKacti = false;
    
    long teklifTutari;

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

        btnVasifsiz = new JButton("Vasıfsız");
        btnVasifsiz.setSize(250, 80);
        btnVasifsiz.setLocation(250, 300);
        btnVasifsiz.setActionCommand("bilgisiz");
        btnVasifsiz.addActionListener(this);

        btnTecrubeli = new JButton("Tectübeli Personel");

        btnTecrubeli.setSize(btnVasifsiz.getSize());
        btnTecrubeli.setLocation(btnVasifsiz.getLocation().x, btnVasifsiz.getLocation().y - 150);
        btnTecrubeli.setActionCommand("uzman");
        btnTecrubeli.addActionListener(this);
        btnTecrubeli.addMouseListener(this);

        tfYaziAlani = new JTextField();
        tfYaziAlani.setSize(250, 100);
        tfYaziAlani.setLocation(btnVasifsiz.getLocation().x, 30);
        tfYaziAlani.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 25));
        tfYaziAlani.addKeyListener(this);

//        btn3 = new JButton("Bu butona kesinlikle tıkalma");
        pnlKapsayici.add(btnVasifsiz);
        pnlKapsayici.add(btnTecrubeli);
        pnlKapsayici.add(tfYaziAlani);

        add(pnlKapsayici);

    }

    private Dimension ozelOlcu(Dimension d) {
        return new Dimension(d.width / 2, d.height / 2);
    }

    public void actionPerformed(ActionEvent olay) {
        String basvuru = olay.getActionCommand();
        switch (basvuru) {
            case "uzman":
                JOptionPane.showMessageDialog(this, "Teklifiniz kabul edildi: " + teklifTutari);
                break;
            case "bilgisiz":
                JOptionPane.showMessageDialog(this, "Tecrübesizler başvuramaz!!!");
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
//        System.out.println("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
//        System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        String girdi = tfYaziAlani.getText().replace(" ", ""); // wrapper class, Integer, Double ,Float, Short, Byte.... Long
        try {
            teklifTutari = Long.parseLong(girdi);
        } catch (NumberFormatException e) {
            if (girdi.length() == 0) {
                teklifTutari = 0L;
            }
        }
        tfYaziAlani.setText(teklifTutari + "");
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

    @Override
    public void mouseEntered(MouseEvent me) {
        if (teklifTutari >= 2000) {
            butonuKacir();
        }
    }

    public void butonuKacir() {
        btnTecrubeli.setLocation(
                btnTecrubeli.getLocation().x + (btnTecrubeli.getSize().width + 10) * (blKacti ? -1 : 1), btnTecrubeli.getLocation().y
        );
        blKacti = !blKacti;
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
