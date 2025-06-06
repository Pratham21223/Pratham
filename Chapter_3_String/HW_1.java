package Chapter_3_String;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string " );
        String s=sc.nextLine();
        String lower=s.toLowerCase();
        System.out.println(lower);
    }
}
