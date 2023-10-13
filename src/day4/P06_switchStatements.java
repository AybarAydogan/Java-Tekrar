package day4;

import java.util.Scanner;

public class P06_switchStatements {
    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen iki basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        if (sayi >= 10 && sayi <= 99) {
            int birlerbasamagi = sayi % 10;
            int onlarbamagi = sayi / 10;

            switch (onlarbamagi) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.println("Altmış");
                    break;
                case 7:
                    System.out.print("Yetmiş");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;

            }
            switch (birlerbasamagi) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;

            }
        }


    }

}
