package Game;

public class Player {

    private int position;
    private int playerNumber;
    private Account account;
    private boolean jailed;

    public Player(int numPlayers, int playerNumber)
    {
        jailed = false;
        position = 0;
        this.playerNumber = playerNumber;
        account = new Account();

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

    public void setJailed(boolean jailed){this.jailed = jailed;}

    public boolean getJailed(){return jailed;}

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

    public int getPlayerNumber(){return playerNumber;}

    {
        this.position += position;
        if (position > 23)
        {
            this.position = position - 23;
        }
    }
}
