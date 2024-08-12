package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calculator {

    private static final Random RANDOM = new Random();
    private static final int ITERATION_COUNT = 3;
    private static final int BOUND = 10;


    public static void start() {
        String name = Cli.greetings();
        System.out.println("What is the result of the expression?");

        String[] questions = new String[ITERATION_COUNT];
        String[] answers = new String[ITERATION_COUNT];

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int a = RANDOM.nextInt(BOUND);
            int b = RANDOM.nextInt(BOUND);
            switch (RANDOM.nextInt(2)) {
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
