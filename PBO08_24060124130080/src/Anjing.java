// subclass Anjing
class Anjing extends Anabul {

    Anjing(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    void Bersuara() {
        System.out.println(nama + " bersuara: guk-guk");
    }
}
