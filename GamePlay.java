import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Host host = new Host("Mike");
        Players player = new Players(null);

        Turn turn = new Turn(0, 0);

        boolean keepPlaying = true;

        while (keepPlaying) {
            host.generateRandomNumber();

            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                Players guess = player.makeGuess();
                guessedCorrectly = turn.takeTurn(guess, ((Object) host).getNumber());
                if (guessedCorrectly) {
                    System.out.println("Congratulations! You guessed the number.");
                } else {
                    System.out.println("Try again!");
                }
            }

            System.out.println("Do you want to keep playing? (yes/no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no")) {
                keepPlaying = false;
            }
        }
    }
}