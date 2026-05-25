public class Anjing extends Anabul {
    private double bobot;

    public Anjing(String nama,double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot(){
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " berjalan dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " bersuara: guk-guk");
    }
}
