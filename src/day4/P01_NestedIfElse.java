package day4;

import java.util.Scanner;

public class P01_NestedIfElse {
    public static void main(String[] args) {

        /*
           1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
              Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
                : 1999 yılı 9. ay öncesi işe başlamış olmak
                : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
                : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen işe giriş tarihinizi yıl ve ay olarak 1999.09 şekilnde giriniz");
        double giris = scanner.nextDouble();
        if (giris > 1999.09) {
            System.out.println("EYT Kanun düzenlemesine tabi değilseniz !");
        } else {
            System.out.println("Lütfen Cinsiyetinizi K veya E olarak giriniz:");
            char cinsiyet = scanner.next().charAt(0);
            System.out.println("Lütfen prim ödeme gün sayınızı giriniz: ");
            int primGun = scanner.nextInt();
            System.out.println("Lütfen hizmet yılı sürenizi giriniz: ");
            int hizmetSuresi = scanner.nextInt();

            if (cinsiyet == 'E' || cinsiyet == 'e') {
                if (primGun >= 5500 && hizmetSuresi >= 25) {
                    System.out.println("Kanun yürürlüğe girdiği tarihte emekli olabilirsiniz");
                } else if (primGun < 5500 && hizmetSuresi >= 25) {
                    System.out.println("Emekli olabilmek için " + (5500 - primGun) + " gün prim ödemelisiniz.");
                } else if (primGun >= 5500 && hizmetSuresi < 25) {
                    System.out.println("Emekli olabilmek için " + (25 - hizmetSuresi) + " yıl daha çalışmalısınız.");
                } else {
                    System.out.println("Maalesef henüz EYT şartlarının ikisinde sağlamıyorsunuz");
                    System.out.println("Hizmet süresi eksiği: " + (25 - hizmetSuresi) + " yıl");
                    System.out.println("Eksik prim gün sayısı: " + (5500 - primGun) + " gün");
                }

            } else if (cinsiyet == 'K' || cinsiyet == 'k') {
                if (primGun >= 500 && hizmetSuresi >= 20) {
                    System.out.println("Kanun yürürlüğe girdiği tarihte emekli olabilirsiniz");
                } else if (primGun < 5000 && hizmetSuresi >= 20) {
                    System.out.println("Emekli olabilmek için " + (5000 - primGun) + " gün prim ödemelisiniz.");
                } else if (primGun >= 5000 && hizmetSuresi < 20) {
                    System.out.println("Emekli olabilmek için " + (20 - hizmetSuresi) + " yıl daha çalışmalısınız.");
                } else {
                    System.out.println("Maalesef henüz EYT şartlarının ikisinde sağlamıyorsunuz");
                    System.out.println("Hizmet süresi eksiği: " + (20 - hizmetSuresi));
                    System.out.println("Eksik prim gün sayısı: " + (5000 - primGun));
                }
            } else {
                System.out.println("Yanlış bir değer girdiğiniz ");
            }

        }


    }
}
