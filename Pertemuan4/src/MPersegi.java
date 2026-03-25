public class MPersegi {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(10, "Putih", "border");

        System.out.println("Panjang sisi: " + P1.getSisi());
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Panjang diagonal: " + P1.getDiagonal());

        P1.printInfo();
        BangunDatar.printCounterBangunDatar();

    }
    
}
