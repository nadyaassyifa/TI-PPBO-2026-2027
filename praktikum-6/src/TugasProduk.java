public class TugasProduk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor
    TugasProduk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method menghitung total harga
    double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Method mengurangi stok
    void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok = stok - jumlah;
            System.out.println("Stok berhasil dikurangi.");
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    // Method menampilkan data produk
    void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
        System.out.println("---------------------------");
    }
}