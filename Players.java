class Players {
    private String name;
    private int money;

    public Players(String name) {
        this.name = name;
    }

    public Players() {
        this.name = name + " " + getName();
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public static void add(Players newPlayer) {

        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
