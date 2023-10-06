package day5;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        /*
          Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
          dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
          baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değeri olacak olan pozitif tamsayı giriniz");
        int basDegeri = scanner.nextInt();
        System.out.println("Lütfen bitiş değeri olacak olan pozitif tamsayı giriniz");
        int bitisDegeri = scanner.nextInt();
        int toplam = 0;

        if (bitisDegeri < basDegeri) {
            System.out.println("==== Başlangıç değeri bitiş değerinden büyük olamaz ====");
        } else {
            for (int i = basDegeri; i <= bitisDegeri; i++) {
                toplam += i;
            }

        }

        System.out.println("Girdiğiniz aralıktaki sayıların toplam = " + toplam);
    }
}
