package hafta04_2O_nested.local;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        calisma();

    }

    public static void calisma() {

        String ilaclar[][]
                = {
                    {"Majezik", "3"},
                    {"Tylolhot", "2"},
                    {"Gripin", "3"}
                };

        class Ilac { // local class

            String ismi;
            int doz;

            public Ilac(String ismi, int doz) {
                this.ismi = ismi;
                this.doz = doz;
            }

            @Override
            public String toString() {
                return ismi + " ilacı günde " + doz + " doz kadar kullanılır.";
            }

        }

        List<Ilac> kullanilanIlaclar = new ArrayList<>();
        for (String[] ilacVerisi : ilaclar) {
            Ilac tmpIlac = new Ilac(ilacVerisi[0], Integer.parseInt(ilacVerisi[1]));
            kullanilanIlaclar.add(tmpIlac);
        }

        for (int i = 0; i < kullanilanIlaclar.size(); i++) {
            System.out.println((i + 1) + ". ==> " + kullanilanIlaclar.get(i));
        }

    }

}
