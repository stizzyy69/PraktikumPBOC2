/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Wipin Saputra
 * Tanggal      : 26 Februari 2026
 */

public class Titik {
    /******************ATRIBUT**********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /******************METHOD**********************/
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //konstruktor untuk membuat titik(0,0)
    Titik(){
        this(0, 0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void getKuadran() {
        if (absis > 0 && ordinat > 0) {
            System.out.println("Kuadran I");
        } else if (absis < 0 && ordinat > 0) {
            System.out.println("Kuadran II");
        } else if (absis < 0 && ordinat < 0) {
            System.out.println("Kuadran III");
        } else if (absis > 0 && ordinat < 0) {
            System.out.println("Kuadran IV");
        } else {
            System.out.println("Titik berada di (0,0)");
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getRefleksiX(){
        return new Titik (absis, -ordinat);
    }

    Titik getRefleksiY(){
        return new Titik (-absis, ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik() {
        System.out.println("Counter Titik: " + counterTitik);
    }
} //end class Titik