package day8;

import java.util.ArrayList;
import java.util.List;

public class P04 {
    public static void main(String[] args) {

        /* 
           Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
           kismini list olarak bize donduren bir method olusturun
         */

        List<String> kelimeler = new ArrayList<>();

        kelimeler.add("elma");
        kelimeler.add("armut");
        kelimeler.add("muz");
        kelimeler.add("ananas");
        kelimeler.add("ayva");
        kelimeler.add("portakal");
        kelimeler.add("kivi");
        System.out.println("İlk oluşturulan Liste : " + kelimeler);

        System.out.println(istenmeyenHarfliElementiSil(kelimeler, "a"));
    }

    private static List<String> istenmeyenHarfliElementiSil(List<String> kelimeler, String istenmeyenHarf) {

        List<String> yeniList = new ArrayList<>();
        for (int i = 0; i < kelimeler.size(); i++) {

            if (!kelimeler.get(i).contains(istenmeyenHarf)) {
                yeniList.add(kelimeler.get(i));
            }

        }
        return yeniList;
    }
}
