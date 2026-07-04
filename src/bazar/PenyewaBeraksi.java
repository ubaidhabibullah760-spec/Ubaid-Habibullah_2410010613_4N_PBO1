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
                    System.out.println("Menu Tambah Penyewa");
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