public class Turn<Hosts> {
    private int amountForWinning;
    private int amountForIncorrectGuess;

    public Turn(int amountForWinning, int amountForIncorrectGuess) {
        this.amountForWinning = amountForWinning;
        this.amountForIncorrectGuess = amountForIncorrectGuess;
    }

    public boolean takeTurn(Player player, Host host) {
        int numToGuess = Numbers.generateRandomNumber(0, 100);
        System.out.println(host.getFirstName() + " prompts " + player.getFirstName()
                + " to enter a guess for the random number between 0 and 100.");

        int playerGuess = player.makeGuess();

        if (playerGuess == numToGuess) {
            player.increaseMoney(amountForWinning);
            System.out.println("Congratulations, " + player.getFirstName() + " has won!");
            System.out.println(player.toString());
            return true;
        } else {
            player.increaseMoney(amountForIncorrectGuess);
            System.out.println(player.getFirstName() + " guessed " + playerGuess + " which is "
                    + (playerGuess > numToGuess ? "too high" : "too low"));
            System.out.println(player.toString());
            return false;
        }
    }

    public boolean takeTurn(Players guess, Hosts host) {

        throw new UnsupportedOperationException("Unimplemented method 'takeTurn'");
    }
}