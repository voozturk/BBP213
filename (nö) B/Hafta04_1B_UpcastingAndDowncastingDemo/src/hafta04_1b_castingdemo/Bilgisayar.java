/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta04_1b_castingdemo;

/**
 *
 * @author vozturk
 */
public class Bilgisayar extends Makine {

    @Override
    public void calistir() {
        System.out.println("bilgisayar çalıştırıldı!");
    }

    public void excelCalistir() {
        System.out.println("excel çalıştırıldı!");
    }
}
