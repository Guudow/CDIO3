package Game;

//Contains information about the player and initializes Account.
public class Player {

    private int position = 0;
    private int playerNumber;
    private int numPlayers;
    private Account account;
    private boolean jailed;
    private boolean owner;

    /**
     *
     * @param numPlayers
     * @param playerNumber
     */
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

    /**
     *
     * @param jailed
     */
    public void setJailed(boolean jailed){this.jailed = jailed;}

    /**
     *
     * @return
     */

    public boolean getJailed(){return jailed;}

    /**
     *
     * @param amount
     */

    public void setMoney(int amount)
    {
        account.setMoney(amount);
        if (account.getMoney() < 0)
        {
            account.setMoney(0);
        }
    }

    /**
     *
     * @return
     */

    public int getMoney()
    {
        return account.getMoney();
    }

    /**
     *
     * @return
     */
    public int getPosition()
    {
        return position;
    }

    /**
     *
     * @return
     */
    public int getPlayerNumber(){return playerNumber;}

    /**
     *
     * @return
     */

    public int getNumPlayers(){return numPlayers;}

    /**
     *
     * @param owner
     */

    public void setOwner(boolean owner){this.owner = owner;}

    /**
     *
     * @return
     */

    public boolean getOwner(){return owner;}

    /**
     *
     * @param position
     */

    public void setPosition(int position)
    {
        this.position += position;
        if (this.position > 23)
        {
            this.position = this.position - 24;
        }
    }
}
