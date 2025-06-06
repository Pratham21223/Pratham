package Chapter_7_Methods;

import java.util.Scanner;

public class Recursions {
    //method 1
//    static int factorial(int x){
//        int fact=1;
//        for(int i=1;i<=x;i++)
//        {
//            fact*=i;
//        }
//        return fact;
//    }
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int product =1;
            for(int i=1;i<=n;i++)
                product*=i;
            return product;
        }

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("The factorial of ");
        int n=s.nextInt();
        System.out.print(factorial(n));
        System.out.println(factorial_iterative(n));

    }
}
