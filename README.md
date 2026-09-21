## Sistem Pemesanan Tiket Bioskop

Proyek ini merupakan implementasi program Pemrograman Berbasis Objek (PBO) berbasis Command Line Interface (CLI) untuk mengelola pemesanan tiket bioskop secara intuitif dan terstruktur.

## Identitas Mahasiswa

Nama: Yahya Jailani

NIM: 2509116085

Kelas : C

## Deskripsi Studi Kasus

Sistem Pemesanan Tiket Bioskop dirancang untuk memproses transaksi pembelian tiket bioskop secara dinamis. Program akan meminta masukan data dari pengguna berupa:

Judul film, genre, dan durasi.

Nama/nomor studio.

Pilihan tipe tiket (Reguler atau VIP).

Berdasarkan input tersebut, sistem akan mengkalkulasi total harga akhir (termasuk biaya tambahan dan fasilitas khusus untuk tiket VIP) serta mencetak struk/strip tiket digital.

 ## Hierarki Class & Struktur Data

Program ini menerapkan prinsip-prinsip Pemrograman Berbasis Objek (PBO) melalui beberapa kelas utama:

Main: Entry point yang mengatur alur program, pemrosesan input/output, dan perulangan transaksi.

Film & Studio: Menerapkan Enkapsulasi (Encapsulation) untuk membungkus properti detail film dan informasi studio.

Tiket: Berperan sebagai Superclass (induk) yang menyimpan properti umum seperti hargaDasar, objek Film, dan objek Studio.

TiketReguler & TiketVip: Berperan sebagai Subclass (turunan) yang mewarisi sifat dasar dari superclass Tiket.

<img width="539" height="574" alt="Alur Program" src="https://github.com/user-attachments/assets/7a34c745-4a47-4c54-9c1a-1631dbe86b59" />


## Penerapan Inheritance

Penerapan Inheritance (pewarisan) diimplementasikan dengan memanfaatkan kata kunci extends pada deklarasi kelas subclass.

Contoh Implementasi Kode:

// Superclass
public class Tiket {
    protected Film film;
    protected Studio studio;
    protected double hargaDasar;
    // ...
}

// Subclass 1: Tiket Reguler
public class TiketReguler extends Tiket {
    // Mewarisi atribut dan method dari Tiket
}

// Subclass 2: Tiket VIP
public class TiketVip extends Tiket {
    private double biayaVIP;
    private String fasilitas;

// Mewarisi atribut Tiket & menambahkan atribut spesifik VIP
}

## Hasil Output yang diberikan pada program

<img width="421" height="416" alt="Screenshot 2026-09-21 164741" src="https://github.com/user-attachments/assets/f861caf4-e14c-4548-8e6b-c6fd212d5ad2" />
