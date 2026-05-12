// Nama: Wipin Saputra
// NIM: 24060124130080
// Lab: C2
// File: Teman.java

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm(){
        return nbelm;
    }

    // b. getNama()
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // c. setNama(indeks, nama)
    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }
  
    // d. addNama(nama)
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama)
    public void delNama(String nama){
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // f. isMember(nama)
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }


    // g. gantiNama(nama,namabaru)
    public void gantiNama(String nama, String namabaru){
        int idx = Lnama.indexOf(nama);
            if (idx != -1){
                Lnama.set(idx, namabaru);
            }
        }

    // h. countNama(nama)
    public int countNama(String nama){
        int count = 0;
        if (Lnama.contains(nama)){
            count++;
        }
        return count;
    }

    // i. showTeman()
    public void showTeman(){
        System.out.println(Lnama);
    }
}
