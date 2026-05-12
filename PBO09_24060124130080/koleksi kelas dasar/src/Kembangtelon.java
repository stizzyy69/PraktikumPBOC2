public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot){
        super(nama,bobot);
    }

    @Override
    public void Gerak(){
        System.out.println(panggilan + " berjalan santai");
    }

    @Override
    public void Bersuara(){
        System.out.println(panggilan + " meong nyaring");
    }
    
}
