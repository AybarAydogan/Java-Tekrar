package day7;

import java.util.Scanner;

public class Market {
    static Scanner scan=new Scanner(System.in);
    static String urunAdi="";
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static double toplam;
    static String sepet="";
    static boolean ekUrun=false;

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
        int secim=scan.nextInt();
        if (!(secim>=1 && secim<=5)){
            System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
            girisEkrani();
        }else{
            switch (secim){
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
        System.out.println("------- Çıkış Yapılıyor -------"); System.exit(0);
    }

    private static void fisYazdir() {
        System.out.println("------- Fiş Yazdırılıyor -------");
    }

    private static void market() {
        System.out.println("------- Market Reyonuna Hoşgeldiniz -------");
    }

    private static void sarkuteri() {
        System.out.println("------- Şarküteri Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu(UK) giriniz!");
        System.out.println("Kıyma Fiyatı: 250₺ UK: 21 \nPeynir Fiyatı: 400₺ UK: 22 \nSüt Fiyatı: 120₺ UK: 23 \nYumurta Fiyatı: 90₺ UK: 24 \nYoğurt Fiyatı: 150₺ UK: 25");

        while(!ekUrun)       {
            urunKodu= scan.nextInt();
            if (urunKodu>=21 && urunKodu<=25){
                System.out.println("Ne kadar alacaksınız( kg/lt/koli)");
                urunMiktari= scan.nextInt();
                switch (urunKodu){
                    case 21:
                        urunAdi="Kıyma";
                        urunFiyati=250.0;
                        System.out.println(urunMiktari+ "kg/lt/koli "+urunAdi+ " fiyatı: "+urunMiktari*urunFiyati+" ₺'dir");
                        break;
                    case 22:
                        urunAdi="Peynir";
                        urunFiyati=400.0;
                        System.out.println(urunMiktari+ "kg/lt/koli "+urunAdi+ " fiyatı: "+urunMiktari*urunFiyati+" ₺'dir");
                        break;
                    case 23:
                        urunAdi="Süt";
                        urunFiyati=120.0;
                        System.out.println(urunMiktari+ "kg/lt/koli "+urunAdi+ " fiyatı: "+urunMiktari*urunFiyati+" ₺'dir");
                        break;
                    case 24:
                        urunAdi="Yumurta";
                        urunFiyati=90.0;
                        System.out.println(urunMiktari+ "kg/lt/koli "+urunAdi+ " fiyatı: "+urunMiktari*urunFiyati+" ₺'dir");
                        break;
                    case 25:
                        urunAdi="Yoğurt";
                        urunFiyati=150.0;
                        System.out.println(urunMiktari+ "kg/lt/koli "+urunAdi+ " fiyatı: "+urunMiktari*urunFiyati+" ₺'dir");
                        break;
                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Oluşan Spet Tutarı: "+toplam);
                sepet+=urunAdi+" fiyatı:"+urunFiyati+"₺";
                System.out.println("Başka bir ürün almak isterseniz lütfen kodunu giriniz.\n Ana Menüye dönmek için 0 tuşuna basınız");
            }else if(urunKodu==0){
                girisEkrani();

            }
        }

    }


    private static void manav() {
        System.out.println("------- Manav Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen alacağınız ürün kodunu seciniz:\n11-Patates - 12₺ \n12-Soğan 12₺\n13-Elma 15₺\n14-Portakal - 20₺\n15-Ananas - 30₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 11 && urunKodu <= 15) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 11:
                        urunAdi = "Patates";
                        urunFiyati = 12;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 12:
                        urunAdi = "Soğan";
                        urunFiyati = 12;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 13:
                        urunAdi = "Elma";
                        urunFiyati = 15;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 14:
                        urunAdi = "Portakal";
                        urunFiyati = 20;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 15:
                        urunAdi = "Ananas";
                        urunFiyati = 30;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + ": " + urunFiyati + " TL dir\n";
                System.out.println(" Başka ürün almak ister misiniz? Eğer başka ürün almak isterseniz lütfen kodunu giriniz!\nAna Menüye dönmek için lütfen 0 (Sıfır) tuşuna basınız");


            } else if (urunKodu == 0) {
                girisEkrani();

            }

        }
    }

}
