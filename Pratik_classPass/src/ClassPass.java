import java.util.Scanner;

public class ClassPass {
    public static void main(String[] args) {
        float matematik,fizik,kimya,turkce ,muzik,toplam,ortalama,gd=5.0f;
        Scanner not=new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz:");
        matematik=not.nextFloat();
        if (matematik<0 || matematik>100) {
            System.out.println("!!!Geçersiz Notlandırma!!!");
            matematik=0; gd-=1;
        }
        System.out.println("Lütfen fizik notunuzu giriniz:");
        fizik=not.nextFloat();
        if (fizik<0 || fizik>100) {
            System.out.println("!!!Geçersiz Notlandırma!!!");
            fizik=0; gd-=1;
        }
        System.out.println("Lütfen kimya notunuzu giriniz:");
        kimya=not.nextFloat();
        if (kimya<0 || kimya>100) {
            System.out.println("!!!Geçersiz Notlandırma!!!");
            kimya=0; gd-=1;
        }
        System.out.println("Lütfen türkçe notunuzu giriniz:");
        turkce=not.nextFloat();
        if (turkce<0 || turkce>100) {
            System.out.println("!!!Geçersiz Notlandırma!!!");
            turkce=0; gd-=1;
        }
        System.out.println("Lütfen muzik notunuzu giriniz:");
        muzik=not.nextFloat();
        if (muzik<0 || muzik>100) {
            System.out.println("!!!Geçersiz Notlandırma!!!");
            muzik=0; gd-=1;
        }
        toplam=matematik+fizik+kimya+turkce+muzik;
        ortalama=toplam/gd;
        System.out.println("Ortalamanız:"+ortalama);
        if (ortalama<=55.0f)
        {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        }
        else {System.out.println("Tebrikler,sınıfı geçtiniz !");}
    }
}
