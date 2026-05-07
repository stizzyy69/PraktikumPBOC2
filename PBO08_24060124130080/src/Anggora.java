public class Anggora extends Kucing {

    Anggora(String nama, double bobot) {
        super(nama,bobot);
    }

    @Override
    void Gerak() {
        System.out.println(nama + " (Anggora) berjalan dengan melata");
    }

    @Override
    void Bersuara() {
        System.out.println(nama + " (Anggora) bersuara: meong");
    }
}