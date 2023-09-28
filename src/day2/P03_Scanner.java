package day2;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {

        // Bazen kod yazarken bazı variablelar için kullanıcıdan değer almak gerekir
        // Bu gibi durumlar da Scanner classından faydalanır.

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz");
        String name = scanner.next();
        System.out.print("Lütfen soyadınızı giriniz");
        String surname = scanner.next();

        System.out.println("Adınız: " +name+" "+surname+" olarak kaydedildi.");



    }
}
