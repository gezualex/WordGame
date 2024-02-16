import java.util.Scanner;

public class GamePlay {
    private Phrases phrases;

    public GamePlay(Phrases phrases) {
        this.phrases = phrases;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean guessed = false;

        System.out.println("Welcome to the Word Guessing Game!");

        while (!guessed) {
            System.out.print("Enter a letter: ");
            char letter = scanner.next().toLowerCase().charAt(0);

            try {
                guessed = phrases.findLetters(letter);
            } catch (MultipleLettersException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Congratulations! You guessed the word.");
        scanner.close();
    }

    public static void main(String[] args) {
        Phrases phrases = new Phrases("hello");
        GamePlay game = new GamePlay(phrases);
        game.playGame();
    }
}