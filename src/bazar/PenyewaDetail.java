package bazar;

public class PenyewaDetail extends Penyewa {

    // Constructor
    public PenyewaDetail(String nama, String nik, String noHP,
                         String jenisUsaha, int nomorStand,
                         String statusPembayaran) {

        super(nama, nik, noHP, jenisUsaha, nomorStand, statusPembayaran);
    }

    // Method untuk menentukan status stand
    public String getStatusStand() {
        if (getStatusPembayaran().equalsIgnoreCase("Lunas")) {
            return "Stand Aktif";
        } else {
            return "Menunggu Pelunasan";
        }
    }

    // Overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nStatus Stand      : " + getStatusStand();
    }
}