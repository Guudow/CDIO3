package Game;

public class Field {

    private String name;
    private int price;
    private boolean isJail;
    private boolean isChance;
    private boolean owned;
    private boolean isPurchaseable;

    public Field(String name, int price, boolean owned)
    {
        this.name = name;
        this.price = price;
        this.owned = owned;
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

    public String toString()
    {
        return "...";
    }
}
