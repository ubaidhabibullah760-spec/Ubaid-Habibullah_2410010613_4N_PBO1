package bazar;

import java.util.Scanner;

public class PenyewaBeraksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PenyewaDetail[] daftarPenyewa = new PenyewaDetail[18];

        int jumlahPenyewa = 0;
        int pilihan;

        do {

            System.out.println("\n=====================================");
            System.out.println(" SISTEM MANAJEMEN PENYEWAAN STAND ");
            System.out.println("=====================================");
            System.out.println("1. Tambah Penyewa");
            System.out.println("2. Tampilkan Penyewa");
            System.out.println("3. Cari Penyewa");
            System.out.println("4. Edit Penyewa");
            System.out.println("5. Hapus Penyewa");
            System.out.println("6. Info Stand");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:

    if (jumlahPenyewa >= daftarPenyewa.length) {
        System.out.println("Stand sudah penuh!");
        break;
    }

    input.nextLine(); // Membersihkan buffer

    System.out.println("\n===== TAMBAH PENYEWA =====");

    System.out.print("Nama               : ");
    String nama = input.nextLine();

    System.out.print("NIK                : ");
    String nik = input.nextLine();

    System.out.print("No HP              : ");
    String noHP = input.nextLine();

    System.out.print("Jenis Usaha        : ");
    String jenisUsaha = input.nextLine();

    System.out.print("Nomor Stand        : ");
    int nomorStand = input.nextInt();
    input.nextLine();

    System.out.print("Status Pembayaran (Lunas/Belum Lunas): ");
    String status = input.nextLine();

    daftarPenyewa[jumlahPenyewa] = new PenyewaDetail(
            nama,
            nik,
            noHP,
            jenisUsaha,
            nomorStand,
            status);

    jumlahPenyewa++;

    System.out.println("\nData berhasil disimpan!");

    break;

                case 2:
                    System.out.println("Menu Tampilkan Penyewa");
                    break;

                case 3:
                    System.out.println("Menu Cari Penyewa");
                    break;

                case 4:
                    System.out.println("Menu Edit Penyewa");
                    break;

                case 5:
                    System.out.println("Menu Hapus Penyewa");
                    break;

                case 6:
                    System.out.println("Menu Info Stand");
                    break;

                case 7:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 7);

    }

}