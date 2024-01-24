import java.util.Random;

public class Numbers {
    private static int randomNumber;

    public int getRandomNum() {
        return getRandomNum();
    }

    public void setRandomNum(int randomNum) {
        Numbers.randomNumber = randomNum;
    }

    public static int generateNumber() {
        Random rand = new Random();
        return randomNumber = rand.nextInt(101);
    }

    public boolean compareNumber(int guess) {
        if (guess == randomNumber) {
            System.out.println("Congratulations, you guessed the number!");
            return true;
        } else if (guess > randomNumber) {
            System.out.println("I'm sorry. That guess was too high.");
            return false;
        } else {
            System.out.println("I'm sorry, That guess was too low.");
            return false;
        }
    }

}