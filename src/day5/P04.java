package day5;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz ve yazdırınız.
         *  Ama c harfine gelirse döngüden çıkılsın
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız");
        String cumle = scanner.nextLine();
        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.toUpperCase().charAt(i) == 'A') {
                sayac++;
            }
            if (cumle.toUpperCase().charAt(i) == 'C') {
                break;
            }
        }

        System.out.println("Cümlenizde " + sayac + " adet a harfi vardır");

    }
}
