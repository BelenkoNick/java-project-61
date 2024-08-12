package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class GreatestCommonDivider {

    private static final Random RANDOM = new Random();
    private static final int ITERATION_COUNT = 3;
    private static final int BOUND = 100;

    public static void start() {
        String name = Cli.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

        String[] questions = new String[ITERATION_COUNT];
        String[] answers = new String[ITERATION_COUNT];

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int a = RANDOM.nextInt(BOUND) + 1;
            int b = RANDOM.nextInt(BOUND) + 1;
            questions[i] = a + " " + b;
            answers[i] = String.valueOf(findGcd(a, b));
        }

        Engine.gameLoop(name, questions, answers);
    }

    private static int findGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
