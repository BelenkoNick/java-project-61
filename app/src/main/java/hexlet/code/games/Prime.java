package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final Random RANDOM = new Random();
    private static final int ITERATION_COUNT = 3;
    private static final int BOUND = 100;

    public static void start() {
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[] questions = new String[ITERATION_COUNT];
        String[] answers = new String[ITERATION_COUNT];

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int randomInt = RANDOM.nextInt(BOUND) + 1;
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
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
