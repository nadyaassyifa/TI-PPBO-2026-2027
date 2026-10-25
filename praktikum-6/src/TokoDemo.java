public class TokoDemo {
    public static void main(String[] args) {

        // Membuat array object Produk berisi 5 produk
        TugasProduk[] daftarProduk = new TugasProduk[5];

        daftarProduk[0] = new TugasProduk("P001", "Laptop", 7500000, 10);
        daftarProduk[1] = new TugasProduk("P002", "Mouse", 150000, 20);
        daftarProduk[2] = new TugasProduk("P003", "Keyboard", 350000, 15);
        daftarProduk[3] = new TugasProduk("P004", "Monitor", 2500000, 8);
        daftarProduk[4] = new TugasProduk("P005", "Headset", 500000, 12);

        // Menampilkan seluruh data produk
        System.out.println("===== DATA SELURUH PRODUK =====");

        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }

        // Simulasi pembelian produk pertama
        System.out.println("===== SIMULASI PEMBELIAN =====");

        System.out.println("Pembelian Laptop sebanyak 2:");
        double total1 = daftarProduk[0].hitungTotalHarga(2);
        daftarProduk[0].kurangiStok(2);

        System.out.println("Total harga: Rp" + total1);
        System.out.println("Stok Laptop sekarang: " + daftarProduk[0].stok);

        System.out.println();

        // Simulasi pembelian produk kedua dengan stok tidak cukup
        System.out.println("Pembelian Monitor sebanyak 20:");
        double total2 = daftarProduk[3].hitungTotalHarga(20);
        daftarProduk[3].kurangiStok(20);

        System.out.println("Total harga: Rp" + total2);
        System.out.println("Stok Monitor sekarang: " + daftarProduk[3].stok);

        // Mencari produk dengan harga termahal
        TugasProduk produkTermahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }

        // Menampilkan produk termahal
        System.out.println();
        System.out.println("===== PRODUK TERMAHAL =====");
        produkTermahal.tampilkanData();
    }
}