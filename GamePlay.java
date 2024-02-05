import java.util.Scanner;

public class GamePlay {

    private Players[] currentPlayers = new Players[3];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GamePlay game = new GamePlay();

        Hosts host = new Hosts("Iron Man", "");

        host.randomizeNum();

        Turn turn = new Turn();

        for (int i = 0; i < game.currentPlayers.length; i++) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Would you like to enter a last name? (yes/no): ");
            String answer = input.nextLine();

            if (answer.equals("yes")) {
                System.out.print("Enter your last name: ");
                String lastName = input.nextLine();
                game.currentPlayers[i] = new Players(name, lastName);
            } else {
                game.currentPlayers[i] = new Players(name);
            }
            game.currentPlayers[i].setMoney(1000);
        }

        boolean playAgain = true;

        while (playAgain) {
            for (int i = 0; i < game.currentPlayers.length; i++) {
                while (!turn.takeTurn(game.currentPlayers[i % game.currentPlayers.length], host)) {
                }
            }
            System.out.println("Would you like to play again? (yes/no): ");
            String answer = input.nextLine();
            if (answer.equals("no")) {
                playAgain = false;
            } else {
                host.randomizeNum();
            }
        }
    }
}