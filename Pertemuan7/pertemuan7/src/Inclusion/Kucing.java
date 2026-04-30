package Inclusion;

// subclass Kucing
class Kucing extends Anabul {

    Kucing(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    void Bersuara() {
        System.out.println(nama + " bersuara: meong");
    }
}