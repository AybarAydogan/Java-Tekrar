package day4;

import java.util.Scanner;

public class P07_switchStatements {
    public static void main(String[] args) {
          /*
        Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bilgi istediğiniz yılı giriniz");
        int year = scan.nextInt();
        System.out.println("Gün sayısını aradığınız ayın numarasını giriniz");
        int numMonth = scan.nextInt();
        int numdays;

        switch (numMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numdays = 31;
                System.out.println("Girdiğiniz aydaki gün sayısı: " + numdays);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numdays = 30;
                System.out.println("Girdiğiniz aydaki gün sayısı: " + numdays);
                break;
            case 2:
                numdays = (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) ? 29 : 28;
                System.out.println("Girdiğiniz aydaki gün sayısı: " + numdays);
                break;
            default:
                System.out.println("Geçersiz bir ay numarası girdiniz. Miladi takvimde 12 ay vardır.");
        }


    }
}
