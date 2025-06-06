package Chapter_5_Loops;

public class Break_Continue {
    public static void main(String[] args) {
        //Break using loops.
        //For loop
//        for (int i=0;i<=50;i++)
//        {
//            System.out.println(i+" Java is Great");
//            if (i==2)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
        //While loop
//        int j=0;
//        while(j<=50)
//        {
//            System.out.println(j+" Java is great");
//            j++;
//            if(j==2)
//            {
//                System.out.println(j+" Signing off");
//                break;
//            }
            //Do while loop
//            int k=0;
//            do{
//                System.out.println(k+" Java is great");
//                k++;
//                if(k==2)
//                {
//                    System.out.println(k+" Signing off");
//                    break;
//                }
//            }
//            while(k<=50);
        //Continue using loops:used for skipping an iteration inside the loop.
        //For loop
//        for(int l=0;l<=10;l++)
//        {
//            if(l>=2)
//            {
//                System.out.println("Yes I can do it: ");
//                continue;
//            }
//            System.out.println(l+" Java is Great");
//        }
        //While loop
//        int m=0;
//        while(m<10)
//        {
//            m++;
//            if(m==2)
//            {
//                System.out.println("Rukh ja bhai");
//                continue;
//            }
//            System.out.println(m+" Java is great");
//
//        }
        //do While
        int n=0;
        do {
            n++;
            if(n==2)
            {
                System.out.println("Rukh ja bhai");
                continue;
            }
            System.out.println(n+" Java is great");
        }
        while(n<10);




        }

    }

