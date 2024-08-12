package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final Random RANDOM = new Random();
    private static final int ITERATION_COUNT = 3;
    private static final int BOUND = 10;

    public static void start() {
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[] questions = new String[ITERATION_COUNT];
        String[] answers = new String[ITERATION_COUNT];

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int randomInt = RANDOM.nextInt(BOUND);
            questions[i] = String.valueOf(randomInt);
            answers[i] = randomInt % 2 == 0 ? "yes" : "no";
        }

        Engine.gameLoop(name, questions, answers);
    }
}
