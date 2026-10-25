public class mainBuku {
    public static void main(String[] args) {
        //membuat object buku
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi", "Tere Liye", 2014);

        //menampilkan data
        System.out.println("Buku 1");
        System.out.println("Judul           : " + buku1.judul);
        System.out.println("Pengarang       : " + buku1.pengarang);
        System.out.println("Tahun Terbit    : " + buku1.tahunTerbit);

        System.out.println();

        System.out.println("Buku 2");
        System.out.println("Judul           : " + buku2.judul);
        System.out.println("Pengarang       : " + buku2.pengarang);
        System.out.println("Tahun Terbit    : " + buku2.tahunTerbit);
    }
}
