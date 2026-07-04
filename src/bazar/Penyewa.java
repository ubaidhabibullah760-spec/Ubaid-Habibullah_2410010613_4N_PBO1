package bazar;

public class Penyewa {

    // Atribut (Encapsulation)
    private String nama;
    private String nik;
    private String noHP;
    private String jenisUsaha;
    private int nomorStand;
    private String statusPembayaran;

    // Constructor
    public Penyewa(String nama, String nik, String noHP,
                   String jenisUsaha, int nomorStand,
                   String statusPembayaran) {

        this.nama = nama;
        this.nik = nik;
        this.noHP = noHP;
        this.jenisUsaha = jenisUsaha;
        this.nomorStand = nomorStand;
        this.statusPembayaran = statusPembayaran;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getJenisUsaha() {
        return jenisUsaha;
    }

    public int getNomorStand() {
        return nomorStand;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    public void setNomorStand(int nomorStand) {
        this.nomorStand = nomorStand;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    // Method menampilkan data
    public String displayInfo() {
        return "Nama              : " + nama +
               "\nNIK               : " + nik +
               "\nNo HP             : " + noHP +
               "\nJenis Usaha       : " + jenisUsaha +
               "\nNomor Stand       : " + nomorStand +
               "\nStatus Pembayaran : " + statusPembayaran;
    }
}