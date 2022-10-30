/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderDemo;

/**
 *
 * @author vozturk
 */
public class Laptop {

    private String ram;
    private String hdd;
    private boolean ekranKarti;
    private boolean bluetooth;

    private Laptop(String ram, String hdd, boolean ekranKarti, boolean bluetooth) {
        this.ram = ram;
        this.hdd = hdd;
        this.ekranKarti = ekranKarti;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Laptop{" + "ram=" + ram + ", hdd=" + hdd + ", ekranKarti=" + ekranKarti + ", bluetooth=" + bluetooth + '}';
    }

    public static class Builder {

        private String ram;
        private String hdd;
        private boolean ekranKarti;
        private boolean bluetooth;

        public Builder(String ram, String hdd) {
            this.ram = ram;
            this.hdd = hdd;
            this.ekranKarti = false;
            this.bluetooth = false;
        }

        public Builder ekranKarti(boolean e) {
            ekranKarti = e;
            return this;
        }

        public Builder bluetooth(boolean b) {
            bluetooth = b;
            return this;
        }

        public Laptop build() {
            return new Laptop(ram, hdd, ekranKarti, bluetooth);
        }
    }
}
