package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final Random RANDOM = new Random();
    private static final int ITERATION_COUNT = 3;
    private static final int LENGTH_BOUND = 5;
    private static final int BOUND = 10;

    public static void start() {
        String name = Cli.greetings();
        System.out.println("What number is missing in the progression?");

        String[] questions = new String[ITERATION_COUNT];
        String[] answers = new String[ITERATION_COUNT];

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int length = RANDOM.nextInt(LENGTH_BOUND) + LENGTH_BOUND;
            int start = RANDOM.nextInt(BOUND);
            int increment = RANDOM.nextInt(BOUND) + 1;
            int missingIndex = RANDOM.nextInt(length - 1);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                start += increment;
                if (j == missingIndex) {
                    sb.append("..");
                    sb.append(" ");
                    answers[i] = String.valueOf(start);
                } else {
                    sb.append(start);
                    sb.append(" ");
                }
            }
            questions[i] = sb.toString();
        }

        Engine.gameLoop(name, questions, answers);
    }
}
