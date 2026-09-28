import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int harga;

        if (mahasiswa && umur < 25) {
            harga = 30000;
            System.out.println("Anda mendapat harga khusus mahasiswa.");
        } else {
            harga = 50000;
        }

        System.out.println("Harga tiket: Rp" + harga);
    }
}