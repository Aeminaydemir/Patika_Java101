import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String ID, password,reset;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        ID = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();
        if (ID.equals("patikaJunior") && password.equals("patikA12345")) {
            System.out.println("...Giriş yaptınız");
        } else  {
            System.out.println("Girdiğiniz bilgiler yanlış!!!");
            System.out.print("şifrenizi sıfırlamak ister misiniz? (Y/N):");
            reset=input.nextLine();
            if (reset.equals("Y")||reset.equals("y"))
            {
                System.out.print("Yeni şifre:");
                reset=input.nextLine();
                if (reset.equals("patikA12345")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz !!");
                }
                else {
                    password=reset;
                    System.out.println("Yeni şifre oluşturuldu");
                }
            }
        }
    }
}
