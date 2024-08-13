package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final Random RANDOM = new Random();
    private static final int BOUND = 10;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int randomInt = RANDOM.nextInt(BOUND);
            questionsAndAnswers[i][0] = String.valueOf(randomInt);
            questionsAndAnswers[i][1] = randomInt % 2 == 0 ? "yes" : "no";
        }

        Engine.startGameLoop("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }
}
