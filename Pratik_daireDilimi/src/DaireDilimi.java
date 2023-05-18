import java.util.Scanner;
public class DaireDilimi {
    public static void main(String[] args) {
        double r,a,alan,pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r=input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz:");
        a=input.nextDouble();
        alan=(pi*r*r*a)/360;
        System.out.println("Daire diliminin alanı:"+alan);

    }
}
