import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        DosenTetap dTetap = new DosenTetap("9545647548", "Andi", LocalDate.of(1990,5,5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");

        DosenTamu dTamu = new DosenTamu("123456789", "Budi", LocalDate.of(1985, 3, 10), LocalDate.of(2020, 1, 1), 4000000, "Fakultas Kedokteran", "998877", LocalDate.of(2027, 1, 1));

        Tendik t = new Tendik("567890123", "Citra", LocalDate.of(1992, 7, 15), LocalDate.of(2018,6, 1), 3000000, "Akademik");

        System.out.println("=== DOSEN TETAP ===");
        dTetap.printInfo();

        System.out.println("\n=== DOSEN TAMU ===");
        dTamu.printInfo();

        System.out.println("\n=== TENDIK ===");
        t.printInfo();
    }
    
}
