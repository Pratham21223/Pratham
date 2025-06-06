package Chapter_7_Methods;

import java.util.Scanner;

public class P1_MultiplicationTable_Methods {
    static int table(int n){
        for(int i=1;i<=12;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=s.nextInt();
        System.out.println("The table of "+n+" is");
        table(n);
    }
}
