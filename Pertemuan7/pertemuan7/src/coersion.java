public class coersion {
     public static void main(String[] args) {
        // a.
        int nilai = 65;
        System.out.println("Integer: " + nilai);
        System.out.println("Karakter: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        // b.
        int x = 10;
        double y = (double) x;
        int z = (int) y;

        System.out.println("\nInteger awal: " + x);
        System.out.println("Jadi double: " + y);
        System.out.println("Kembali ke integer: " + z);

        // c. 
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("\nS: " + S);
        System.out.println("Z : " + Z);

        // d.
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("\nR: " + R);
        System.out.println("D: " + D);

        // e.
        int A = Integer.parseInt(S);
        System.out.println("\nA: " + A);

        // f.
        String T = String.valueOf(A);
        System.out.println("T" + T);
    }
}