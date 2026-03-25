import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungPensiun(){
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan(){
        int tahun = hitungMasaKerja().getYears();
        return 0.01 * tahun * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jabatan\t\t: Tendik");
        System.out.println("Bidang\t\t: " + bidang);

        Period masa = hitungMasaKerja();
        System.out.println("Masa Kerja\t: " + masa.getYears() + " tahun " + masa.getMonths() + " bulan ");

        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungPensiun()));
        System.out.println("Tunjangan\t: " + formatRupiah(hitungTunjangan()));
    }
}


