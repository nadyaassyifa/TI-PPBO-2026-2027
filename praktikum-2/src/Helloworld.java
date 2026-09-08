public class Helloworld {
    public static void main(String[] args) {
        // Program menampilkan biodata sederana
        System.out.println("Nama: Budi ");
        /* Baris di bawah ini
           mencetak NIM mahasiswa */
        System.out.println("NIM: 12345");

        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; // widening otomatis
        System.out.println("Widening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; // narrowing ehsplisit
        System.out.println("Narrowing: " + hasilCasting);
    }
}
