package day7;

public class P02 {
    public static void main(String[] args) {

        System.out.println(P01.kutle);
        System.out.println(P01.yas);
        //  System.out.println(P01.isim); P01 class'ındaki verilerden sadece static olanlara ulaşabiliriz.

        P01 obje=new P01();
        System.out.println(P01.yas);
        System.out.println(obje.isim);
        System.out.println(obje.soyisim);
        obje.isim="Nevfel";
        obje.soyisim="Deniz";
        System.out.println(obje.soyisim);
        P01 obje2=new P01();
        obje2.isim="Nazime";
        System.out.println(obje2.isim);
        System.out.println(obje.isim);

    }
}
