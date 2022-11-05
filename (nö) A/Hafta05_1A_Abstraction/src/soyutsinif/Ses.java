package soyutsinif;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Ses {

    private final String dosyaYolu;

    public Ses(final String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    public void sesCal() {
        Clip klip = null;
        try {
            klip = AudioSystem.getClip();
            File sesDosyasi = new File(dosyaYolu);
            AudioInputStream ais = AudioSystem.getAudioInputStream(sesDosyasi);
            klip.open(ais);

            klip.start();

//            DateFormat df = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
            DateFormat df = new SimpleDateFormat("mm:ss:SSS");
            Date uzunluk = new Date(TimeUnit.MICROSECONDS.toMillis(klip.getMicrosecondLength()));

            System.out.println("==> " + df.format(uzunluk));
            System.out.println("Dosya uzunluğu : " + klip.getMicrosecondLength());

            do {
                Thread.sleep(200);
                System.out.println("Çalınıyor...." + df.format(new Date(TimeUnit.MICROSECONDS.toMillis(klip.getMicrosecondPosition()))));
            } while (klip.isRunning());

        } catch (LineUnavailableException ex) {
            Logger.getLogger(Ses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Ses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ses.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            klip.stop();
            klip.close();
        }
    }

}
