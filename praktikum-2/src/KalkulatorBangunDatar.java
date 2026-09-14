import java.util.Scanner;

/*
 * Nama   : Nadya Assyifa
 * NIM    : 2025573010057
 * Kelas  : TI.2A
 * Program: Kalkulator Bangun Datar
 */

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang dan lebar persegi panjang
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        // Menghitung keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang = " + luasPersegiPanjang);
        System.out.println("Keliling persegi panjang = " + kelilingPersegiPanjang);


        // Meminta pengguna memasukkan jari-jari lingkaran
        System.out.println("\n=== LINGKARAN ===");
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;

        // Menghitung keliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran = " + luasLingkaran);
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);


        // Menentukan apakah luas persegi panjang lebih besar dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("\n=== HASIL BOOLEAN ===");
        System.out.println("Apakah luas persegi panjang > 100? " + luasBesar);

        input.close();
    }
}