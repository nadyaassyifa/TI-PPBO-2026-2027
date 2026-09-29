import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen (minimal 2): ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Jumlah elemen minimal 2.");
        } else {
            int[] angka = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angka[i] = input.nextInt();
            }

            int terbesar = angka[0];
            int terbesarKedua =0;
            boolean ditemukan = false;

            for (int i = 1; i < n; i++) {
                if (angka[i] > terbesar) {
                    terbesarKedua = terbesar;
                    terbesar = angka[i];
                    ditemukan = true;
                } else if (angka[i] < terbesar &&
                        (!ditemukan || angka[i] > terbesarKedua)) {
                    terbesarKedua = angka[i];
                    ditemukan = true;
                }
            }

            if (ditemukan) {
                System.out.println("Nilai terbesar: " + terbesar);
                System.out.println("Nilai terbesar kedua: " + terbesarKedua);
            } else {
                System.out.println(
                        "Tidak ada nilai terbesar kedua yang berbeda."
                );
            }
        }

        input.close();
    }
}
