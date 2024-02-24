import java.util.Scanner;

public class GamePlay {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Game!");

        boolean continueGame = true;
        while (continueGame) {
            System.out.print("Enter a letter to guess: ");
            String guess = scanner.nextLine();

            try {
                Phrases.findLetters(guess);
            } catch (MultipleLettersException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid letter.");
            }

            System.out.print("Continue playing? (Y/N): ");
            String playChoice = scanner.nextLine();
            if (!playChoice.equalsIgnoreCase("Y")) {
                continueGame = false;
            }
        }
    }
}