package Game;

public class GameLogic {

    private Dice dice = new Dice(6);

    public void movePlayer(Player player)
    {
        int result = dice.roll();
        player.setPosition(result);
    }

    /*
    public boolean isOwned(Field field)
    {

    }
*/
    public void findOwner(Player [] player, Field field){
        for (int i = 0; i < player.length; i++){
            if (field.getOwner() == player[i].getPlayerNumber()){
                player[i].setOwner(true);
            }
        }
    }

    public void purchaseProperty(Field field, Player player)
    {
        if (field.getOwned()==false) {
            field.purchaseProperty(true);
            player.setMoney(-field.getPrice());
            field.setOwner(player.getPlayerNumber());
        }
    }
    //payRent subtracts the price of the proberty from the renters account
    // and then add that amount to the proberty owners account.
    public void payRent(Field field, Player renter, Player [] owner) {
        if (field.getOwned() == true){
            renter.setMoney(renter.getMoney() - field.getPrice());
        for (int i = 0; i < owner.length; i++) {
            if (field.getOwner()== owner[i].getPlayerNumber()){
            owner[i].setMoney(owner[i].getMoney() + field.getPrice());

            }
        }
     }
    }
    //paydoubleRent substracts two times the price of the proberty from the renters account
    // and then add that amount to the proberty owners account.
    public void paydoubleRent(Field field, Player renter, Player [] owner) {
        if (field.getOwned() == true){
            renter.setMoney(renter.getMoney() - (field.getPrice()+field.getPrice()));
            for (int i = 0; i < owner.length; i++) {
                if (field.getOwner()==owner[i].getPlayerNumber()){
                    owner[i].setMoney(owner[i].getMoney() + (field.getPrice()+field.getPrice()));}
            }
        }
    }
    // sets jailed to true and moves player to jail field(6)
    public void toJail(Player player){
        player.setJailed(true);
        player.setPosition(6);
    }
    // if jailed is true player pays a fee of 1.
    public void outJail(Player player){
        if (player.getJailed()==true){
            player.setMoney(player.getMoney()-1);
            player.setJailed(false);
        }
    }

}
