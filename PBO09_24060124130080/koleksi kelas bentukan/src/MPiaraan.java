public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Milo", 4.5);
        Kucing k2 = new Kucing("Oyeng", 3.8);

        Anjing a1 = new Anjing("Doggy", 7.2);

        Burung b1 = new Burung("Ciko", 1.1);

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        p.showAnabul();

        System.out.println("\nJumlah Kucing : " + p.countKucing());

        System.out.println("Total Bobot Kucing : " + p.bobotKucing());

        System.out.println();

        p.showJenisAnabul();

        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());

        System.out.println("\nDequeue:");
        System.out.println(p.dequeueAnabul().getNama());

        System.out.println("\nSetelah dequeue:");
        p.showAnabul();
    }
}
