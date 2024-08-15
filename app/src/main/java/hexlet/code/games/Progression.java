package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final Random RANDOM = new Random();
    private static final String RULES = "What number is missing in the progression?";
    private static final int LENGTH_BOUND = 5;
    private static final int BOUND = 10;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
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
                    questionsAndAnswers[i][1] = String.valueOf(start);
                } else {
                    sb.append(start);
                    sb.append(" ");
                }
            }
            questionsAndAnswers[i][0] = sb.toString();
        }

        Engine.startGameLoop(RULES, questionsAndAnswers);
    }
}
