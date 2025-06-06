package Chapter_2_Operators;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("This program is for solving equations of motion");
        System.out.print("Enter intial velocity");
        double u=s.nextDouble();
        System.out.print("Enter final velocity");
        double v=s.nextDouble();
        System.out.print("Enter acceleration");
        double a=s.nextDouble();
        System.out.print("Enter displacement");
        double d=s.nextDouble();
        double e=(v*v-u*u)/(2*a*d);
        System.out.println(e);


    }
}
