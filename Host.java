
class Hosts {
    private String name;
    private int numToGuess;

    public Hosts(String name, int numToGuess) {
        this.name = name;
        this.numToGuess = numToGuess;
    }

    public void randomizeNum() {
        Random random = new Random();
        numToGuess = random.nextInt(10) + 1;
    }

    public boolean checkGuess(int guess) {
        if (guess == numToGuess) {
            System.out.println("You won!");
            return true;
        } else {
            System.out.println("You lost.");
            return false;
        }
    }
}