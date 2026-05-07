public class Asersi1 {
    public static void main(String[] args) throws Exception {
        int x = 0;
        
        if (x > 0){
            System.err.println("X bilangan positif");
        } else {
            assert (x < 0) : "Ada Kesalahan kode";
            System.err.println("X bilangan negatif");
        }
    }
}