package day4;

import java.util.Scanner;

public class P08_stringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı aralarında bir boşluk olacak şekilde giriniz");
        String name = scan.nextLine();
        String name2 = "TARIK YIGIT";

        //   if (name==name2){
        //       System.out.println("Doğru giriş yapıldı");
        //   }else{
        //       System.out.println("Yanlış giriş yapıldı");
        //   }

        //  if (name.equals(name2)){
        //      System.out.println("Doğru giriş yapıldı");
        //  }else{
        //      System.out.println("Yanlış giriş yapıldı");
        //  }
            /*
            equals ile == arasındaki fark equals'ın girilen değerin referansına bakmasıdır.
             */

        //  if (name.equalsIgnoreCase(name2)){
        //      System.out.println("Doğru giriş yapıldı");
        //  }else{
        //      System.out.println("Yanlış giriş yapıldı");
        //  }

        //String name3=new String("Tarık Yıgıt");

        //if (name.equals(name3)){
        //    System.out.println("Doğru giriş yapıldı");
        //}else{
        //    System.out.println("Yanlış giriş yapıldı");
        //}

        System.out.println("Girilen ismin uzunluğu: " + name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 7));

    }
}
