package Chapter_1_Variables;

import java.util.Scanner;

public class HW_no_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter distance in kilometers to convert it into miles: ");
        double km=s.nextDouble();
        double mil=km*0.621371;
        System.out.println(km+" is equal to "+mil+" miles");
    }
}
