package Chapter_7_Methods;

import java.util.Scanner;
//Fibonacci Series=0,1,1,2,3,5,8....
public class P5_Fibonacci_recursion {
    static int fib(int n){
        /*if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
        if(n==1||n==2){
            return n-1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}