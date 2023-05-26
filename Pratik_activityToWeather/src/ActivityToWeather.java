import java.util.Scanner;
public class ActivityToWeather {
    public static void main(String[] args) {
        int heat;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the temperature in celcius:");
        heat=in.nextInt();
        if (heat<5)
        {
            System.out.println("We suggest you go skiing.");
        } else if (heat<10) {
            System.out.println("We suggest you go to the sinema");
        } else if (heat<=15) {
            System.out.println("We suggest you go to the sinema or go on a picnic.");
        } else if (heat<=25) {
            System.out.println("We suggest you go on a picnic. ");
        }else {
            System.out.println("We suggest you go swimming. ");
        }
    }
}
