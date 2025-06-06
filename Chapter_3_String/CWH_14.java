package Chapter_3_String;

import java.util.Scanner;

public class CWH_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s=sc.nextLine();
//        int value =s.length();
//        System.out.println(value);
        String lower=s.toLowerCase();
//        String upper=s.toUpperCase();
//        System.out.println(lower);
//        System.out.println(upper);
//        String trim=s.trim();
//        System.out.println(trim);
//        System.out.println(lower.replace("a","khanak"));
//        System.out.println(s.startsWith("P"));
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf("tha",5));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(lower.equals("pratham"));
        System.out.println(s.equalsIgnoreCase("PrAtHam"));
        System.out.println("\"Pratham is \n good boy\"");


    }
}
