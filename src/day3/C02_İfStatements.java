package day3;

import java.util.Scanner;

public class C02_İfStatements {
    public static void main(String[] args) {

        /*
            1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
               Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
                       *** String icin equals method'unusalı kullanin
 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bugün günlerden hangi gün: ");
        String gun = scan.next().toLowerCase();
        /*
        ||: veya (herhangi biri)  or
        &&: ve (her ikisi de)  and
         */
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bugün Haftaiçi bir gün");
        }
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugün Haftasonu bir gün");
        }
        if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")
                || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("O girdiğiniz bir gün değil. Yanlış girdiniz");
        }
    }
}
