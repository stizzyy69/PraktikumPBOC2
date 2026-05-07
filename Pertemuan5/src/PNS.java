import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja,
               String alamat, double pendapatan, String nip) {

        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;

        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja,
               double pendapatan, String nip) {

        super(nama, tglMulaiKerja, "", pendapatan);
        this.nip = nip;

        counterPNS++;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja,
                LocalDate.now()).getYears() + 0;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
        System.out.println();
    }
}