package day6;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        /*
          Kullanıcıdan bir sayo alıp sayinin rakamları toplamini while loop ile yapınız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println(toplam);


    }
}
