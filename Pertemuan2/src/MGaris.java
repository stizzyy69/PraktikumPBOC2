public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(1,2);
        Titik T2 = new Titik(5,6);
    
        Garis G1 = new Garis(T1, T2);

        System.out.println("Garis 1:");
        G1.printGaris();

        System.out.println("Panjang G1: " + G1.getPanjang());
        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik Tengah G1 : (" + tengah.getAbsis() + "," + tengah.getOrdinat() + ")");
        System.out.println("Apakah G1 Horizontal? = " + G1.isHorizontal());
        System.out.println("Apakah G1 Vertikal = " + G1.isVertikal());
        
        Titik T3 = new Titik(2, 4);
        Titik T4 = new Titik(6, 8);

        Garis G2 = new Garis (T3, T4);

        System.out.println("Apakah Garis 1 Sejajar Garis 2? = " + G1.isSejajar(G2));
        System.out.println("Apakah Garis 1 Tegak Lurus Dengan Garis 2? = " + G1.isTegakLurus(G2));

        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());

        G1.setT1(1, 6);
        System.out.println("T1 setelah diubah: (" + G1.getT1().getAbsis() + "," + G2.getT1().getOrdinat() + ")");
        System.out.println("Apakah G1 horizontal setelah mengubah T1 menjadi (1, 6)? = " + G1.isHorizontal());

        G2.setT2(2, 8);
        System.out.println("T2 setelah diubah: (" + G2.getT2().getAbsis() + "," + G2.getT2().getOrdinat() + ")");
        System.out.println("Apakah G2 vertikal setelah mengubah T2 menjadi (2, 8)? = " + G2.isVertikal());


    }
    
}
