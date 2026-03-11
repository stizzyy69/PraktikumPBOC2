public class Garis {
    /* ATRIBUT */
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;

    /* METHOD */
    public Garis(){
        this.T1 = new Titik(0, 0);
        this.T2 = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik x, Titik y){
        this.T1 = x;
        this.T2 = y;
        counterGaris++;
    }
    
    static int getCounterGaris(){
        return counterGaris;
    }

    Titik getT1(){
        return T1;
    }

    Titik getT2(){
        return T2;
    }

    void setT1(double x, double y){
        this.T1 = new Titik(x, y);
    }

    void setT2(double x, double y){
        this.T2 = new Titik(x, y);
    }
    
    double getPanjang(){
        return T1.getJarak(T2);
    }

    double getGradien(){
        return (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
    }

    Titik getTitikTengah(){
        double x = (T1.getAbsis() + T2.getAbsis()) / 2;
        double y = (T1.getOrdinat() + T2.getOrdinat()) / 2;
        return new Titik(x,y);
    }

    boolean isHorizontal(){
        return T1.getOrdinat() == T2.getOrdinat();
    }

    boolean isVertikal(){
        return T1.getAbsis() == T2.getAbsis();
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Garis dari (" + T1.getAbsis() + ", " + T1.getOrdinat() + ") ke (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    } 

}
