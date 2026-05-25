public class Kucing extends Anabul {
    double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " berjalan dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " bersuara: meong");
    }

    public double getBobot(){
        return bobot;
    }

    public void printBobot(){
        System.out.println(panggilan + " memiliki bobot " + bobot + "kg");
    }
}