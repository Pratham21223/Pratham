package Chapter_5_Loops;

import java.util.Scanner;

public class P4_Factorial_forloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number for which factorial is to be calculated: ");
        int n=s.nextInt();
        int fact=1;
        //for loop
        for(int i=1;i<=n;i++) {
           fact = fact * (i);
        }
        System.out.println("The factorial of using for loop " + n+ " is "+fact);
        //While loop
        int j=0;
        int factorial=1;
        while(j<n)
        {
            factorial = factorial*(j);
            j++;
        }

        System.out.println("The factorial of using while loop "+n+ " is "+fact);
    }
}
