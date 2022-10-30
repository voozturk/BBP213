/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpaterndemo;

/**
 *
 * @author vozturk
 */
public class Pc {

    private String hdd;
    private String ram;
    private boolean grafikKartiVarMi;
    private boolean bluetoothVarMi;

    private Pc(String hdd, String ram, boolean grafikKartiVarMi, boolean bluetoothVarMi) {
        this.hdd = hdd;
        this.ram = ram;
        this.grafikKartiVarMi = grafikKartiVarMi;
        this.bluetoothVarMi = bluetoothVarMi;
    }

    @Override
    public String toString() {
        return "Pc{" + "hdd=" + hdd + ", ram=" + ram + ", grafikKartiVarMi=" + grafikKartiVarMi + ", bluetoothVarMi=" + bluetoothVarMi + '}';
    }

    static class Builder {

        private String hdd;
        private String ram;
        private boolean grafikKartiVarMi;
        private boolean bluetoothVarMi;

        public Builder grafikKarti(boolean g) {
            this.grafikKartiVarMi = g;
            return this;
        }

        public Builder bluetooth(boolean b) {
            this.bluetoothVarMi = b;
            return this;
        }

        public Builder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
            this.bluetoothVarMi = false;
            this.grafikKartiVarMi = false;
        }

        public Pc build() {
            return new Pc(hdd, ram, grafikKartiVarMi, bluetoothVarMi);
        }
    }
}
