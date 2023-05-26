import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("First number a:");
        a=in.nextInt();
        System.out.print("Second number b:");
        b=in.nextInt();
        System.out.print("Third number c:");
        c=in.nextInt();
        if (a>b && a>c) {
            if (b>c){
                System.out.println("    a>b>c");
            }else if(c>b) {
                System.out.println("    a>c>b");
            }else {
                System.out.println("    a>c=b");
            }
        } else if (b>c && b>a) {
            if (a>c){
                System.out.println("    b>a>c");
            }else if(c>a){
                System.out.println("    b>c>a");
            }else {
                System.out.println("    b>c=a");
            }
        }else if (c>a && c>b) {
            if (a>b){
                System.out.println("    c>a>b");
            }else if (b>a){
                System.out.println("    c>b>a");
            }else {
                System.out.println("    c>b=a");
            }
        }else {

            if (a==b && b!=c) {
                System.out.println("    a=b>c");
            } else if (a==c && a!=b) {
                        System.out.println("    a=c>b");
            } else if (b != a) {
                System.out.println("    b=c>a");
                }else {
                System.out.println("    a=b=c");
            }
            }
        }
    }

