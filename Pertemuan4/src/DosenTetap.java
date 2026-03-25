import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate hitungPensiun(){
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan(){
        int tahun = hitungMasaKerja().getYears();
        return 0.02 * tahun * gajiPokok;
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);

        Period masa = hitungMasaKerja();
        System.out.println("Masa Kerja\t: " + masa.getYears() + " tahun " + masa.getMonths() + " bulan ");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungPensiun()));
        System.out.println("Tunjangan\t: " + formatRupiah(hitungTunjangan()));
    }
}
