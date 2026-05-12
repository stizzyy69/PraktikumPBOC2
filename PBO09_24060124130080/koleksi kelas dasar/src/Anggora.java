public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama,bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Anggora) berjalan dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Anggora) bersuara: meong");
    }
}