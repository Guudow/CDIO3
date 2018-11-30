package Game;

public class Player {

    private int position = 0;
    private int playerNumber;
    private int numPlayers;
    private Account account;
    private boolean jailed;
    private boolean owner;


    public Player(int numPlayers, int playerNumber)
    {
        jailed = false;
        position = 0;
        this.playerNumber = playerNumber;
        account = new Account();
        this.numPlayers = numPlayers;
        owner = false;

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

    public int getPlayerNumber(){return playerNumber;}

    public int getNumPlayers(){return numPlayers;}

    public void setOwner(boolean owner){this.owner = owner;}

    public boolean getOwner(){return owner;}

    public void setPosition(int position)
    {
        this.position += position;
        if (this.position > 23)
        {
            this.position = this.position - 24;
        }
    }
}
