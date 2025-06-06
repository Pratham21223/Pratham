package Chapter_4_ifelse_switch;

import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter English marks");
        int s1=s.nextByte();
        System.out.println("Enter Mathematics marks");
        int s2=s.nextByte();
        System.out.println("Enter IT marks");
        int s3=s.nextByte();
        System.out.println("Enter Chemistry marks");
        int s4=s.nextByte();
        System.out.println("Enter Physics marks");
        int s5=s.nextByte();
        double per=(s1+s2+s3+s4+s5)/5.0;
        System.out.println("You have scored "+per+" %");
        if(s1>=33 && s2>=33 && s3>=33 && per>=40){
            System.out.println("You have passed");
        }
        else{
            System.out.println("You have failed");
        }

    }
}
