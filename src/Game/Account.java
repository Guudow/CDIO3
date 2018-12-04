package Game;


//The Account class keeps track of a players money.

/**
 *
 */
public class Account{

    //int for amount of money in account
    private int money = 0;

    /**
     *
     * @param amount
     */

    public void setMoney(int amount){
        money += amount;
        if (money < 0)
        {
            money = 0;
        }
    }

    /**
     *
     * @return
     */
    public int getMoney(){
        return money;
    }

}
