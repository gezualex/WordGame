import java.util.Scanner;

public class GamePlay {
    private Phrases phrases;

    public GamePlay() {
        this.phrases = new Phrases();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Guessing Game!");

        while (!phrases.isGuessed()) {
            System.out.println("Phrase: " + phrases.getHiddenPhrase());
            System.out.print("Enter a letter: ");

            String input = scanner.next().toLowerCase();

            try {
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    throw new IllegalArgumentException("Please enter a single letter.");
                }

                Phrases.findLetters(input.charAt(0));
            } catch (MultipleLettersException e) {
                System.out.println("Error: Please enter only one letter.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Congratulations! You have guessed the phrase: " + phrases.getHiddenPhrase());
        scanner.close();
    }

    public static void main(String[] args) {
        GamePlay game = new GamePlay();
        game.startGame();
    }
}