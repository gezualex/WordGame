public class Turn {
    public static void main(String[] args) throws MultipleLettersException {
        Phrases phrases = new Phrases(null);
        GamePlay game = new GamePlay(phrases);
        game.playGame();
    }
}