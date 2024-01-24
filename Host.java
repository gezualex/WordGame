
public class Host extends Person {
    public Host(String name) {
        super(name);
    }

    public int randomizeNum() {
        return Numbers.generateRandomNumber(0, 0);
    }

    public void generateRandomNumber() {

        throw new UnsupportedOperationException("Unimplemented method 'generateRandomNumber'");
    }
}