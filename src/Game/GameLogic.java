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
        if (field.getOwned()==false)
        {
            field.purchaseProperty(true);
            player.setMoney(player.getMoney()-field.getPrice());
        }
    }
    //payRent subtracts the price of the proberty from the renters account
    // and then add that amount to the proberty owners account.
    public void payRent(Field field, Player renter, Player owner){
       if (field.getOwned()== true)
        renter.setMoney(renter.getMoney()-field.getPrice());
        owner.setMoney(owner.getMoney()+field.getPrice());
    }
    //paydoubleRent substracts two times the price of the proberty from the renters account
    // and then add that amount to the proberty owners account.
    public void paydoubleRent(Field field, Player renter, Player owner){
        if (field.getOwned() == true)
        renter.setMoney(renter.getMoney()-(field.getPrice()+field.getPrice()));
        owner.setMoney(owner.getMoney()+(field.getPrice()+field.getPrice()));
    }
    public void gotoJail(Player player){

    }
}
