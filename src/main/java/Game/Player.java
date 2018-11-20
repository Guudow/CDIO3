package Game;

public class Player {

    private String name;
    private String spilBrik;
    private String ejendomme;
    private boolean fængsel;
    private int position;

    public Player(String name, String spilBrik, String ejendomme, boolean fængsel, int position) {
        this.name = name;
        this.spilBrik = spilBrik;
        this.ejendomme = ejendomme;
        this.fængsel = fængsel;
        this.position = position;
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
        return ejendomme;
    }

    public void setEjendomme(String ejendomme) {
        this.ejendomme = ejendomme;
    }

    public boolean isFængsel() {
        return fængsel;
    }

    public void setFængsel(boolean fængsel) {
        this.fængsel = fængsel;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


}
