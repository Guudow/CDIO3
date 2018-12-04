package Game;

//The Field class represents the games fields logically.

/**
 *
 */
public class Field {

    private String name;
    private int owner;
    private int series;
    private int price;
    private boolean isJail;
    private boolean isChance;
    private boolean owned;
    private boolean isPurchaseable;

    /**
     *
     * @param name
     * @param series
     * @param price
     * @param owned
     */
    public Field(String name,int series,int price, boolean owned)
    {
        this.name = name;
        this.series = series;
        this.price = price;
        this.owned = owned;
        this.owner = owner;

    }

    /**
     *
     * @param name
     * @param isPurchaseable
     * @param isChance
     */

    public Field(String name, boolean isPurchaseable, boolean isChance)
    {
        this.name = name;
        this.isPurchaseable = isPurchaseable;
        this.isChance = isChance;
    }

    /**
     *
     * @param name
     * @param isJail
     */

    public Field(String name, boolean isJail)
    {
        this.name = name;
        this.isJail = isJail;
    }

    /**
     *
     * @return
     */

    public boolean isPurchaseable()
    {
        return isPurchaseable;
    }

    /**
     *
     * @param owned
     */

    public void purchaseProperty(boolean owned)
    {
        this.owned = owned;

    }

    /**
     *
     * @param field
     * @param player
     */

    public void payrent(Field field, Player player){
        if(owned=true){

        }
    }

    /**
     *
     * @return
     */

    public int getPrice()
    {
        return price;
    }

    /**
     *
     * @return
     */
    public boolean getOwned(){return owned;}

    /**
     *
     * @param owner
     */

    public void setOwner(int owner){this.owner = owner;}

    /**
     *
     * @return
     */

    public int getOwner(){return owner;}

    /**
     *
     * @return
     */

    public String toString()
    {
        return name + ", " + price + ", " + isJail + ", " + isChance + ", " + owned + ", " + isPurchaseable;
    }
}
