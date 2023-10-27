package day8;

import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {

        /*
            erilen 2 katli bir array'de ayni index'e sahip elementleri toplayip, yeni
            lusturacagimiz tek katli bir array'e bu toplamlari atayin.
            nput : int[][] arr = {{3,4,5}, {2,3,6,7}};
            utput: [5, 7, 11]
        */

        int[][] arr = {{2,5,9,13,65,32,12}, {18,25,41,57,23}};

        int enKucukIndex = arr[0].length;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < enKucukIndex) { // en küçük indexli array'i bulduruyoruz.
                enKucukIndex = arr[i].length; // en küçük indexli array ataması yaptık
            }
        }
        int[] yeniArr = new int[enKucukIndex];
        int toplam = 0;

        for (int i = 0; i < yeniArr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                toplam += arr[j][i];
            }

            yeniArr[i] = toplam;
            toplam = 0;
        }

        System.out.println(Arrays.toString(yeniArr));
        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");
        System.out.println(Arrays.deepToString(arr));
    }
}
