package Chapter_1_Variables;

import java.util.Scanner;
public class Boards_score_cal
{
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        System.out.println("Your Score for class 12th CBSE marks is: ");
        System.out.println("Enter Your Maths Score : ");
        int math=s.nextByte();
        System.out.println("Enter Your Physics Score : ");
        int phy=s.nextByte();
        System.out.println("Enter Your Chemistry Score : ");
        int chem=s.nextByte();
        System.out.println("Enter Your English Score : ");
        int eng=s.nextByte();
        System.out.println("Enter Your Hindi Score : ");
        int hin=s.nextByte();
        double per = math+phy+chem+eng+hin;
        double cent=per/5;
        System.out.println("Your final percentage : " + cent + "%" );








    }
}