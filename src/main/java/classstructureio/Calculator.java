package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int firstNr = scanner.nextInt();
        System.out.println("Please enter a second number");
        int secondNr = scanner.nextInt();
        System.out.println(firstNr + " + " + secondNr);
        System.out.println(firstNr + secondNr);
    }
}
