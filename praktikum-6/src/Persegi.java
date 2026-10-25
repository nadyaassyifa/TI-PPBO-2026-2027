public class Persegi {
    int sisi;

    //contructor berparameter
    Persegi(int sisi) {
        this.sisi = sisi;
    }

    //instance method untuk meenghitung luas
    int hitungLuas() {
        return sisi * sisi;
    }

    //instance method untuk menghitung keliling
    int hitungKeliling() {
        return 4 * sisi;
    }
}
