package day5;

public class tekrarsızString {
    public static void main(String[] args) {

        //verilen String'deki kullalanilan harfleri
        // kelimeyi ve tekrarsiz halini yazdirip
        // kelimede kullanilan farkli harf sayisini yazdırın

        String metin = "Have a nice day";
        String islenecekTerim = metin.replaceAll("\\W",""); // Haveaniceday
        System.out.println(islenecekTerim);

    }

}
