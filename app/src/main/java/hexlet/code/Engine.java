package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int ITERATION_COUNT = 3;

    public static void gameLoop(String name, String[] questions, String[] answers) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb
                        .append("'")
                        .append(userAnswer)
                        .append("' is wrong answer ;(. Correct answer was '")
                        .append(answers[i])
                        .append("'.");
                System.out.println(sb);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
