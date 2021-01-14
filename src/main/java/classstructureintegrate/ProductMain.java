package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the product: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the price of the product: ");
        Integer price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println("Please enter the amount of the increase: ");
        product.increasePrice(scanner.nextInt());
        System.out.println("Please enter the amount of decrease");
        product.decreasePrice(scanner.nextInt());

        System.out.println("The final price of " + product.getName() + " is " + product.getPrice() + " USD");


    }
}
