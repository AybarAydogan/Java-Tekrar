package day1;

public class C01_HelloWorld{
// Bir satırlık yorumlar başına iki adet bölü çizgisi (slash) koyarak yapılır
    // Ben bu java ile programlamayı en iyi şekilde öğreneceğim.
    // öğrendikten sonra bununla çalışmalar yapacağım

    /*
    Bu çekilde yapılan yorumlarda
    istediğimiz kadar satırı yorum olarak ifade edebiliriz
     */


    /*
    Programcılığın temeli "Hello Wolrd" dür.
     */


    // Print Fonksiyonu
    // print fonsiyonu metinsel ifadelerin (String) ve diğer veri türlerini (variable)
    // metin olarak yazdırılmasını sağlar
    // bu fonksiyonda iki adet yazdırma olur
    // println: yazdırıp bir sonraki satıra geçer
    // print: yazdırıp aynı satırda kalıp sonraki işlemi aynı satırda devam ettirir.

    public static void main(String[] args) {
        // printLn Fonksiyonu
        System.out.println("Hello World");
        System.out.println("Hello Wise");

        // print Fonksiyonu
        System.out.println("Hello World");
        System.out.println("Hello Wise");

        /*
        soru 1-
        konsola Hello World ve "Hello World" yazdırın

         */

        /*
        \n : bir alt satırda yazmaya başlar
        \t : 1 TAB boşluk bırakır
        \" : yazar
        \' : yazar
        \\ : \ yazar
        \\W : boşlukların yerine ne yazacağımızı belirler
         */
        System.out.println("====================");
        System.out.println("Hello World\nHello Wise");
        System.out.println("Hello\tWorld");

        /*
         soru 1-
         konsola Hello World ve "Hello World" yazdırın
         */

        System.out.println("Hello World\t\n\"Hello Wise\"");


    }
}


