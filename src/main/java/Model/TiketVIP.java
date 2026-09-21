/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADVAN
 */
public class TiketVIP extends Tiket {
    private double biayaVIP;
    private String fasilitas;

    public TiketVIP(Film film, Studio studio, double hargaDasar, double biayaVIP, String fasilitas) {
        super(film, studio, hargaDasar); // Memanggil constructor milik super-class Tiket
        this.biayaVIP = biayaVIP;
        this.fasilitas = fasilitas;
    }

    public double getBiayaVIP() {
        return biayaVIP;
    }

    public void setBiayaVIP(double biayaVIP) {
        this.biayaVIP = biayaVIP;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    @Override
    public double hitungTotalHarga() {
        return getHargaDasar() + biayaVIP;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== STRIP TIKET VIP ===");
        super.cetakTiket();
        System.out.println("Biaya VIP   : Rp " + biayaVIP);
        System.out.println("Fasilitas   : " + fasilitas);
        System.out.println("Total Bayar : Rp " + hitungTotalHarga());
    }
}