import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    int num;

    Game() {
        Random random = new Random();
        number = random.nextInt(100);
    }

    void takeUserInput() {
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

    }

    boolean isCorrect() {
        if (num == number) {
            return true;
        } else {

            return false;
        }
    }

    void guess() {
        if (num > number)
            System.out.println("number is big , Guess again");
        else
            System.out.println("number is small, Guess again");


    }
}





