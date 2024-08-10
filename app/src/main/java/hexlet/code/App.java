package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {

    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        gamesChoice();
    }

    public static void gamesChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        switch(Integer.valueOf(scn.nextLine())) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calculator.start();
                break;
            case 0:
                break;
        }
    }
}
