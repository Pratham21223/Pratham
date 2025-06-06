package Chapter_5_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int i =0;
//        while(i<=100)
//        {
//            System.out.println(i);
//            i++;
//        }
//        Scanner s=new Scanner(System.in);
//        System.out.println("Till what number you would like to print the numbers: ");
//        int b=s.nextInt();
        //do while loop
//        int c=1;
//        do{
//            System.out.println(c);
//            c++;
//        }
//        while (c<=b);
        //To print n odd numbers
//        Scanner s=new Scanner(System.in);
//        System.out.println("Till what number you would like to print the numbers: ");
//        int d=s.nextInt();
//
//        for(int i=0;i<d;i++)
//        {
//            System.out.println(((2*i)+1));
//        }
        // Print n number is reverse order
        Scanner s=new Scanner(System.in);
        System.out.println("Till what number you would like to print the numbers: ");
        int y=s.nextInt();
        for (int i=y;i!=0;i--)
        {
            System.out.println(i);
        }

    }
}
