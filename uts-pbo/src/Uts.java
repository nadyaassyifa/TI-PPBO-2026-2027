import java.util.Scanner;

public class Uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        int[] nilai = new int[3];
        int total = 0;
        double rataRata;
        char nilaiHuruf;

        for (int i =0; i < 3; i++) {
            System.out.print("Masukkan nilai tugas ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            total += nilai[i];
        }

        rataRata = total / 3.0;

        if (rataRata >= 85) {
            nilaiHuruf = 'A';
        } else if (rataRata >= 70) {
            nilaiHuruf = 'B';
        } else if (rataRata >= 55) {
            nilaiHuruf = 'C';
        } else {
            nilaiHuruf = 'E';
        }

        System.out.println("\nHasil:");
        System.out.println("Nama: " + nama);
        System.out.println("Rata-rata: " + rataRata);
        System.out.print("Nilai Huruf: " + nilaiHuruf);

        sc.close();
    }
}
