import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.println("Halo " + nama + ", umur Anda " + umur + "tahun. ");
    }
}
