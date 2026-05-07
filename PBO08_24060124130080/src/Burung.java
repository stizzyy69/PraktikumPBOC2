class Burung extends Anabul {

    Burung(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println(nama + " terbang di udara");
    }

    @Override
    void Bersuara() {
        System.out.println(nama + " bersuara: cuit");
    }
}
