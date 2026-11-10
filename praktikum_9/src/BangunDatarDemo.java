public class BangunDatarDemo {

    public static void main(String[] args) {

        // Membuat array polimorfik
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(14),
                new Persegi(10)
        };

        // Menghitung total luas
        double totalLuas = 0;

        for (BangunDatar bangun : daftarBangun) {
            totalLuas += bangun.hitungLuas();
        }

        System.out.println("Total luas seluruh bangun datar: " + totalLuas);
    }
}