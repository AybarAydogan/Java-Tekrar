package day6;

import java.util.Scanner;

public class Market {
    static Scanner scan = new Scanner(System.in);
    static String urunAdi = "";
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static double toplam;
    static String sepet = "";
    static boolean ekUrun = false;


    public static void main(String[] args) {
           /*
   *
  ==================== WISE T127 MARKET ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */
        girisEkrani();

    }

    private static void girisEkrani() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!");
        System.out.println("Manav Ürünleri için 1\nŞarküteri Ürünleri için 2\nMarket Ürünleri için 3\nFiş Yazdırmak için 4\nÇıkış yapmak için 5");
        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    private static void cikis() {
        System.out.println("------- Çıkış Yapılıyor -------");
    }

    private static void fisYazdir() {
        System.out.println("------- Fiş Yazdırılıyor -------");
    }

    private static void market() {
        System.out.println("------- Market Reyonuna Hoşgeldiniz -------");
    }

    private static void sarkuteri() {
        System.out.println("------- Şarküteri Reyonuna Hoşgeldiniz -------");
    }

    private static void manav() {
        System.out.println("------- Manav Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu(UK) giriniz!");
        System.out.println("Elma Fiyatı: 25₺ UK: 11 \nYerli Muz Fiyatı: 40₺ UK: 12 \nDomates Fiyatı: 20₺ UK: 13 \nÇilek Fiyatı: 100₺ UK: 14 \nKarnabahar Fiyatı: 60₺ UK: 15");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 11 && urunKodu <= 15) {
                System.out.print("Kaç kg alacaksınız: ");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 11:
                        urunAdi = "Elma";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                }
            }

        }
    }


}
