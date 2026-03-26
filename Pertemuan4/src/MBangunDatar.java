

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(5, "Kuning", "Hitam");
        Persegi P2 = new Persegi(10, "Hijau", "Hitam");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Hitam");
        Lingkaran L2 = new Lingkaran(14, "Biru", "Hitam");

        System.out.println("Luas P1 = " + P1.getLuas());
        System.out.println("Luas P2 = " + P2.getLuas());
        System.out.println("Luas L1 = " + L1.getLuas());
        System.out.println("Luas L2 = " + L2.getLuas());

        System.out.println("Keliling P1 = " + P1.getKeliling());
        System.out.println("Keliling P1 = " + P2.getKeliling());
        System.out.println("Keliling L1 = " + L1.getKeliling());
        System.out.println("Keliling L2 = " + L2.getKeliling());


        System.out.println("Luas P1 == L1? " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1? " + P1.isEqualKeliling(L1));

        System.out.println("Sisi sebelum di zoom in: " + ((Persegi) P1).getSisi());
        ((Persegi) P1).zoomIn();
        System.out.println("Sisi setelah di zoom in: " + ((Persegi) P1).getSisi());

        System.out.println("Sisi sebelum di zoom out: " + ((Lingkaran) L1).getJari());
        ((Lingkaran) L1).zoomOut();
        System.out.println("Sisi setelah di zoom out: " + ((Lingkaran) L1).getJari());

        System.out.println("Sisi sebelum di zoom: " + ((Persegi) P2).getSisi());
        ((Persegi) P2).zoom(10);
        System.out.println("Sisi setelah di zoom: " + ((Persegi) P2).getSisi());
    
    }
}
