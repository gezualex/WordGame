class Turn {
    private Money money = new Money();
    private Physical physical = new Physical();

    public boolean takeTurn(Players player, Hosts host) {
        System.out.print(player.getName() + ", please enter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        boolean correctGuess = host.checkGuess(guess);
        int winnings = 0;

        System.out.println("Enter 1 for Money or 2 for Physical Prize: ");
        int choice = input.nextInt();
        if (choice == 1) {
            winnings = money.displayWinnings(player, correctGuess);
        } else if (choice == 2) {
            winnings = physical.displayWinnings(player, correctGuess);
        }

        player.addMoney(winnings);
        System.out.println(player.getName() + " now has " + player.getMoney() + "$");

        return correctGuess;
    }
}