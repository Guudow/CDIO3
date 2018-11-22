package Game;

public class Player {

    private int position;
    private Account account;

    public Player(int numPlayers)
    {
        position = 0;

        if (numPlayers == 2)
        {
            account.setMoney(20);
        }
        else if (numPlayers == 3)
        {
            account.setMoney(18);
        }
        else if (numPlayers == 4)
        {
            account.setMoney(16);
        }
    }

    public void setMoney(int amount)
    {
        account.setMoney(amount);
    }

    public int getMoney()
    {
        return account.getMoney();
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
        if (position > 23)
        {
            this.position = position - 23;
        }
    }
}
