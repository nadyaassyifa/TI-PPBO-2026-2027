import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[10];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nArray dalam urutan terbalik:");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
