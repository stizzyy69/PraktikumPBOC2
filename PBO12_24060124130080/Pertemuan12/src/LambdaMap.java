import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */

public class LambdaMap{
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124130067","Adi");
        mahasiswaMap.put("24060124130080", "Wipin");
        mahasiswaMap.put("24060124120000", "Bambang");
        mahasiswaMap.put("240210420401240214021041204043040214", "CICCICICIICICIC");
        mahasiswaMap.put("10010010101", "AAAAAAAAAAAAAAA");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}