import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char userinput = 'y';
        while (userinput == 'y') {
            int userchoice;
            int computerchoice;
            System.out.println("enter (0) for rock ->(1) for paper ->(2) for scissor:");
            userchoice = sc.nextInt();
            if (userchoice > 3) {
                System.out.println("incorrect input!!please correct input according game..");
                continue;
            }

            computerchoice = rand.nextInt(3);

            if (userchoice == computerchoice) {
                System.out.println("draw game!!!");
            } else if (userchoice == 0 && computerchoice == 2 || userchoice == 1 && computerchoice == 0
                    || userchoice == 2 && computerchoice == 1) {
                System.out.println("you win!!");
            } else {
                System.out.println("Computer wins!!");
                // break;
            }

            System.out.println("computer's choice is : " + computerchoice);

            if (computerchoice == 0) {
                System.out.println("computer chose rock.");
            } else if (computerchoice == 1) {
                System.out.println("computer chose paper.");
            } else if (computerchoice == 2) {
                System.out.println("computer chose scissors.");
            }
            System.out.println("do you want to play again??");
            userinput = sc.next().charAt(0);

        }
        System.out.println("thanks for playing..");

        sc.close();

    }

}

