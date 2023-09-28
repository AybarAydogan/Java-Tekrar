package day2;

public class P01_DataType {
    public static void main(String[] args) {

        /*
        byte: sadece tam sayı değerler alır. 8 bit
        short: sadece tam sayı değerler alır. 16 bit
        int: saece tam sayı değerler alır. 32 bit
        long: sadece tam sayı değerler alıyor. 64 bit

        floot: ondalıklı sayıları tanımlarız. (sonuna f koyarız)
        double: ondalıklı sayıları tanımlar.

        byte<short<int<long<floot<double

        boolean: mantıksal ifadeler. false ve true
        char: tek karakter alır. ASCII karakterler kullanılır. diğerleri tek tırnak içinde yazılır.

        */

        byte b1 = Byte.MAX_VALUE;
        System.out.println("BYTE Maks. = " + b1);
        byte b2 = Byte.MIN_VALUE;
        System.out.println("b2 = " + b2);
        short sh1 = Short.MAX_VALUE;
        System.out.println("sh1 = " + sh1);
        int i1 = Integer.MAX_VALUE;
        System.out.println("i1 = " + i1);
        int i2 = Integer.MIN_VALUE;
        System.out.println("i2 = " + i2);


        long l1 = Long.MAX_VALUE;
        System.out.println("l1 = " + l1);

        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        System.out.println("f2 = " + f2);
        System.out.println("f1 = " + f1);

        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println("d2 = " + d2);
        System.out.println("d1 = " + d1);

        char c1 = 'm';
        System.out.println("c1 = " + c1);

        char c2 = 67;
        System.out.println("c2 = " + c2);

        String name = "Tarık";
        System.out.println("name = " + name);


    }
}
