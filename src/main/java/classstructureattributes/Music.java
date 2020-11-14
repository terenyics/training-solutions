package classstructureattributes;


import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite band's name");
        song.band = scanner.nextLine();
        System.out.println("Enter the title of your favourite song");
        song.title = scanner.nextLine();
        System.out.println("Enter the song length in minutes");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)!");


    }






}
