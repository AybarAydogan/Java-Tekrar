package day5;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        /*
          Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin ve ters metni yazdırın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sadece metin içeren bir metin giriniz");
        String metin = scanner.nextLine();
        String tersMetin = "";

        for (int i = metin.length(); i > 0; i--) {
            tersMetin += metin.substring(i - 1, i);
        }
        metin = tersMetin;
        System.out.println("Girilen metnin tersten yazılışı : " + metin);


    }
}
