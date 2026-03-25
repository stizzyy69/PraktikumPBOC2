public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(7, "putih", "border");

        System.out.println("Jari-Jari: " + L1.getJari());
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        L1.setJari(14);
        System.out.println("Jari-jari setelah diubah: " + L1.getJari());
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
    }
    
}
