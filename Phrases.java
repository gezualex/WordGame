public class Phrases {
    private String phrase;

    public Phrases(String phrase) {
        this.phrase = phrase.toLowerCase();
    }

    public boolean findLetters(char letter) throws MultipleLettersException {
        if (letter < 'a' || letter > 'z') {
            throw new IllegalArgumentException("Please enter a letter from a to z.");
        }

        if (phrase.contains(String.valueOf(letter))) {
            if (phrase.indexOf(letter) == phrase.lastIndexOf(letter)) {
                System.out.println("Letter found: " + letter);
                return true;
            } else {
                throw new MultipleLettersException("Multiple occurrences of the letter " + letter + " found.");
            }
        } else {
            System.out.println("Letter not found: " + letter);
            return false;
        }
    }
}