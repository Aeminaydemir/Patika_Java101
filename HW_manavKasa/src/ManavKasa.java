import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double kg ,total,armut= 2.14 ,elma=3.67,
                domates = 1.11, muz= 0.95 ,patlican= 5.00;

        Scanner tarti=new Scanner(System.in);
        System.out.print("Lütfen tartılan armutun kilosunu giriniz:");
        armut=tarti.nextDouble();
        System.out.print("Lütfen tartılan elmanın kilosunu giriniz:");
        elma=tarti.nextDouble();
        System.out.print("Lütfen tartılan domatesin kilosunu giriniz:");
        domates=tarti.nextDouble();
        System.out.print("Lütfen tartılan muzun kilosunu giriniz:");
        muz=tarti.nextDouble();
        System.out.print("Lütfen tartılan patlicanın kilosunu giriniz:");
        patlican=tarti.nextDouble();
        total=elma+armut+muz+domates+patlican;
        System.out.println("Toplam tutar:"+total);
    }
}
