
class Hosts {
    private String name;
    private int numToGuess;

    public Hosts(String name, String string) {
        this.name = name;
        this.numToGuess = string;
    }

    public Hosts(String name2, String string) {
        // TODO Auto-generated constructor stub
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