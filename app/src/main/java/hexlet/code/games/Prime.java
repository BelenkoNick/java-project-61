package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final Random rnd = new Random();

    public static void start() {
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int randomInt = rnd.nextInt(100) + 1;
            questions[i] = String.valueOf(randomInt);
            answers[i] = isPrime(randomInt) ? "yes" : "no";
        }

        Engine.gameLoop(name, questions, answers);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if((number % i) == 0)
            {
                return false;
            }
        }
        return true;
    }
}
