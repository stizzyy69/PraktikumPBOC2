/* ATRIBUT */
public class MataKuliah {
    private String idMatkul;
    private String nama;
    private Integer sks;

    /* KONSTRUKTOR */
    MataKuliah(){
        this.nama = "";
        this.idMatkul = "";
        this.sks = 0;
    }
    MataKuliah(String idMatkul, String nama, Integer sks){
        this.nama = nama;
        this.idMatkul = idMatkul;
        this.sks = sks;
    }
    /* getter dan setter */
    String getIDMatkul(){
        return idMatkul;
    }
    String getNama(){
        return nama;
    }
    Integer getSKS(){
        return sks;
    }
    void setIDMatkul(String id){
        idMatkul = id;
    }
    void setNama(String name){
        nama = name;
    }
    void setSKS(Integer n){
        sks = n;
    }
    void printMatKul(){
        System.out.println("Mata Kuliah " + nama + ", ID=" + idMatkul + ", " + sks + " SKS");
    }
}
