package hexlet.code;

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
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        switch(Integer.valueOf(scn.nextLine())) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Games.oddOrEven();
                break;
            case 0:
                break;
        }
    }
}
