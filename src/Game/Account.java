package Game;

public class Account extends Player{

    //int for amount of money in account
    private int money;

    public Account()
    {

    }

    public int setMoney(int amount){
        money += amount;
        if (money < 0)
        {
            money = 0;
        }
        return money;
    }

    public int getMoney(){
        return money;
    }

/*
    public int restartPoints(){
        points=1000;
        return points;
    }
    */
}
