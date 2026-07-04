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

    System.out.println("\n===== DAFTAR PENYEWA =====");

    if (jumlahPenyewa == 0) {
        System.out.println("Belum ada data penyewa.");
    } else {

        for (int i = 0; i < jumlahPenyewa; i++) {

            System.out.println("\nPenyewa ke-" + (i + 1));
            System.out.println("----------------------------");
            System.out.println(daftarPenyewa[i].displayInfo());

        }

    }

    break;

                case 3:

    input.nextLine();

    System.out.print("Masukkan nama penyewa yang dicari : ");
    String cariNama = input.nextLine();

    boolean ditemukan = false;

    for (int i = 0; i < jumlahPenyewa; i++) {

        if (daftarPenyewa[i].getNama().equalsIgnoreCase(cariNama)) {

            System.out.println("\n===== DATA PENYEWA DITEMUKAN =====");
            System.out.println(daftarPenyewa[i].displayInfo());

            ditemukan = true;
            break;

        }

    }

    if (!ditemukan) {
        System.out.println("Data penyewa tidak ditemukan.");
    }

    break;

                case 4:

    input.nextLine();

    System.out.print("Masukkan nama penyewa yang akan diedit : ");
    String editNama = input.nextLine();

    boolean edit = false;

    for (int i = 0; i < jumlahPenyewa; i++) {

        if (daftarPenyewa[i].getNama().equalsIgnoreCase(editNama)) {

            System.out.println("\n===== EDIT DATA =====");

            System.out.print("Nama Baru : ");
            daftarPenyewa[i].setNama(input.nextLine());

            System.out.print("NIK Baru : ");
            daftarPenyewa[i].setNik(input.nextLine());

            System.out.print("No HP Baru : ");
            daftarPenyewa[i].setNoHP(input.nextLine());

            System.out.print("Jenis Usaha Baru : ");
            daftarPenyewa[i].setJenisUsaha(input.nextLine());

            System.out.print("Nomor Stand Baru : ");
            daftarPenyewa[i].setNomorStand(input.nextInt());
            input.nextLine();

            System.out.print("Status Pembayaran Baru : ");
            daftarPenyewa[i].setStatusPembayaran(input.nextLine());

            System.out.println("\nData berhasil diperbarui.");

            edit = true;

            break;

        }

    }

    if (!edit) {
        System.out.println("Data penyewa tidak ditemukan.");
    }

    break;

                case 5:

    input.nextLine();

    System.out.print("Masukkan nama penyewa yang akan dihapus : ");
    String hapusNama = input.nextLine();

    boolean hapus = false;

    for (int i = 0; i < jumlahPenyewa; i++) {

        if (daftarPenyewa[i].getNama().equalsIgnoreCase(hapusNama)) {

            for (int j = i; j < jumlahPenyewa - 1; j++) {
                daftarPenyewa[j] = daftarPenyewa[j + 1];
            }

            daftarPenyewa[jumlahPenyewa - 1] = null;
            jumlahPenyewa--;

            System.out.println("Data berhasil dihapus.");

            hapus = true;
            break;
        }

    }

    if (!hapus) {
        System.out.println("Data penyewa tidak ditemukan.");
    }

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