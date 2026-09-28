import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        final double TARIF_450 = 500;
        final double TARIF_900 = 1000;
        final double TARIF_1300 = 1500;
        final double TARIF_2200 = 1700;
        final double TARIF_DI_ATAS_2200 = 2000;

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");
        System.out.println("Pilihan daya: 450, 900, 1300, 2200, atau di atas 2200 VA");

        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        System.out.print("Masukkan jumlah pemakaian (kwh): ");
        double pemakaian = input.nextDouble();

        if (pemakaian <= 0) {
            System.out.println("ERROR: Pemakain listrik harus lebih dari 0 kwh.");
        } else {

            double tarif = 0;
            String golongan = "";

            if (daya == 450) {
                tarif = TARIF_450;
                golongan = "450 VA";

            } else if (daya == 900) {
                tarif = TARIF_900;
                golongan = "900 VA";

            } else if (daya == 1300) {
                tarif = TARIF_1300;
                golongan = "1300 VA";

            } else if (daya == 2200) {
                tarif = TARIF_2200;
                golongan = "2200 VA";

            } else if (daya > 2200) {
                tarif = TARIF_DI_ATAS_2200;
                golongan = "Di atas 2200 VA";

            } else {
                System.out.println("ERROR: Golongan daya tidak valid.");
            }

            if (tarif > 0) {
                double totalTagihan = pemakaian * tarif;

                System.out.println("\n===== RINCIAN TAGIHAN =====");
                System.out.println("Golongan daya : " + golongan);
                System.out.println("Pemakaian     : " + pemakaian + " kWh");
                System.out.println("Tarif per kWh : Rp" + tarif);
                System.out.printf("Total tagihan : Rp%.2f%n", totalTagihan);
            }
        }

        input.close();

    }
}
