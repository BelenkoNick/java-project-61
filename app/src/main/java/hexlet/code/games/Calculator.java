package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {

    private static final Random RANDOM = new Random();
    private static final int OPERATIONS = 3;
    private static final int BOUND = 10;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            String[] question = prepareQuestion();
            questionsAndAnswers[i][0] = question[0];
            questionsAndAnswers[i][1] = question[1];
        }
        Engine.startGameLoop("What is the result of the expression?", questionsAndAnswers);
    }

    public static String[] prepareQuestion() {
        String[] question = new String[2];
        int a = RANDOM.nextInt(BOUND);
        int b = RANDOM.nextInt(BOUND);
        switch (RANDOM.nextInt(OPERATIONS)) {
            case 0 -> {
                question[0] = a + " + " + b;
                question[1] = String.valueOf(a + b);
            }
            case 1 -> {
                question[0] = a + " - " + b;
                question[1] = String.valueOf(a - b);
            }
            case 2 -> {
                question[0] = a + " * " + b;
                question[1] = String.valueOf(a * b);
            }
            default -> throw new RuntimeException("Недостижимый код");
        }
        return question;
    }
}
