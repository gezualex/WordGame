public class MultipleLettersException extends Exception {
    public MultipleLettersException(String string) {
    }

    @Override
    public String getMessage() {
        return "More than one letter was entered";
    }
}