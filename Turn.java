import java.util.Scanner;

public class Turn {
    private int amountForCorrectGuess;
    private int amountForIncorrectGuess;

    public Turn(int amountForCorrectGuess, int amountForIncorrectGuess) {
        this.amountForCorrectGuess = amountForCorrectGuess;
        this.amountForIncorrectGuess = amountForIncorrectGuess;
    }

    public boolean takeTurn(Players player, Host host) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(((Object) host).getName() + " prompts " + player.getFirstName()
                + " to enter a guess for the random number between 0 and 100: ");
        int guess = scanner.nextInt();

        if (guess == Numbers.getNumToGuess()) {
            player.setMoney(player.getMoney() + amountForCorrectGuess);
            System.out.println("Congratulations, " + player.getFirstName() + " is the winner!");
            System.out.println(player.toString());
            return true;
        } else {
            player.setMoney(player.getMoney() - amountForIncorrectGuess);
            System.out.println(player.getFirstName() + " guessed incorrectly.");
            System.out.println(player.toString());
            if (guess < Numbers.getNumToGuess()) {
                System.out.println("Your guess was too low.");
            } else {
                System.out.println("Your guess was too high.");
            }
            return false;
        }
    }
}