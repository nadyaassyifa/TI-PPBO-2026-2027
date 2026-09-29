public class OperasiArray {
    public static void main(String[] args) {
        //langkah 9 hitung total dan rata rata
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n;
        }
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        //langkah 10 cari nilai min max
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1;i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Maksimum: " + max);
        System.out.println("Nilai Minimum: " + min);

        //langkah 11 perncarian data (linear search)
        int cari = 90;
        int posisi =-1;
        for(int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemuka");
        }
    }
}
