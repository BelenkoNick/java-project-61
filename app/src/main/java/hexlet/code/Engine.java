package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int ITERATION_COUNT = 3;

    public static void startGameLoop(String rules, String[][] questions) {
        String name = Cli.greetings();
        System.out.println(rules);

        for (int i = 0; i < ITERATION_COUNT; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine();
            if (userAnswer.equals(questions[i][1])) {
                System.out.println("Correct!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb
                        .append("'")
                        .append(userAnswer)
                        .append("' is wrong answer ;(. Correct answer was '")
                        .append(questions[i][1])
                        .append("'.");
                System.out.println(sb);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
