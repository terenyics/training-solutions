package introcontrol;

import java.util.Scanner;

public class IntroControlMain {

    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy számot 0 és 100 között");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Introcontrol introcontrolTest = new Introcontrol();
        System.out.println("subtractTenIfGreaterThanTen értéke:" + introcontrolTest.subtractTenIfGreaterThanTen(number));

        System.out.println("describeNumber");
        System.out.println(introcontrolTest.describeNumber(0));
        System.out.println(introcontrolTest.describeNumber(1));

        System.out.println("greetingToJoe");
        System.out.println(introcontrolTest.greetingToJoe("Joe"));
        System.out.println(introcontrolTest.greetingToJoe("Jane"));

        System.out.println("calculateBonus");
        System.out.println(introcontrolTest.calculateBonus(2000000));
        System.out.println(introcontrolTest.calculateBonus(200));

        System.out.println("calculateConsumption");
        System.out.println(introcontrolTest.calculateConsumption(5000, 6000));
        System.out.println(introcontrolTest.calculateConsumption(9000, 20));

        System.out.println("printNumbers");
        System.out.println("value of max = 5");
        introcontrolTest.printNumbers(5);

        System.out.println("printNumbersBetween");
        System.out.println("values 10 and 12");
        introcontrolTest.printNumbersBetween(10,12);

        System.out.println("printNumbersBetweenAnyDirection");
        introcontrolTest.printNumbersBetweenAnyDirection(5,8);
        introcontrolTest.printNumbersBetweenAnyDirection(8, 5);

        System.out.println("printOddNumbers");
        introcontrolTest.printOddNumbers(10);

    }


}
