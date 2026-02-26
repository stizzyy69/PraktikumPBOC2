public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        Titik T3 = new Titik();
        Titik T4 = new Titik();

        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println(T1.getAbsis());
        System.out.println(T1.getOrdinat());
        T1.getKuadran();
        System.out.println(T1.getJarakPusat());
        T1.refleksiX();
        T2.refleksiY();
        T3 = T1.getRefleksiX();
        T3.printTitik();
        T4 = T1.getRefleksiY();
        T4.printTitik();

        T2.setAbsis(6);
        T2.setOrdinat(7);
        System.out.println(T2.getJarak(T1));
    }

}
