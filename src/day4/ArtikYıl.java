package day4;

import java.util.Scanner;

public class ArtikYıl {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bilgi istediğiniz yılı giriniz: ");
        int year= scan.nextInt();
        String numdays;
        System.out.println(numdays=(year%4==0 && !(year%100==0) || year%400==0)?"Girdiğiniz yıl bir Artık Yıldır":"Girdiğiniz yıl bir Artık Yıl");
    }
}
