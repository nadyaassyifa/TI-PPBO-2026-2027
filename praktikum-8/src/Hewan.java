public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " sedang bersuara.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
}