package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final Random RANDOM = new Random();
    private static final int BOUND = 100;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int randomInt = RANDOM.nextInt(BOUND) + 1;
            questionsAndAnswers[i][0] = String.valueOf(randomInt);
            questionsAndAnswers[i][1] = isPrime(randomInt) ? "yes" : "no";
        }

        Engine.startGameLoop("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
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
