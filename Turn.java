public class Turn {

    public Turn(int number) {
    }

    public void takeTurn() {
        Money money = new Money();
        int randomNumber = generateRandomNumber();

        if (randomNumber < 5) {
            money.winMoney();
        } else {
            money.winPrize();
        }
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}