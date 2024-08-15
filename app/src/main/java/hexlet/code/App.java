package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GreatestCommonDivider;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        chooseAndStartGame();
    }

    public static void chooseAndStartGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        switch (Integer.parseInt(SCANNER.nextLine())) {
            case GREET -> Cli.greetings();
            case EVEN -> Even.start();
            case CALCULATOR -> Calculator.start();
            case GCD -> GreatestCommonDivider.start();
            case PROGRESSION -> Progression.start();
            case PRIME -> Prime.start();
            case EXIT -> { }
            default -> System.out.println("Unknown command");
        }
    }
}
