package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final Random rnd = new Random();

    public static void start() {
        String name = Cli.greetings();
        System.out.println("What number is missing in the progression?");

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int length = rnd.nextInt(5) + 5;
            int start = rnd.nextInt(10);
            int increment = rnd.nextInt(10) + 1;
            int missingIndex = rnd.nextInt(length - 1);
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
