package Chapter_4_ifelse_switch;

import java.util.Scanner;

public class website_type {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter website");
        String sc=s.nextLine();
        if(sc.endsWith(".com"))
        {
            System.out.println(sc+" is a commercial website.");
        } else if (sc.endsWith(".org"))
        {
            System.out.println(sc+" is a organisation website.");
        } else if (sc.endsWith(".in"))
        {
            System.out.println(sc+" is an indian website.");
        }
    }
}
