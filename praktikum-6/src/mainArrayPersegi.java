public class mainArrayPersegi {
    public static void main(String[] args) {

        // Membuat array object Persegi
        Persegi[] daftarPersegi = new Persegi[4];

        // Mengisi array dengan object Persegi
        daftarPersegi[0] = new Persegi(4);
        daftarPersegi[1] = new Persegi(7);
        daftarPersegi[2] = new Persegi(5)   ;
        daftarPersegi[3] = new Persegi(10);

        // Menganggap persegi pertama sebagai yang terbesar
        Persegi terbesar = daftarPersegi[0];

        // Mencari luas terbesar
        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = daftarPersegi[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi     : " + terbesar.sisi);
        System.out.println("Luas     : " + terbesar.hitungLuas());
        System.out.println("Keliling : " + terbesar.hitungKeliling());
    }
}
