public class Main {
    public static void main(String[] args) {

        // Membuat objek Manager
        Manager manager = new Manager(
                "Andi", "M001", 8000000, 2000000
        );

        // Membuat objek Staff
        Staff staff = new Staff(
                "Budi", "S001", 4000000, 1000000
        );

        // Membuat objek Direktur
        Direktur direktur = new Direktur(
                "Citra", "D001", 15000000, 5000000, 3000000
        );

        // Menampilkan data Manager
        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanData();
        System.out.println("Tunjangan Jabatan: " +
                manager.getTunjanganJabatan());

        System.out.println();

        // Menampilkan data Staff
        System.out.println("=== DATA STAFF ===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja: " +
                staff.getTunjanganKinerja());

        System.out.println();

        // Menampilkan data Direktur
        direktur.tampilkanData();
    }
}
