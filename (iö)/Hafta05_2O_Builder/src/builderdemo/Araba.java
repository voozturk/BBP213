/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdemo;

/**
 *
 * @author vozturk
 */
public class Araba {

    String marka;
    Tip tip;
    boolean hizSabitleme;
    boolean seritTakip;
    boolean otomatikFren;
    boolean camTavan;
    boolean yokusKalkis;
    String sanzimanTipi;

    enum Tip {
        SUV, SEDAN, HATCHBACK
    };

    private Araba(
            String marka,
            Tip tip,
            String sanzimanTipi,
            boolean hizSabitleme,
            boolean seritTakip,
            boolean otomatikFren,
            boolean camTavan,
            boolean yokusKalkis) {
        this.marka = marka;
        this.tip = tip;
        this.hizSabitleme = hizSabitleme;
        this.otomatikFren = otomatikFren;
        this.seritTakip = seritTakip;
        this.camTavan = camTavan;
        this.sanzimanTipi = sanzimanTipi;
        this.yokusKalkis = yokusKalkis;
    }

    @Override
    public String toString() {
        return "Araba{" 
                + "marka=" + marka 
                + ", tip=" + tip 
                + ", hizSabitleme=" + hizSabitleme 
                + ", seritTakip=" + seritTakip 
                + ", otomatikFren=" + otomatikFren 
                + ", camTavan=" + camTavan 
                + ", sanzimanTipi=" + sanzimanTipi 
                + ", yokusKalkis=" + yokusKalkis 
                + '}';
    }
    

    static class Builder {

        private String marka;
        private Tip tip;
        private boolean hizSabitleme;
        private boolean seritTakip;
        private boolean otomatikFren;
        private boolean camTavan;
        private boolean yokusKalkis;
        private String sanzimanTipi;

        public Builder(String marka, Tip tip) {
            this.marka = marka;
            this.tip = tip;
            this.hizSabitleme = false;
            this.otomatikFren = false;
            this.seritTakip = false;
            this.camTavan = false;
            this.sanzimanTipi = "Manuel";
            this.yokusKalkis = yokusKalkis;
        }

        public Builder hizSabitleme(boolean hizSabitleme) {
            this.hizSabitleme = hizSabitleme;
            return this;
        }

        public Builder otomatikFren(boolean otomatikFren) {
            this.otomatikFren = otomatikFren;
            return this;
        }

        public Builder seritTakip(boolean seritTakip) {
            this.seritTakip = seritTakip;
            return this;
        }

        public Builder camTavan(boolean camTavan) {
            this.camTavan = camTavan;
            return this;
        }

        public Builder sanzimanTipi(String sanzimanTipi) {
            this.sanzimanTipi = sanzimanTipi;
            return this;
        }
        public Builder yokusKalkis(boolean yokusKalkis) {
            this.yokusKalkis = yokusKalkis;
            return this;
        }

        public Araba build() {
            return new Araba(
                    marka,
                    tip,
                    sanzimanTipi,
                    hizSabitleme,
                    seritTakip,
                    otomatikFren,
                    camTavan,yokusKalkis);
        }

    }

}
