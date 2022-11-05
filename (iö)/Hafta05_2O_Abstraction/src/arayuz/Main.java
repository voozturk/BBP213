/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayuz;

/**
 *
 * @author vozturk
 */
public class Main {

    public static void main(String[] args) {
        MySqlVeritabani mysqlDB = new MySqlVeritabani();
        OracleVeritabani oracleDB = new OracleVeritabani();
        MsSqlVeritabani msDB = new MsSqlVeritabani();

        VeritabaniManager vekilVeritabani = new VeritabaniManager(msDB);

        vekilVeritabani.oturumAc();
        vekilVeritabani.ekle();
        vekilVeritabani.sil();
        vekilVeritabani.guncelle();
        vekilVeritabani.sorgu();
    }

}
