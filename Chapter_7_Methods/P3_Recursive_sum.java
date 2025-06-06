package Chapter_7_Methods;

import java.util.Scanner;

public class P3_Recursive_sum {
    static int sum(int s) {
        //Base condition is necessary for recursion.
//        if (s == 1) {
//            return 1;
//        }
        if (s == 1) {
            return 1;
        }
        return s+sum(s-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is: "+sum(n));
    }
}
