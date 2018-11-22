package Game;

public class Account{

    //int for amount of money in account
    private int money = 0;

    public void setMoney(int amount){
        money += amount;
        if (money < 0)
        {
            money = 0;
        }
    }

    public int getMoney(){
        return money;
    }

}
