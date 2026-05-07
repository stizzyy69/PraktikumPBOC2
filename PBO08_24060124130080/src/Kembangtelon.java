public class Kembangtelon extends Kucing {

    Kembangtelon(String nama, double bobot){
        super(nama,bobot);
    }

    @Override
    void Gerak(){
        System.out.println(nama + " berjalan santai");
    }

    @Override
    void Bersuara(){
        System.out.println(nama + " meong nyaring");
    }
    
}
