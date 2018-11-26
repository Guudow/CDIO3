package Game;

public class GameLogic {

    private Dice dice = new Dice(6);

    public int movePlayer(Player player)
    {
        int result = dice.roll();
        player.setPosition(result);
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
