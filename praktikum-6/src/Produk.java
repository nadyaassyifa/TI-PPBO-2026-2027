public class Produk {
    String namaProduk;
    double harga;

    //constructor
    Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    //method untuk mengecek apakah produk mahal
    boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
