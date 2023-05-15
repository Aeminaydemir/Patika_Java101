import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float matematik,fizik,kimya,turkce ,tarih,muzik,toplam,ortalama;
        String durum;
        Scanner not=new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz:");
        matematik=not.nextFloat();
        System.out.println("Lütfen fizik notunuzu giriniz:");
        fizik=not.nextFloat();
        System.out.println("Lütfen kimya notunuzu giriniz:");
        kimya=not.nextFloat();
        System.out.println("Lütfen türkçe notunuzu giriniz:");
        turkce=not.nextFloat();
        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarih=not.nextFloat();
        System.out.println("Lütfen muzik notunuzu giriniz:");
        muzik=not.nextFloat();
        toplam=matematik+fizik+kimya+turkce+tarih+muzik;
        ortalama=toplam/6.0f;
        System.out.println("Ortalamanız:"+ortalama);
        durum=ortalama < 60.0f ? "Sınıfta kaldı." : "Sınıfı geçti.";
        System.out.println(durum);
    }
}