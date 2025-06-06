package Chapter_1_Variables;

import java.util.Scanner;

public class HW_no_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number which you want to check as integer");
        boolean b1 = s.hasNextInt();
        if(b1==true) {
            System.out.println("The entered number is an integer ");
        }
        else{
            System.out.println("The entered number is not an integer");
        }

    }
}
