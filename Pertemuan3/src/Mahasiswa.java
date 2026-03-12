import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* KONSTRUKTOR */
    //konstruktor tanpa parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>(); //Inisialisasi arraylist kosong
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    /* SELEKTOR & MUTATOR */

    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    /* METHOD */
    public void addMatkul(MataKuliah mk){
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(mk);
        } else {
            System.out.println("Daftar Mata Kuliah Penuh (Max 50)");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatkul) {
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

    public void setNIM(String NIM){
        this.nim = NIM;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setProdi (String Prodi){
        this.prodi = Prodi;
    }

    public void setDosenWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan Kendaran){
        this.kendaraan = Kendaran;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        if (dosenWali != null){
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        if (kendaraan != null){
            System.out.println("Kendaraan: " + kendaraan.getJenis());
        }
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Jumlah Matkul: " + getJumlahMatkul());
        System.out.println("Daftar Mata Kuliah: ");
        for (MataKuliah mk : listMatkul){
            System.out.println("- " + mk.getNama());
        }
    }

    
}


