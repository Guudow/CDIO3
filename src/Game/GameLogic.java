package Game;

public class GameLogic {

    private Dice dice = new Dice(6);

    public int movePlayer()
    {
        int result = dice.roll();
        return result;
    }

    /*
    public boolean isOwned(Field field)
    {

    }
*/
    public void purchaseProperty(Field field)
    {
        if (field.isPurchaseable() == true)
        {
            field.purchaseProperty(true);
        }
    }
}
