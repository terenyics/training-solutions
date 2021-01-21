package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az első időpont óráját:");
        int firstHour = scanner.nextInt();
        System.out.println("Kérem adja meg az első időpont percét:");
        int firstMinute = scanner.nextInt();
        System.out.println("Kérem adja meg az első időpont másodpercét:");
        int firstSecond = scanner.nextInt();

        System.out.println("Kérem adja meg az második időpont óráját:");
        int secondHour = scanner.nextInt();
        System.out.println("Kérem adja meg az második időpont percét:");
        int secondMinute = scanner.nextInt();
        System.out.println("Kérem adja meg az második időpont másodpercét:");
        int secondSecond = scanner.nextInt();

        Time firstTime = new Time(firstHour,firstMinute,firstSecond);
        Time secondTime = new Time(secondHour,secondMinute,secondSecond);

        System.out.println("Az első időpont: " + firstTime.getInMinutes() + " perc.");
        System.out.println("A második időpont: " + secondTime.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + firstTime.earlierThan(secondTime));


    }

}