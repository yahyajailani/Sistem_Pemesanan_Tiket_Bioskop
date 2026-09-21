/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADVAN
 */
public class Tiket {
    private Film film;
    private Studio studio;
    private double hargaDasar;

    public Tiket(Film film, Studio studio, double hargaDasar) {
        this.film = film;
        this.studio = studio;
        setHargaDasar(hargaDasar); // Menggunakan setter untuk validasi
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public void setHargaDasar(double hargaDasar) {
        if (hargaDasar > 0) {
            this.hargaDasar = hargaDasar;
        } else {
            this.hargaDasar = 35000; // Nilai default jika input invalid
        }
    }

    public double hitungTotalHarga() {
        return hargaDasar;
    }

    public void cetakTiket() {
        System.out.println("Film        : " + film.getJudul() + " (" + film.getGenre() + ")");
        System.out.println("Durasi      : " + film.getDurasi() + " menit");
        System.out.println("Studio      : " + studio.getNamaStudio());
        System.out.println("Harga Dasar : Rp " + hargaDasar);
    }
}