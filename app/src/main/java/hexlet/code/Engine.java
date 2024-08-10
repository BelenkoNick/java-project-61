package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final Scanner scn = new Scanner(System.in);

    public static void gameLoop(String name, String[] questions, String[] answers) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scn.nextLine();
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
