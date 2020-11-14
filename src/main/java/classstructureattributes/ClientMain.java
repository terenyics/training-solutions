package classstructureattributes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the client's name");
            client.name = scanner.nextLine();
            System.out.println("Enter the client's year of birth");
            client.year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the client's address");
            client.address = scanner.nextLine();

        System.out.println("Collected data: ");
        System.out.println("Name: " + client.name + ", date of birth: " + client.year + " and address: " + client.address + ".");


    }
}
