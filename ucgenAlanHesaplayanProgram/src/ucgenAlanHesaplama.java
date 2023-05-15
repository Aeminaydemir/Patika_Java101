import java.util.Scanner;
public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        float a,b,c,u,alan;
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz:");
        a=input.nextFloat();
        System.out.print("ikinci kenarı giriniz:");
        b=input.nextFloat();
        System.out.print("Üçüncü kenarı giriniz:");
        c=input.nextFloat();
        u=(a+b+c)/2;
        alan=(float)Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Uçgenin alanı:"+alan);

    }
}
