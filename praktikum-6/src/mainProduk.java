public class mainProduk {
    public static void main(String[] args) {
        //membuat objek
        Produk produk1 = new Produk("Laptop", 7500000);
        Produk produk2 = new Produk("Mouse", 150000);

        // Batas harga
        double batasHarga = 1000000;

        // Menampilkan data
        System.out.println("Produk 1");
        System.out.println("Nama Produk : " + produk1.namaProduk);
        System.out.println("Harga       : Rp" + produk1.harga);
        System.out.println("Mahal?      : " + produk1.isMahal(batasHarga));

        System.out.println();

        System.out.println("Produk 2");
        System.out.println("Nama Produk : " + produk2.namaProduk);
        System.out.println("Harga       : Rp" + produk2.harga);
        System.out.println("Mahal?      : " + produk2.isMahal(batasHarga));
    }
}
