package Chapter_2_Operators;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value for a>b");
        System.out.print("Enter a: ");
        double a=s.nextDouble();
        System.out.print("Enter b: ");
        double b=s.nextDouble();
        boolean b1=a>b;
        boolean b2=a==b;
        if(b1==true && b2==false) {
            System.out.println(+a + " is greater than " + b);
        }
        else if (b1==false && b2==true) {
            System.out.println(a + "=" + b);
        }
            else System.out.println(+a + " is less than " + b);
    }
}
