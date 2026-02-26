public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        T1.getAbsis();
        T1.getOrdinat();
        T1.getKuadran();
        T1.getJarakPusat();
        T1.refleksiX();
        T2.refleksiY();
        T1.getRefleksiX();
        T1.getRefleksiY();

        T2.setAbsis(6);
        T2.setOrdinat(7);
        T2.getJarak(T1);
    }

}
