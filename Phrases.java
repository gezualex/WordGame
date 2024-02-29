public class Phrases {
    public static String gamePhrase;
    private static String playingPhrase;

    public Phrases(String phrase) {
        gamePhrase = phrase;
        playingPhrase = gamePhrase.replaceAll("[a-zA-Z]", "_");
    }

    public String getPlayingPhrase() {
        return playingPhrase;
    }

    public static void findLetters(String letter) throws MultipleLettersException {
        if (letter.length() != 1) {
            throw new MultipleLettersException();
        }

        char guess = letter.charAt(0);
        char[] gamePhraseArray = gamePhrase.toCharArray();
        char[] playingPhraseArray = playingPhrase.toCharArray();

        boolean found = false;
        for (int i = 0; i < gamePhraseArray.length; i++) {
            if (Character.toLowerCase(gamePhraseArray[i]) == Character.toLowerCase(guess)) {
                playingPhraseArray[i] = gamePhraseArray[i];
                found = true;
            }
        }

        playingPhrase = String.valueOf(playingPhraseArray);

        if (!playingPhrase.contains("_")) {
            System.out.println("Congratulations! You've guessed the phrase: " + gamePhrase);
            System.out.println("You win a prize!");
        } else if (!found) {
            System.out.println("Sorry, the letter '" + guess + "' is not in the phrase.");
        }
    }
}