public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok, double tunjanganKerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }
}
