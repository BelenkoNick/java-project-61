package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final Scanner scn = new Scanner(System.in);

    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scn.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
