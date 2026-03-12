public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa("24060124130080", "Wipin Saputra", "Informatika");

        Dosen D1 = new Dosen("198903032015042002", "Khadijah, S.Kom., M.Cs.", "Informatika");

        Kendaraan K1 = new Kendaraan("H 1528 WZ", "Motor");

        MataKuliah PBO = new MataKuliah("AIK21341", "Pemrograman Berorientasi Objek", 3);
        MataKuliah JarKom = new MataKuliah("AIK21342", "Jaringan Komputer", 3);
        MataKuliah MBD = new MataKuliah("AIK21343", "Manajemen Basis Data", 3);
        MataKuliah GTI = new MataKuliah("AIK21344", "Grafik dan Teknik Interaktif", 3);
        MataKuliah ASA = new MataKuliah("AIK21345", "Analisis dan Strategi Algoritma", 3);
        MataKuliah KB = new MataKuliah("AIK21346", "Kecerdasan Buatan", 3);

        M1.addMatkul(PBO);
        M1.addMatkul(JarKom);
        M1.addMatkul(MBD);
        M1.addMatkul(GTI);
        M1.addMatkul(ASA);
        M1.addMatkul(KB);
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        M1.printMhs();
        M1.printDetailMhs();

    }
    
}
