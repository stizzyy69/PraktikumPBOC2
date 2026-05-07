public class Coercion {
    public static void main(String[] args) {

        //a
        int nilaiInt = 65;

        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = nilaiInt;

        System.out.println("Integer : " + nilaiInt);
        System.out.println("Char    : " + nilaiChar);
        System.out.println("Double  : " + nilaiDouble);

        //b
        int nilaiIntBaru = (int) nilaiDouble;

        System.out.println("Integer baru : " + nilaiIntBaru);

        //c
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S = " + S);
        System.out.println("Z = " + Z);

        //d
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R = " + R);
        System.out.println("D = " + D);

        //e
        Integer A = Integer.parseInt(S);

        System.out.println("A = " + A);

        //f
        String T = A.toString();

        System.out.println("T = " + T);
    }
}