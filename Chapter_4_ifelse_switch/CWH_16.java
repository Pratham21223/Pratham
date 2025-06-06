package Chapter_4_ifelse_switch;

import java.util.Scanner;

public class CWH_16 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
//        if(age>60){
//            System.out.println("You are experienced");
//        } else if (age>50) {
//            System.out.println("You are semi-experienced");
//        } else if (age>35) {
//            System.out.println("You are semi-semi experienced");
//        }
//            else {
//                System.out.println("You are not experienced");
//            }
        switch (age) {
            case 18 -> System.out.println("You are an adult");
            case 21 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are getting retired");
            default -> System.out.println("Enjoy!");
        }
        System.out.println("Thank you");

        }
    }