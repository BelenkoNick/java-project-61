package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final Random rnd = new Random();

    public static void start() {
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int randomInt = rnd.nextInt(10);
            questions[i] = String.valueOf(randomInt);
            answers[i] = randomInt % 2 == 0 ? "yes" : "no";
        }

        Engine.gameLoop(name, questions, answers);
    }
}
