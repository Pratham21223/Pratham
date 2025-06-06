package Chapter_4_ifelse_switch;

import java.util.Scanner;

public class leap_yr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: (eg.2020)");
        int s=sc.nextInt();
        int d=s%4;
        switch (d) {
            case 0 -> System.out.println("Yes, "+s+" is a leap year");
            default -> System.out.println("No, "+s+" is not a leap year");

        }
    }
}

