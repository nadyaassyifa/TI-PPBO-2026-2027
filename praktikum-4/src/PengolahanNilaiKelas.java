import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {

        //membuat scanner untuk membaca input pengguna
        Scanner input = new Scanner(System.in);

        //meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasisa: ");
        int N = input.nextInt();

        //membuuat array untuk meyimpan nilai mahasiswa
        int[] nilai = new int[N];

        //masukkan nilai setiapmahasiswa menggunakan for loop
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        //menampilkan nilai sebelum diurutkan
        System.out.print("\n=== NILAI SEBELUM DIURUTKAN ===\n");
        for (int i =0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        //menginisialisasi variabel untuk perhitungan nilai
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        //menghitung total, nilai tertinggi, terendah, dan kelulusan
        for (int i = 0; i < N; i++) {
            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            if (nilai[i] >= 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        //menghitung nilai rata rata kelas
        double rataRata = (double) total / N;

        //menampilkan hasil perhitungan nilai
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.println("Nilai rata-rata kelas : " + rataRata);
        System.out.println("Nilai tertinggi       : " + nilaiTertinggi);
        System.out.println("Nilai terendah        : " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa      : " + N);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah tidak lulus    : " + jumlahTidakLulus);

        //mengerutkan nilai secara asccending menggunakan bubble short
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {

                //menukar nilai jika elemen kiri lebih besar
                if (nilai[j] > nilai[j + 1]) {
                    int sementara = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = sementara;
                }
            }
        }

        //menampilkan hasil nilai setelah diurutkan
        System.out.println("\n=== NILAI SETELAH DIURUTKAN (ASCENDING) ===");
        for (int i =0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        //menutup scanener
        input.close();
    }
}
