public class Main {
    private static void tampilkanAnabul(Anabul anabul){
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }

    public static void main(String[] args) {
        // KELAS GENERIK
        System.out.println("\nKELAS GENERIK");
        Datum<Anabul> data = new Datum<>(new Kucing("Mimi", 3.0));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Miki"));

        tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Kiki", 4.2));
        tampilkanAnabul(data.getIsi());
        System.out.println();
        
        //METHOD GENERIK
        System.out.println("\nMETHOD GENERIK");
        System.out.println("\nProsedur Tukar");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kitty", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Doggy"));

        System.out.println("Sebelum tukar:");
        tampilkanAnabul(hewan1.getIsi());
        tampilkanAnabul(hewan2.getIsi());

        OperatorGenerik.tukar(hewan1, hewan2);

        System.out.println("\nSesudah tukar:");
        tampilkanAnabul(hewan1.getIsi());
        tampilkanAnabul(hewan2.getIsi());

        //KELAS DATA
        System.out.println("\nKELAS DATA");

        Data<Anabul> daftarAnabul = new Data<>();

        daftarAnabul.setIsi(1, new Kucing("Milo", 3.5));
        daftarAnabul.setIsi(2, new Anjing("Buddy"));
        daftarAnabul.setIsi(3, new Burung("Rio"));
        daftarAnabul.setIsi(4, new Anggora("Snowy", 4.8));
        daftarAnabul.setIsi(5, new Kembangtelon("Molly", 5.1));

        System.out.println("\nIsi Data:");

        for (int i = 1; i <= daftarAnabul.getSize(); i++) {
            tampilkanAnabul(daftarAnabul.getIsi(i));
            System.out.println();
        }

        System.out.println("Jumlah data : " + daftarAnabul.getSize());
    }
}

        