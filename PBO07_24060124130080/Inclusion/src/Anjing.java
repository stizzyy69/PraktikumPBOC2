public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: guk-guk");
    }
}