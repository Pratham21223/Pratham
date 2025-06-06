package Chapter_5_Loops;

import java.util.Scanner;

public class P2_neven_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first n even number: ");
        int n=s.nextInt();
        int sum = 0;
        for(int i=0; i<=n;i++)
        {
            sum=sum+(2*i);
        }
        System.out.println(sum);
    }
}
