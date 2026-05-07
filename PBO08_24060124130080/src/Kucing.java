class Kucing extends Anabul {
    double bobot;

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    void Gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    void Bersuara() {
        System.out.println(nama + " bersuara: meong");
    }

    public void printBobot(){
        System.out.println(nama + " memiliki bobot " + bobot + "kg");
    }
}