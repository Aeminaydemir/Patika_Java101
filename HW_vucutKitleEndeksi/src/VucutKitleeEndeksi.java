import java.util.Scanner;
public class VucutKitleeEndeksi {
    public static void main(String[] args) {
        double kg,boy,vke; //vke=vucüt kitle endeksi
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg =input.nextDouble();
        vke=kg/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+vke);
    }
}
