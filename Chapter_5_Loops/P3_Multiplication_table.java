package Chapter_5_Loops;

import java.util.Scanner;

public class P3_Multiplication_table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Which number's table you want: ");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=12;i++)
        {
            System.out.printf("%d X %d = %d\n", n,i,n*i);
            sum=sum+n*i;

        }
        System.out.println("Sum of all numbers in the multiplication table of "+n+" is " + sum);
    }
}
