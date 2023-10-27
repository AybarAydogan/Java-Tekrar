package day9;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        /*
              Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
              kullanildigini yazdirin, kullanilmadiysa "harf cumlede kullanilmamis" yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir cümle yazınız : ");
        String cumle = scanner.nextLine();

        System.out.print("Lütfen bir harf giriniz : ");
        String harf = scanner.next();

        String[] cumleHarf = cumle.split("");

        System.out.println(Arrays.toString(cumleHarf));

        int sayac = 0;

        for (String each : cumleHarf) {

            if (each.equalsIgnoreCase(harf)) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Harf cümlede kullanılmamış");
        } else {
            System.out.println(harf + "'i cümlede " + sayac + " kez kullanılmıştır");
        }
    }
}
