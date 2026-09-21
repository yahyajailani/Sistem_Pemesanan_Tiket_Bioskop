/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Model.Film;
import Model.Studio;
import Model.Tiket;
import Model.TiketReguler;
import Model.TiketVIP;
import java.util.Scanner;

/**
 *
 * @author ADVAN
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("==========================================");
            System.out.println("   SISTEM PEMESANAN TIKET BIOSKOP   ");
            System.out.println("==========================================");

            // Input Data Film
            System.out.print("Masukkan Judul Film     : ");
            String judul = scanner.nextLine();
            
            System.out.print("Masukkan Genre Film     : ");
            String genre = scanner.nextLine();
            
            System.out.print("Masukkan Durasi (menit) : ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); 

            Film filmDipilih = new Film(judul, genre, durasi);

            // Input Data Studio
            System.out.print("Masukkan Nama Studio (e.g. Studio 1) : ");
            String namaStudio = scanner.nextLine();
            
            Studio studioDipilih = new Studio(namaStudio, 50);

            // Pilihan Jenis Tiket
            System.out.println("\nPilih Tipe Tiket:");
            System.out.println("1. Tiket Reguler");
            System.out.println("2. Tiket VIP");
            System.out.print("Pilihan Anda (1/2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            Tiket tiketPesanan = null;

            if (pilihan == 1) {
                double hargaDasar = 40000;
                double biayaAdmin = 5000;
                tiketPesanan = new TiketReguler(filmDipilih, studioDipilih, hargaDasar, biayaAdmin);
            } else if (pilihan == 2) {
                double hargaDasar = 40000;
                double biayaVIP = 35000;
                String fasilitas = "Kursi Recliner + Popcorn & Drink";
                tiketPesanan = new TiketVIP(filmDipilih, studioDipilih, hargaDasar, biayaVIP, fasilitas);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            if (tiketPesanan != null) {
                System.out.println("\n------------------------------------------");
                tiketPesanan.cetakTiket();
                System.out.println("==========================================");
            }

            System.out.print("\nApakah Anda ingin memesan tiket lagi? (y/n): ");
            ulang = scanner.nextLine();
            System.out.println(); 

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan sistem pemesanan tiket bioskop!");
        scanner.close();
    }
}
