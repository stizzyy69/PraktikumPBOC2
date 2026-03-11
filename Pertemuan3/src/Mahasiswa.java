import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* KONSTRUKTOR */
    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* METHOD */

    //konstruktor untuk membuat mahasiswa tanpa parameter  
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>(); // Inisialisasi ArrayList kosong
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
}
