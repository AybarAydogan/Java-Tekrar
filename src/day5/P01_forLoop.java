package day5;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        /*
        Sayacı ritmik ilerleyen döngü işlemlerinde forLoop kullanılır.
        Sayac ritmid değilse while kullanılır
        Döngüye en az bir kere girilicekse do while kullanılır
        */

            /*
             SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
                  dahil) 7 ila bolunebilen sayilari yazdirin.
            */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 7 == 0){
                System.out.print(i + "_");
            }

        }
        System.out.println("");
        System.out.println("============ İŞLEM TAMAMLANDI ============");

    }
}
