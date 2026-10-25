public class mainArrayBuku {
    public static void main(String[] args) {

        // Membuat array object Buku
        Buku[] daftarBuku = new Buku[4];

        // Mengisi array dengan object Buku
        daftarBuku[0] = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        daftarBuku[1] = new Buku("Bumi", "Tere Liye", 2014);
        daftarBuku[2] = new Buku("Hujan", "Tere Liye", 2016);
        daftarBuku[3] = new Buku("Laut Bercerita", "Leila S. Chudori", 2017);

        // Menampilkan buku yang terbit setelah 2015
        System.out.println("Buku yang terbit setelah tahun 2015:");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(daftarBuku[i].judul);
            }
        }
    }
}
