public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    /* KONSTRUKTOR */
    Dosen(){
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }
    Dosen(String nip, String nama, String prodi){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }
    /* getter dan setter */
    String getNama(){
        return nama;
    }

    String getNIP(){
        return nip;
    }

    String getProdi(){
        return prodi;
    }

    void setNama(String name){
        nama = name;
    }

    void setNIP(String n){
        nip = n;
    }

    void setProdi(String p){
        prodi = p;
    }
    void printDosen(){
        System.out.println("Dosen " + nama + ", NIP " + nip + ", Prodi " + prodi);
    }
}