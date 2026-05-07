import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja,
                     String alamat, double pendapatan, String npwp) {

        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;

        counterPengusaha++;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja,
                LocalDate.now()).getYears() + 8;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
        System.out.println();
    }
}