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
public class DatabaseManager implements IDatabaseArayuzu {

    private IDatabaseArayuzu vekil_database;

    public DatabaseManager(IDatabaseArayuzu database) {
        this.vekil_database = database;
    }

    @Override
    public void ekle() {
        vekil_database.ekle();
    }

    @Override
    public void sil() {
        vekil_database.sil();
    }

    @Override
    public void guncelle() {
        vekil_database.guncelle();
    }

    @Override
    public void sorgu() {

        vekil_database.sorgu();
    }

}
