public class Phrases {
    private static String gamePhrase;
    private static String playingPhrase;

    public static void setGamePhrase(String phrase) {
        gamePhrase = phrase;
        playingPhrase = gamePhrase.replaceAll("[a-zA-Z]", "_");
    }

    public static String getPlayingPhrase() {
        return playingPhrase;
    }

    public static void findLetters(char c) throws MultipleLettersException {
        if (c.length() > 1) {
            throw new MultipleLettersException();
        }

        char guess = c.charAt(0);
        char[] gamePhraseChars = gamePhrase.toCharArray();
        char[] playingPhraseChars = playingPhrase.toCharArray();

        boolean found = false;
        for (int i = 0; i < gamePhraseChars.length; i++) {
            if (Character.toLowerCase(gamePhraseChars[i]) == Character.toLowerCase(guess)) {
                playingPhraseChars[i] = gamePhraseChars[i];
                found = true;
            }
        }

        playingPhrase = String.valueOf(playingPhraseChars);

        if (!playingPhrase.contains("_")) {
            System.out.println("Congratulations! You won!");
            System.out.println("You have successfully guessed the phrase: " + gamePhrase);
            System.out.println("Here is your prize: [insert prize here]");
        } else if (found) {
            System.out.println("Great guess! Keep going.");
        } else {
            System.out.println("Oops! That letter is not in the phrase. Try again.");
        }
    }

    public boolean isGuessed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isGuessed'");
    }

    public String getHiddenPhrase() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHiddenPhrase'");
    }
}