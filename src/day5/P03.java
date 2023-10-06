package day5;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin, sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i <= 255; i++) {
            System.out.println(i + " - " + (char)i);


        }
    }
}
