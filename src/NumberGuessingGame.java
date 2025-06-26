import java.util.Scanner;

class Guess {
    int GuessNum(Scanner s) {
        return s.nextInt();
    }
}

public class NumberGuessingGame extends Guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Guess g = new Guess();
        int LuckyNumber = 27;

        System.out.println("Enter your Guess:");
        int a = g.GuessNum(s); // first guess

        while (a != LuckyNumber) {
            System.out.println("Try again:");
            a = g.GuessNum(s); // new guess
        }

        System.out.println("____________ You win! ___________");
        s.close();
            }
    }

