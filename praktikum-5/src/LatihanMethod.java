public class LatihanMethod {
    // LATIHAN 1
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    //LATIHAN 1
    static  double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    // LATIHAN 2
    static boolean isPrima(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // LATIHAN 3
    static double konversiSuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    // LATIHAN 3
    static double konversiSuhu(double celcius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Reamur")) {
            return celcius * 4/ 5;
        } else {
            System.out.println("Skala suhu tidak dikenal.");
            return Double.NaN;
        }
    }

    // LATIHAN 4
    static int cariNilaiMinimun(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if ( nilai < min) {
                min = nilai;
            }
        }

        return min;
    }

    // LATIHAN 4
    static int cariNilaiMkasimum(int[] data) {
        int max =data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }

    // LATIHAN 5
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    // LATIHAN 5
    static int[] filterDiatasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;
        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai: data) {
            if (nilai >rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        // LATIHAN 1
        System.out.println("=== LATIHAN 1 ===");
        System.out.println("Luas persegi panjang: "
                + luasPersegiPanjang(10, 5));
        System.out.println("Luas lingkaran: "
                + luasLingkaran(7));

        // LATIHAN 2
        System.out.println("\n=== LATIHAN 2 ===");
        System.out.println("Bilangan prima dari 1 sampai 50:");

        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // LATIHAN 3
        System.out.println("\n=== LATIHAN 3 ===");
        System.out.println("25 Celsius ke Fahrenheit: "
                + konversiSuhu(25));
        System.out.println("25 Celsius ke Fahrenheit: "
                + konversiSuhu(25, "Fahrenheit"));
        System.out.println("25 Celsius ke Reamur: "
                + konversiSuhu(25, "Reamur"));

        // LATIHAN 4
        System.out.println("\n=== LATIHAN 4 ===");
        int[] nilaiUjian = {80, 75, 90, 60, 88};

        System.out.println("Nilai minimum: "
                + cariNilaiMinimun(nilaiUjian));
        System.out.println("Nilai maksimum: "
                + cariNilaiMkasimum(nilaiUjian));

        // LATIHAN 5
        System.out.println("\n=== LATIHAN 5 ===");
        System.out.println("Total nilai: "
                + hitungTotal(nilaiUjian));

        int[] hasilFilter = filterDiatasRataRata(nilaiUjian);

        System.out.print("Nilai di atas rata-rata: ");
        for (int nilai : hasilFilter) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
