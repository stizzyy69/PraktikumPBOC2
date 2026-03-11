public class MKendaraan {
    public static void main(String[] args){
        Kendaraan BMW = new Kendaraan();
        Kendaraan Supra = new Kendaraan();

        BMW.setNoPlat("1234");
        BMW.setJenis("Mobil");
        BMW.printKendaraan();

        Supra.setNoPlat("5678");
        Supra.setJenis("Motor");
        Supra.printKendaraan();
    }
}