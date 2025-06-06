package Chapter_1_Variables;

import java.util.Scanner;
public class Sum_of_3_nos
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Enter first number: ");
        num1=Sc.nextInt();
        System.out.print("Enter Second number: ");
        num2=Sc.nextInt();
        System.out.print("Enter Third number: ");
        num3=Sc.nextInt();
        System.out.println("You Entered:" + num1 + ", "+num2 + ", "+num3);
        int S = num1+num2+num3;
        System.out.println("So your sum = "+S);
    }
}