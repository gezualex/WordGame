public class Turn {
    private String phrase;

    public Turn(String phrase) {
        this.phrase = phrase;
    }

    public boolean isCorrectGuess(char letter) {
        return phrase.contains(String.valueOf(letter));
    }
}