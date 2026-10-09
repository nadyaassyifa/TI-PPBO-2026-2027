import java.util.Scanner;
import java.util.ArrayList;

public class kalkulatorMethod {

    // Menyimpan riwayat hasil perhitungan
    static ArrayList<Double> riwayat = new ArrayList<>();

    // a. Method operasi penjumlahan
    static double tambah(double a, double b) {
        return a + b;
    }

    // c. Method overloading: penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
            return Double.NaN;
        }
        return a / b;
    }

    // Method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Error: Bilangan tidak boleh negatif!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    // d. Method untuk mencari hasil maksimum dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (double hasil : riwayatHasil) {
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        // b. Menu berulang sampai pengguna memilih keluar
        do {
            System.out.println("\n===== KALKULATOR METHOD =====");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Akar Kuadrat");
            System.out.println("7. Lihat Riwayat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");

            pilihan = input.nextInt();
            double hasil = Double.NaN;

            switch (pilihan) {
                case 1:
                    System.out.println("1. Tambah 2 angka");
                    System.out.println("2. Tambah 3 angka");
                    System.out.print("Pilih jumlah angka: ");
                    int jenisTambah = input.nextInt();

                    if (jenisTambah == 1) {
                        System.out.print("Masukkan angka pertama: ");
                        double a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        double b = input.nextDouble();

                        hasil = tambah(a, b);
                    } else if (jenisTambah == 2) {
                        System.out.print("Masukkan angka pertama: ");
                        double a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        double b = input.nextDouble();
                        System.out.print("Masukkan angka ketiga: ");
                        double c = input.nextDouble();

                        hasil = tambah(a, b, c);
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double aKurang = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double bKurang = input.nextDouble();

                    hasil = kurang(aKurang, bKurang);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double aKali = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double bKali = input.nextDouble();

                    hasil = kali(aKali, bKali);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double aBagi = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double bBagi = input.nextDouble();

                    hasil = bagi(aBagi, bBagi);
                    break;

                case 5:
                    System.out.print("Masukkan bilangan: ");
                    double bilangan = input.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double eksponen = input.nextDouble();

                    hasil = pangkat(bilangan, eksponen);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    double bilanganAkar = input.nextDouble();

                    hasil = akarKuadrat(bilanganAkar);
                    break;

                case 7:
                    if (riwayat.isEmpty()) {
                        System.out.println("Riwayat masih kosong.");
                    } else {
                        System.out.println("===== RIWAYAT HASIL =====");

                        for (int i = 0; i < riwayat.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". " + riwayat.get(i)
                            );
                        }
                    }
                    break;

                case 0:
                    if (!riwayat.isEmpty()) {
                        double[] dataRiwayat = new double[riwayat.size()];

                        for (int i = 0; i < riwayat.size(); i++) {
                            dataRiwayat[i] = riwayat.get(i);
                        }

                        double maksimum =
                                riwayatKeMaksimum(dataRiwayat);

                        System.out.println(
                                "Hasil maksimum dari riwayat: " + maksimum
                        );
                    } else {
                        System.out.println(
                                "Belum ada hasil perhitungan."
                        );
                    }

                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // Simpan hasil yang valid ke riwayat
            if (pilihan >= 1 && pilihan <= 6
                    && !Double.isNaN(hasil)
                    && !Double.isInfinite(hasil)) {

                riwayat.add(hasil);
                System.out.println("Hasil: " + hasil);
            }

        } while (pilihan != 0);

        input.close();
    }
}
