/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0
 * 
 */


//class Lingkaran
class Lingkaran{
    public double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh 0!!!!!!!!!!!!111!!!!!111!!!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}