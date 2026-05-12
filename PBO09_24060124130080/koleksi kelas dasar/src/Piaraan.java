import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private final LinkedList<Anabul> lanabul;

    public Piaraan(){
        lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // b.i
    public int getNbelm(){
        return nbelm;
    }

    // b.ii
    public void enqueueAnabul(Anabul anabul){
        lanabul.addLast(anabul);
        nbelm++;
    }

    // b.iii
    public boolean isMember(Anabul anabul){
        return lanabul.contains(anabul);
    }

    // b.iv
    public Anabul getAnabul(){
        return lanabul.peekFirst();
    }

    // b.v
    public Anabul dequeueAnabul(){
        Anabul removed = lanabul.pollFirst();
    return removed;
    }

    // c.
    public void showAnabul(){
        System.out.println(lanabul);
    }

    // d.
    public int countKucing(){
        int count = 0;
        for (Anabul a : lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e.
    public double bobotKucing(){
        double bobot = 0;
        for (Anabul a: lanabul){
            if (a instanceof Kucing){
                bobot += ((Kucing) a).getBobot();
            }
        }
        return bobot;
    }

    // f.
    public void showJenisAnabul(){
        for (Anabul a : lanabul){
            System.out.println(a.getNama() + " - " + a.getClass().getName());
        }
    }
}
