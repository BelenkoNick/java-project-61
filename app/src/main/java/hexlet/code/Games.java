package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {

    private static final Scanner scn = new Scanner(System.in);
    private static final Random rnd = new Random();

    public static void oddOrEven() {
        int score = 0;
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (score < 3) {
            int randomInt = rnd.nextInt(10);
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            String correctAnswer = randomInt % 2 == 0 ? "yes" : "no";
            String userAnswer = scn.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb
                        .append("'")
                        .append(userAnswer)
                        .append("' is wrong answer ;(. Correct answer was '")
                        .append(correctAnswer)
                        .append("'.");
                System.out.println(sb);
                System.out.println("Let's try again, " + name + "!");
                score = 0;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
