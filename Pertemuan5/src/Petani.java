import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja,
                  String alamat, double pendapatan,
                  String asalKota) {

        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;

        counterPetani++;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja,
                LocalDate.now()).getYears() + 0;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + asalKota);
        System.out.println();
    }
}