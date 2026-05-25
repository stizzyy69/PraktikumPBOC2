public class MTeman {
    public static void main(String[] args) {
        Teman T1 = new Teman();

        T1.addNama("Dandy");
        T1.addNama("John Grace");
        T1.addNama("Jax");
        T1.addNama("John Nullscape");
        T1.addNama("John Doe");
        T1.addNama("Jane Doe");
        T1.addNama("John Wick");

        System.out.println(T1.getNama(1));
        System.out.println(T1.getNbelm());
        T1.setNama(6, "Leon");
        T1.delNama("Jax");
        System.out.println(T1.isMember("Dandy"));
        T1.gantiNama("John Nullscape", "Dipsy");
        System.out.println(T1.countNama("Jane Doe"));
        T1.showTeman();
    }
}
