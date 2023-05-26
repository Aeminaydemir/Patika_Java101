import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int s,n1,n2;
        Scanner input= new Scanner(System.in);
        System.out.print("birinci değeri giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci değeri giriniz:");
        n2=input.nextInt();
        System.out.println("Lütfen işleminizi seçiniz:\n1-Toplama\n2-Çıkarma" +
                "\n3-Çarpma\n4-Bölme");
        s=input.nextInt();
        switch (s){
            case 1:
                System.out.println("İşleminizin sonucu:"+(n1+n2));
                break;
            case 2:
                System.out.println("İşleminizin sonucu:"+(n1-n2));
                break;
            case 3:
                System.out.println("İşleminizin sonucu:"+(n1*n2));
                break;
            case 4:
                System.out.println("İşleminizin sonucu:"+(n1/n2));
                break;
            default:
                System.out.println("Geçersiz bir işlem seçtiniz !!");
        }

    }
}
