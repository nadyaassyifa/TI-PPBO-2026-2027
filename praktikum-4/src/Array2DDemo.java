public class Array2DDemo {
    public static void main(String[] args) {
        //langkah 12 deklarasi dan iterasi array 2d
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom =0; kolom < matriks[baris].length; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }

        //langkah 13 hitung total seluruh elemen matriks
        int totalMatriks = 0;
        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                totalMatriks += matriks[baris][kolom];
            }
        }
        System.out.println("Total seluruh elemen: " + totalMatriks);
    }
}
