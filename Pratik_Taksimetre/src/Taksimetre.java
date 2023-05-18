import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perkm=2.22 , tutar , min=20.0 , opprice=10.0;
        Scanner sayac = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km=sayac.nextInt();
        tutar=opprice+(perkm*km);
        tutar= (tutar<20) ? 20 : tutar;
        System.out.println("Toplam tutar:"+tutar);
    }
}
