import java.sql.SQLOutput;
import java.util.Scanner;
public class KDV_Hesaplama {
    public static void main(String[] args) {
        double tutar,kdvorani,kdvtutari,kdvlitutar;
        Scanner input= new Scanner(System.in);
        System.out.print("Ücret tutarı giriniz:");
        tutar=input.nextDouble();
        kdvorani=tutar<1000 ? 0.18 : 0.08;
        kdvtutari=tutar*kdvorani;
        kdvlitutar=kdvtutari+tutar;
        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:"+kdvorani);
        System.out.println("KDV tutarı:"+kdvtutari);
        System.out.println("KDV'li tutar:"+kdvlitutar);
    }
}
