package classstructureio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Please enter your e-mail address:");
        String eMail = scanner.nextLine();
        System.out.println("Data we registered is: ");
        System.out.println("Your full name: " + fullName);
        System.out.println("Your e-mail address: " + eMail);
    }
}
