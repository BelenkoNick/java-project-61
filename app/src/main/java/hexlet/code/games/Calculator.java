package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calculator {

    private static final Random rnd = new Random();


    public static void start() {
        String name = Cli.greetings();
        System.out.println("What is the result of the expression?");

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int a = rnd.nextInt(10);
            int b = rnd.nextInt(10);
            switch (rnd.nextInt(2)) {
                case 0 -> {
                    questions[i] = a + " + " + b;
                    answers[i] = String.valueOf(a + b);
                }
                case 1 -> {
                    questions[i] = a + " - " + b;
                    answers[i] = String.valueOf(a - b);
                }
                case 2 -> {
                    questions[i] = a + " * " + b;
                    answers[i] = String.valueOf(a * b);
                }
            }
        }
        Engine.gameLoop(name, questions, answers);
    }
}
