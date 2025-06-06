package Chapter_3_String;

import java.util.Scanner;
public class HW_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string " );
        String s=sc.nextLine();
        String letter="Dear <|name|>, Thanks a lot";
        letter=letter.replace("<|name>|","Pratham");
        System.out.println(letter);

    }
}