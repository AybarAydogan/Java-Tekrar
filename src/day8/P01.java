package day8;

public class P01 {
    public static void main(String[] args) {



    /*
           Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
           kullanildigini yazdiran bir method olusturun.
     */

        int[] arr = {2, 3, 6, 12, 25, 36, 27, 7, 6, 38, 19, 102, 36};
        istenenElemaniAra(arr, 13);

    }

    private static void istenenElemaniAra(int[] arr, int istenen) {

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenen) {
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aranan " + istenen + " elemanı array'de yoktur");
        }else {
            System.out.println("Aradığınız " + istenen + " elemanından array içerisinde " + sayac + " adet vardır");
        }
    }

}
