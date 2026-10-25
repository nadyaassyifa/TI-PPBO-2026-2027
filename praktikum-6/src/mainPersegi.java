public class mainPersegi {
    public static void main(String[] args) {
        //mmebuat 2 object
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(8);

        //menampilkan hasil
        System.out.println("Persegi 1");
        System.out.println("Sisi        : " + persegi1.sisi);
        System.out.println("Luas        : " + persegi1.hitungLuas());
        System.out.println("Keliling    : " + persegi1.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 2");
        System.out.println("Sisi        : " + persegi2.sisi);
        System.out.println("Luas        : " + persegi2.hitungLuas());
        System.out.println("Keliling    : " + persegi2.hitungKeliling());
    }
}
