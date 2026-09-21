/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADVAN
 */
public class TiketReguler extends Tiket {
    private double biayaAdmin;

    public TiketReguler(Film film, Studio studio, double hargaDasar, double biayaAdmin) {
        super(film, studio, hargaDasar); // Memanggil constructor milik super-class Tiket
        this.biayaAdmin = biayaAdmin;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    @Override
    public double hitungTotalHarga() {
        return getHargaDasar() + biayaAdmin;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== STRIP TIKET REGULER ===");
        super.cetakTiket();
        System.out.println("Biaya Admin : Rp " + biayaAdmin);
        System.out.println("Total Bayar : Rp " + hitungTotalHarga());
    }
}