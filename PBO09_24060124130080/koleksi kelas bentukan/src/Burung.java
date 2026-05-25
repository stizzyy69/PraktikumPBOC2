public class Burung extends Anabul {
    private double bobot;

    public Burung(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot(){
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " terbang di udara");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " bersuara: cuit");
    }
}
