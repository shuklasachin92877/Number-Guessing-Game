import java.util.Scanner;

class Guessing {
    int answer = 1 + (int) (100 * Math.random());
    int k = 5;
    int i;
    int guess;
    Scanner sc = new Scanner(System.in);

    void game() {
        System.out.println("Think number between 1 to 100");
        System.out.println("You have 5 tries to guess number!");
        for (i = 0; i < k; i++) {
            System.out.println("Enter the number:");
            guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("Congratulations ! Your guess is correct");
                System.out.println("You Win the game.");
                System.out.println("=============================================");
                break;
            } else if (guess > answer && i != k - 1) {
                System.out.println("Your guess is too high");
                System.out.println("=============================================");

            } else if (guess < answer && i != k - 1) {
                System.out.println("Your guess is too low");
                System.out.println("=============================================");

            }

        }
        if (i == k) {
            System.out.println("Sorry ! you lost  the game");
            System.out.println("Better luck next time.");
            System.out.println("*****************");
            System.out.println("ANSWER: " + answer);
            System.out.println("*****************");
        }

    }

}

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("**************WELCOME TO GAMING ZONE*********************");
        Guessing g = new Guessing();
        g.game();
    }

}
