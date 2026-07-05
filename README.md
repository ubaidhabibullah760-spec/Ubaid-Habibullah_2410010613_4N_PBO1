# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi manajemen penyewaan stand bazar menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data penyewa stand bazar, mulai dari menambah, menampilkan, mencari, mengedit, hingga menghapus data penyewa. Selain itu, aplikasi ini juga dapat menampilkan informasi ketersediaan stand (jumlah stand terisi dan kosong) serta status stand berdasarkan status pembayaran penyewa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Penyewa`, `PenyewaDetail`, dan `PenyewaBeraksi` adalah contoh dari class.

```bash
public class Penyewa {
    ...
}

public class PenyewaDetail extends Penyewa {
    ...
}

public class PenyewaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarPenyewa[jumlahPenyewa] = new PenyewaDetail(...)` adalah contoh pembuatan object.

```bash
daftarPenyewa[jumlahPenyewa] = new PenyewaDetail(
        nama,
        nik,
        noHP,
        jenisUsaha,
        nomorStand,
        status);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `nik`, `noHP`, `jenisUsaha`, `nomorStand`, dan `statusPembayaran` adalah contoh atribut.

```bash
private String nama;
private String nik;
private String noHP;
private String jenisUsaha;
private int nomorStand;
private String statusPembayaran;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Penyewa` dan `PenyewaDetail`.

```bash
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

public PenyewaDetail(String nama, String nik, String noHP,
                     String jenisUsaha, int nomorStand,
                     String statusPembayaran) {
    super(nama, nik, noHP, jenisUsaha, nomorStand, statusPembayaran);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNik`, `setNoHP`, `setJenisUsaha`, `setNomorStand`, dan `setStatusPembayaran` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNomorStand(int nomorStand) {
    this.nomorStand = nomorStand;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNik`, `getNoHP`, `getJenisUsaha`, `getNomorStand`, `getStatusPembayaran`, dan `getStatusStand` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getStatusStand() {
    if (getStatusPembayaran().equalsIgnoreCase("Lunas")) {
        return "Stand Aktif";
    } else {
        return "Menunggu Pelunasan";
    }
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, seluruh atribut pada class `Penyewa` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nik;
private String noHP;
private String jenisUsaha;
private int nomorStand;
private String statusPembayaran;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenyewaDetail` mewarisi `Penyewa` dengan sintaks `extends`.

```bash
public class PenyewaDetail extends Penyewa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini, method `displayInfo()` di `PenyewaDetail` merupakan overriding dari method `displayInfo()` di `Penyewa`, sehingga informasi yang ditampilkan menjadi lebih lengkap (ditambah status stand).

```bash
// Method di class Penyewa (superclass)
public String displayInfo() {
    return "Nama              : " + nama +
           "\nNIK               : " + nik +
           ...
}

// Overriding di class PenyewaDetail (subclass)
@Override
public String displayInfo() {
    return super.displayInfo() +
           "\nStatus Stand      : " + getStatusStand();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getStatusStand` dan seleksi `switch` dalam menu utama pada `PenyewaBeraksi`.

```bash
public String getStatusStand() {
    if (getStatusPembayaran().equalsIgnoreCase("Lunas")) {
        return "Stand Aktif";
    } else {
        return "Menunggu Pelunasan";
    }
}

switch (pilihan) {
    case 1:
        // Tambah Penyewa
        break;
    case 2:
        // Tampilkan Penyewa
        break;
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do-while` untuk menu utama, `while` untuk validasi input, dan `for` untuk menampilkan, mencari, serta menghapus data penyewa.

```bash
do {
    ...
} while (pilihan != 7);

for (int i = 0; i < jumlahPenyewa; i++) {
    System.out.println(daftarPenyewa[i].displayInfo());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Nama               : ");
String nama = input.nextLine();

System.out.println(daftarPenyewa[i].displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PenyewaDetail[] daftarPenyewa = new PenyewaDetail[18];` adalah contoh penggunaan array untuk menyimpan maksimal 18 data penyewa sesuai jumlah stand bazar.

```bash
PenyewaDetail[] daftarPenyewa = new PenyewaDetail[18];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime, misalnya ketika user memasukkan input yang tidak sesuai tipe data yang diharapkan. Pada kode ini, digunakan `try catch` untuk menangani input menu dan input nomor stand yang seharusnya berupa angka.

```bash
try {
    pilihan = input.nextInt();
} catch (Exception e) {
    System.out.println("Input menu harus berupa angka!");
    input.nextLine();
    pilihan = 0;
}
```

## Fitur Aplikasi

| No  | Menu              | Keterangan                                                |
| :-: | ----------------- | ---------------------------------------------------------- |
|  1  | Tambah Penyewa    | Menambahkan data penyewa baru ke dalam array                |
|  2  | Tampilkan Penyewa | Menampilkan seluruh data penyewa yang sudah tersimpan       |
|  3  | Cari Penyewa      | Mencari data penyewa berdasarkan nama                       |
|  4  | Edit Penyewa      | Mengubah data penyewa yang sudah ada berdasarkan nama       |
|  5  | Hapus Penyewa     | Menghapus data penyewa berdasarkan nama                     |
|  6  | Info Stand        | Menampilkan jumlah total, terisi, dan kosongnya stand       |
|  7  | Keluar            | Mengakhiri program                                          |

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ubaid Habibullah
NPM: 2410010613
