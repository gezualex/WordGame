import java.util.Scanner;

public class GamePlay {
    private Players[] currentPlayers;

    public GamePlay() {
        currentPlayers = new Players[3];
    }

    public void startGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter player " + (i + 1) + " name: ");
                String playerName = scanner.nextLine();
                currentPlayers[i] = new Players(playerName);
            }
        }

        System.out.println("Game is starting with the following players:");
        for (Players player : currentPlayers) {
            System.out.println(player.getName());
        }

    }
}