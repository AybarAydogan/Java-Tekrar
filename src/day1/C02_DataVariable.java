package day1;

public class C02_DataVariable {
    public static void main(String[] args) {
        // java da data türleri primitive ve non-primiyive olarak iki ye ayrılır
        // bu data type'leri ile variable oluşturarak bu variable'lara değer atayabiliriz.

        String name = "Aybar";
        String surname = "Aydoğan";
        String job = "Student";
        int age = 19;

        System.out.println("Adı: " + name + "\nSoyadı " + surname + "\nMesleği: " + job + "\nYaş: " + age);

        String name2="Esra";
        String surname2="Yılmaz";
        String job2="Student";
        int age2=18;

        System.out.println("Adı: "+name2+"\nSoyadı: "+surname2+"\nMesleği: "+job2+"\nYaş: "+age2);

        String name3="Ayça";
        System.out.println("name3 = " + name3);
        String surname3="Ovalı";
        System.out.println("surname3 = " + surname3);
        String job3="Student";
        System.out.println("Mesleği = " + job3);
        int age3=18;
    }
}
