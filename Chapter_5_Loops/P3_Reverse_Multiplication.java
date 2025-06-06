package Chapter_5_Loops;

import java.util.Scanner;

public class P3_Reverse_Multiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Which number's table you want: ");
        int n=s.nextInt();
        for(int i=12;i>=1;i--)
        {
            System.out.println(n+" X " + i + " = "+n*i);
        }
    }
}

