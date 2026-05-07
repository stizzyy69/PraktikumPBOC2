public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Anabul[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T isi) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = isi;

            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        }

        return null;
    }

    public int getSize() {
        return banyak;
    }
}