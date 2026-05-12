public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
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
