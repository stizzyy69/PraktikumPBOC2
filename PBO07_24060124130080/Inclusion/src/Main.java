public class Main {

    public static void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();
        System.out.println();
    }

    public static void main(String[] args) {

        Anabul kucing = new Kucing("Kitty");
        Anabul anjing = new Anjing("Doggy");
        Anabul burung = new Burung("Birdy");

        tampilkanAnabul(kucing);
        tampilkanAnabul(anjing);
        tampilkanAnabul(burung);
    }
}