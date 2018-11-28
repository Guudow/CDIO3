package Game;

public class GameLogic {

    private Dice dice = new Dice(6);

    public int movePlayer(Player player)
    {
        int result = dice.roll();
        player.setPosition(result);
        return player.getPosition();
    }

    /*
    public boolean isOwned(Field field)
    {

    }
*/
    public void purchaseProperty(Field field, Player player)
    {
        if (field.isPurchaseable())
        {
            field.purchaseProperty(true);
            player.setMoney(-field.getPrice());
        }
    }
    public void payRent(Field field, Player renter, Player owner){
        renter.setMoney(renter.getMoney()-field.getPrice());
        owner.setMoney(owner.getMoney()+field.getPrice());
    }

}
