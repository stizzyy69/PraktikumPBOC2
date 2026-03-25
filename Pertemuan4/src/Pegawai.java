import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    public Period hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    public String formatRupiah(double nilai){
        Locale indonesia = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(indonesia);
        return format.format(nilai).replace(",00", "");
    }

    public String formatTanggal(LocalDate tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM YYYY", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    public void printInfo(){
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Gaji Pokok\t: " + formatRupiah(gajiPokok));
    }
}
