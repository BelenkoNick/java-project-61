package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GreatestCommonDivider {

    private static final Random RANDOM = new Random();
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int BOUND = 100;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int a = RANDOM.nextInt(BOUND) + 1;
            int b = RANDOM.nextInt(BOUND) + 1;
            questionsAndAnswers[i][0] = a + " " + b;
            questionsAndAnswers[i][1] = String.valueOf(findGcd(a, b));
        }

        Engine.startGameLoop(RULES, questionsAndAnswers);
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
