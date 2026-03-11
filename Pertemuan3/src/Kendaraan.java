public class Kendaraan {
    private String noPlat;
    private String jenis;

    /* KONSTRUKTOR */
    Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* getter dan starter */
    String getNoPlat(){
        return noPlat;
    }
    String getJenis(){
        return jenis;
    }
    void setNoPlat(String no){
        noPlat = no;
    }
    void setJenis(String type){
        jenis = type;
    }

    void printKendaraan(){
        System.out.println("No Plat: " + noPlat + ", Jenis: " + jenis);
    }
}

