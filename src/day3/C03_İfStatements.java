package day3;

import java.util.Scanner;

public class C03_İfStatements {
    public static void main(String[] args) {

        /*
1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
      85-100 -----> AA
      80-85 ------> BA
      75-80 ------> BB
      65-75 ------> CB
      50-65 ------> CC
      50 Altı ise  ------> FF
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sınav notunuzu giriniz: ");
        int not = scanner.nextInt();

        if (not >= 85 && not <= 100) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı AA");
        } else if (not >= 80 && not < 85) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı BA");
        } else if (not >= 75 && not < 80) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı BB");
        } else if (not >= 65 && not < 75) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı CB");
        } else if (not >= 50 && not < 65) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı CC");
        } else if (not >= 0 && not < 50) {
            System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı FF");
        } else {
            System.out.println("Yanlış bir değer girdiniz. Lütfen 0-100 bir değer giriniz");
        }

        /*

           2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
             yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
             olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
              */


        System.out.print("Lütfen Cinsiyetinizi E veya K olarak giriniz: ");
        char cinsiyet = scanner.next().charAt(0);
        System.out.print("Lütfen yaşınızı giriniz :");
        int yas = scanner.nextInt();

        if ((cinsiyet == 'K' || cinsiyet == 'k') && yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cinsiyet == 'K' || cinsiyet == 'k') && yas < 60) {
            System.out.println("Emekli oLmak için " + (60 - yas) + " yıl daha çalışmalısınız");
        }
        if ((cinsiyet == 'E' || cinsiyet == 'e') && yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cinsiyet == 'E' || cinsiyet == 'e') && yas < 65) {
            System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışmalısınız");
        } else {
            System.out.println("Girdiğiniz değerlerden en az biri yanlıştır");
        }
    }
}
