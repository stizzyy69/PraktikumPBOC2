public abstract class Anabul {
    protected String panggilan;

    public Anabul(String nama) {
        this.panggilan = nama;
    }

    public String getNama(){
        return panggilan;
    }

    public void setNama(String nama){
        this.panggilan = nama;
    }

    public abstract double getBobot();
    public abstract void Gerak();
    public abstract void Bersuara();
}





