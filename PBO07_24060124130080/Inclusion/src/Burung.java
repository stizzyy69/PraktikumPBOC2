public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " terbang di udara");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: cuit");
    }
}