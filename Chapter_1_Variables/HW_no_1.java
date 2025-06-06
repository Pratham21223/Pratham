package Chapter_1_Variables;

import java.util.Scanner;

public class HW_no_1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program is to print the sum of 3 numbers: ");
        System.out.println("Enter first number: ");
        int n1=s.nextInt();
        System.out.println("Enter second number: ");
        int n2=s.nextInt();
        System.out.println("Enter third number: ");
        int n3=s.nextInt();
        double sum = n1+n2+n3;
        System.out.println("Your sum for entered 3 numbers is : " + sum);

    }
}
