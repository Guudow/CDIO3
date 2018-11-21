package Game;

public class Player {

    private String name;
    private String spilBrik;
    private String property;
    private boolean jail;
    private int position;
    private boolean balance;

    public Player(String name, String spilBrik, String ejendomme,
                  boolean jail, int position, boolean balance ) {
        this.name = name;
        this.spilBrik = spilBrik;
        this.property = ejendomme;
        this.jail = jail;
        this.position = position;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpilBrik() {
        return spilBrik;
    }

    public void setSpilBrik(String spilBrik) {
        this.spilBrik = spilBrik;
    }

    public String getEjendomme() {
        return property;
    }

    public void setEjendomme(String ejendomme) {
        this.property = ejendomme;
    }

    public boolean getJail() {
        return jail;
    }

    public void setjail(boolean jail) {
        this.jail = jail;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean getBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    public boolean checkJail(){}

    public int Payrent(int rent){}

    public int Payproperty(){}

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", spilBrik='" + spilBrik + '\'' +
                ", property='" + property + '\'' +
                ", Jail=" + jail +
                ", position=" + position +
                '}';
    }
}
