public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Dosen Wali   : " + dosenWali.getNama());
        System.out.println();
    }
}