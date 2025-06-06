package Chapter_4_ifelse_switch;

import java.util.Scanner;

public class itr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your annual family income in rupees");
        double a=sc.nextInt();
        if(a>=2400000)
        {
            double s7=(a-2400000)*0.3+300000;
            System.out.println("Your income tax payable is: "+s7 + " Rupees only");
        }
        else if (a<2400000 && a>=2000000)
        {
            double s6=(a-2000000)*0.25+200000;
            System.out.println("Your income tax payable is: "+s6 + " Rupees only");
        }
        else if (a<2000000 && a>=1600000)
        {
            double s5=(a-1600000)*0.2+120000;
            System.out.println("Your income tax payable is: "+s5 + " Rupees only");
        }
        else if (a<1600000 && a>=1200000)
        {
            double s4=(a-1200000)*0.15+60000;
            System.out.println("Your income tax payable is: "+s4 + " Rupees only");
        }
        else if (a<1200000 && a>=800000)
        {
            double s3=(a-800000)*0.1+20000;
            System.out.println("Your income tax payable is: "+s3 + " Rupees only");
        }
        else if (a<800000 && a>=400000)
        {
            double s2=(a-400000)*0.05;
            System.out.println("Your income tax payable is: "+s2+ " Rupees only");
        }
        else if (a<400000 && a>=0)
        {
            System.out.println("Your income tax payable is: "+0+ " Rupees only");
        }
    }
}
