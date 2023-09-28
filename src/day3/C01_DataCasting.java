package day3;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*
         1-Double olarak verilen 3 sayının toplamını int olarak yazdırın
        ipucu: double>float>long>int>short>byte
        */

        double a = 3, b = 7, c = 3.12;
        int toplam = (int) (a + b + c);
        System.out.println("toplam = " + toplam);
        // System.out.println("a = " + a);

        /*
           2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
                Girdiğiniz harf :
                Girdiğiniz harften sonraki  3 harf :
              şeklinde yazdırın.
              ipucu: char
            */

        Scanner wq = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");
        char harf = wq.next().charAt(0);
        System.out.println("Girdiğiniz harf: " + harf);
        System.out.println("Girdiğiniz harften sonraki 3 harf: " + (char) (harf + 1) + ", " + (char) (harf + 2) + ", " + (char) (harf + 3) + "'dir.");


    }
}
