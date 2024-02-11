
import java.util.Random;
import java.util.Scanner;

public class Hosts {
    public static void main(String[] args) {
        String[] phrases = {
                "Hello, World!",
                "Java Programming",
                "Happy Coding",
                "Keep Learning"
        };

        Random random = new Random();
        String phrase = phrases[random.nextInt(phrases.length)];

        Phrases.setGamePhrase(phrase);
        System.out.println("Welcome to the Phrase Guessing Game!");
        System.out.println("Try to guess this phrase: " + Phrases.getPlayingPhrase());

        Scanner scanner = new Scanner(System.in);

        while (Phrases.getPlayingPhrase().contains("_")) {
            System.out.print("Enter a letter: ");
            String letter = scanner.nextLine();

            try {
                Phrases.findLetters(letter);
            } catch (MultipleLettersException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Current progress: " + Phrases.getPlayingPhrase());
        }

        scanner.close();
    }
}