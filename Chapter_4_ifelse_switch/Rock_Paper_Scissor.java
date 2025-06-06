package Chapter_4_ifelse_switch;
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        for (int i =1;i <= 10;i++) {
            System.out.println("Game " + i);
            Scanner sc = new Scanner(System.in);
            System.out.println("Hey! user let's play Rock Paper Scissor \nPress 0 for Rock \nPress 1 for Paper \nPress 2 for Scissors");
            int u = sc.nextInt();
            Random rand = new Random();
            int c = rand.nextInt(3);
            String str = "";
            if (u == 0) {
                str = "Rock";
            } else if (u == 1) {
                str = "Paper";
            } else if (u == 2) {
                str = "Scissors";
            }
            String utr = "";
            if (c == 0) {
                utr = "Rock";
            } else if (c == 1) {
                utr = "Paper";
            } else if (c == 2) {
                utr = "Scissors";
            }
            System.out.println("You entered: " + str + " and computer entered: " + utr);
            String w="You Win!";
            String l="You lose!";
            if (u == 0 && c == 1) {
                System.out.println(l);
            } else if (u == 1 && c == 0) {
                System.out.println(w);
            } else if (u == 0 && c == 2) {
                System.out.println(w);
            } else if (u == 2 && c == 0) {
                System.out.println(l);
            } else if (u == 1 && c == 2) {
                System.out.println(l);
            } else if (u == 2 && c == 1) {
                System.out.println(w);
            } else {
                System.out.println("It's a tie replay");
            }
            System.out.println("Scores");
            String user = "",comp="";
            int use=0;
            int com=0;
            if(user==w)
            {
                System.out.println("Your Points: "+(use+1));
            }
            else if (comp==w)
            {
                System.out.println("Computer Points: "+(com+1));
            }
        }
    }
}
