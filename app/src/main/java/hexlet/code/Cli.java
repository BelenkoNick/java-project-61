package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static Scanner scn = new Scanner(System.in);

    public static void greetings() {
        System.out.print("May I have your name? ");
        String name = scn.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
