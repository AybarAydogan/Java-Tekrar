package day8;

import java.util.Arrays;

public class P02 {
    public static void main(String[] args) {

         /*
        Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int[] input = {13, 29, 86, 107};
        elementleriSagakaydir(input);
    }

    private static void elementleriSagakaydir(int[] input) {
        int[] yeniArr = new int[input.length];
        yeniArr[0] = input[input.length - 1]; //Son indexteki elemanı yeni arrray'in ilk elemanı olarak atadık.
        for (int i = 0; i < input.length - 1; i++) { //forLoop'larda i aralığı indexler arası aralıktır.
            yeniArr[i + 1] = input[i];
        }
        input = yeniArr;
        System.out.println(Arrays.toString(input));
    }
}
