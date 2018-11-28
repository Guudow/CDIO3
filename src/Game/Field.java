package Game;

public class Field {

    private String name;
    private String owner;
    private int series;
    private int price;
    private boolean isJail;
    private boolean isChance;
    private boolean owned;
    private boolean isPurchaseable;

    public Field(String name,String owner,int series,int price, boolean owned)
    {
        this.name = name;
        this.series = series;
        this.price = price;
        this.owned = owned;
        this.owner = owner;

    }

    public Field(String name, boolean isPurchaseable, boolean isChance)
    {
        this.name = name;
        this.isPurchaseable = isPurchaseable;
        this.isChance = isChance;
    }

    public Field(String name, boolean isJail)
    {
        this.name = name;
        this.isJail = isJail;
    }

    public boolean isPurchaseable()
    {
        return isPurchaseable;
    }

    public void purchaseProperty(boolean owned)
    {
        this.owned = owned;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean getOwned(){return owned;}

    public void setOwner(String owner){this.owner = owner;}

    public String getOwner(){return owner;}

    public String toString()
    {
        return name + ", " + price + ", " + isJail + ", " + isChance + ", " + owned + ", " + isPurchaseable;
    }
}
