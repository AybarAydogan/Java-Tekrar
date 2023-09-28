package day2;

public class P02_Variable {
    public static void main(String[] args) {

        int a = 12;
        int b = 23;
        int c = 65;
        int d; // int variable değer atamadan oluşturulur fakat değer atamadan kullanılmaz
        d = 100;

        System.out.println("Toplam = " + (a + b + c + d));
        // d için değer atamazsak bu satır Compile Time Error verir
        // CTE : Kodu yazarken henüz çalıştırılmadan farkedilen hatadır
        // RTE : Kodu çalıştırınca ortaya çıkar. Run Time Error

        String isim = "aybar";
        String Soyisim = "aydoğan";

        System.out.println("İsim Soyisim = " + isim + " " + Soyisim);
        System.out.println("");
        System.out.println("İsim Soyisim: " + isim.toUpperCase().charAt(0) + "." + Soyisim.toUpperCase());
        System.out.println("İsim Soyisim: " + isim.toUpperCase() + " " + Soyisim.toUpperCase());
        String isim2 = "UĞURCAN";
        String soyisim2 = "AYDOĞAN";

        System.out.println("İsim: " + isim2.toLowerCase() + " " + soyisim2.toLowerCase());

    }
}
