package Chapter_1_Variables;

import java.util.Scanner;
public class HW_no_2
{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("This program is to print the sum of 3 numbers: ");
    System.out.println("Enter first subject marks: ");
    int n1=s.nextInt();
    System.out.println("Enter second subject marks: ");
    int n2=s.nextInt();
    System.out.println("Enter third subject marks: ");
    int n3=s.nextInt();
    double sum = n1+n2+n3;
    sum/=30;
    System.out.println("Your sum for entered 3 numbers is : " + sum);

}
}
