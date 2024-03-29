import java.util.Random;
import java.util.Scanner;

class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    int num = 0;
    int rand = 0;

    public void userinputnumber() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    public void randomnumber() {
        rand = r.nextInt(100); // generates numbers from 0 to 99 only
        System.out.println("computer choosed by:" + rand);
    }

    public boolean tocheck() {

        if (num == rand) {
            System.out.println("you guessed it right!");
            return true;
        } else if (num > rand) {
            System.out.println("your guess number is to large");
        } else if (num < rand) {
            System.out.println("your guess number is to short");
        }
        return false;
    }

    public boolean tocheckcomputer() {
        if (rand == num) {
            System.out.print("number match");
          return true;
        } else if (rand > num) {
            System.out.println("\nThe computers number is larger than yours.");
        } else if (rand < num) {
            System.out.println("\nThe computers number is smaller than yours.");
        }
        return false;
    }
}

public class Guess_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;// for user
        boolean b1 = false;// for computer
        while (!b || !b1) {
            g.userinputnumber();
            g.randomnumber();
            b = g.tocheck();
           b1 =  g.tocheckcomputer();
        }
    }
}