package day4;

import java.util.Scanner;

public class P04_ternaryOpertaor {

        /*
Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
kucukse "Maalesef kaldin" yazdirin.
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Yıl Sonu Notunuzu Giriniz: ");
        double not= scan.nextDouble();
        System.out.println(not>=50?"Sınıfı "+not+ " Ortalamasıyla Geçtiniz":"Maalsef Kaldınız");
    }
}
