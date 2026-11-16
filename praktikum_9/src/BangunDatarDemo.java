public class BangunDatarDemo {

    public static void main(String[] args) {

        // Membuat array polimorfik
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(14),
                new Persegi(10),
                new PersegiPanjang(12, 6)
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        String namaTerbesar = "";

        // Menampilkan informasi setiap bangun
        for (BangunDatar bangun : daftarBangun) {

            bangun.tampilkanInfo();

            // Menghitung total luas
            totalLuas += bangun.hitungLuas();

            // Mencari luas terbesar
            if (bangun.hitungLuas() > luasTerbesar) {
                luasTerbesar = bangun.hitungLuas();
                namaTerbesar = bangun.namaBangun;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("================================");

        System.out.printf("TOTAL LUAS SELURUH BANGUN: %.2f%n",
                totalLuas);

        System.out.println("BANGUN DENGAN LUAS TERBESAR: "
                + namaTerbesar);

        System.out.printf("Nilai luas terbesar: %.2f%n",
                luasTerbesar);

        System.out.println("================================");
    }
}