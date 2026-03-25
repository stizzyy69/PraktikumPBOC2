import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK\t\t: " + nidk);
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Akhir Kontrak\t: " + formatTanggal(akhirKontrak));
        System.out.println("Tunjangan\t: " + formatRupiah(hitungTunjangan()));
    }
    
}
