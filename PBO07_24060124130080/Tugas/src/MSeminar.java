public class MSeminar {
    public static void main(String[] args) {

        // Membuat objek dosen
        Dosen d1 = new Dosen("Pak Budi", "198001");
        Dosen d2 = new Dosen("Bu Sinta", "198002");

        // Membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa(
                "Andi",
                "24060101",
                d1
        );

        Mahasiswa m2 = new Mahasiswa(
                "Beni",
                "24060102",
                d1
        );

        Mahasiswa m3 = new Mahasiswa(
                "Citra",
                "24060103",
                d2
        );

        Mahasiswa m4 = new Mahasiswa(
                "Dina",
                "24060104",
                d2
        );

        Mahasiswa m5 = new Mahasiswa(
                "Eka",
                "24060105",
                d1
        );

        // Membuat seminar
        Seminar seminar = new Seminar();

        // Registrasi peserta
        seminar.registrasi(d1);
        seminar.registrasi(d2);

        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // Menampilkan peserta
        seminar.tampilPeserta();

        // Menampilkan jumlah peserta
        System.out.println(
                "Jumlah peserta : "
                + seminar.countPeserta()
        );

        // Menampilkan jumlah mahasiswa
        System.out.println(
                "Jumlah mahasiswa : "
                + seminar.countMahasiswa()
        );

        System.out.println();

        // Mengubah dosen wali
        m1.setWali(d2);

        // Menampilkan data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}