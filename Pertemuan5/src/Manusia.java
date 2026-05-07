import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;

    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja,
                    String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;

        counterMns++;
    }

    public abstract double hitungPajak();

    public abstract int hitungMasaKerja();

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
}