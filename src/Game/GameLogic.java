package Game;

import controller.Controller;

//Contains the games rules.
public class GameLogic {

    private Dice dice = new Dice(6);

    /**
     *
     * @param player
     */

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

    /**
     *
     * @param player
     * @param field
     */
    public void findOwner(Player [] player, Field field){
        for (int i = 0; i < player.length; i++){
            if (field.getOwner() == player[i].getPlayerNumber()){
                player[i].setOwner(true);
            }
        }
    }

    /**
     *
     * @param field
     * @param player
     */
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

    /**
     *
     * @param field
     * @param renter
     * @param owner
     */
    public void payRent(Field field, Player renter, Player [] owner) {
        if (field.getOwned() == true){
            renter.setMoney(-field.getPrice());
        for (int i = 0; i < owner.length; i++) {
            if (field.getOwner()== owner[i].getPlayerNumber()){
            owner[i].setMoney(field.getPrice());

            }
        }
     }
    }
    //paydoubleRent substracts two times the price of the proberty from the renters account
    // and then add that amount to the proberty owners account.

    /**
     *
     * @param field
     * @param renter
     * @param owner
     */
    public void paydoubleRent(Field field, Player renter, Player [] owner) {
        if (field.getOwned() == true){
            renter.setMoney(-(field.getPrice()+field.getPrice()));
            for (int i = 0; i < owner.length; i++) {
                if (field.getOwner()==owner[i].getPlayerNumber()){
                    owner[i].setMoney((field.getPrice()+field.getPrice()));}
            }
        }
    }
    // sets jailed to true and moves player to jail field(6)

    /**
     *
     * @param player
     */
    public void toJail(Player player){
        player.setJailed(true);
        player.setPosition(6);
    }
    // if jailed is true player pays a fee of 1.

    /**
     *
     * @param player
     */
    public void outJail(Player player){
        if (player.getJailed()==true){
            player.setMoney(player.getMoney()-1);
            player.setJailed(false);
        }
    }

    public void logic(){
        boolean winner = false;
        int numPlayers = 0;
        Player[] playerArray;


        Controller controller = new Controller(numPlayers);


        while (true)
        {
            int playercount= controller.getNumPlayers();



            if (playercount == 2)
            {
                numPlayers = 2;
                Player player1 = new Player(numPlayers, 1);
                Player player2 = new Player(numPlayers, 2);

                playerArray = new Player[2];
                playerArray[0] = player1;
                playerArray[1] = player2;
                break;
            }
            else if (playercount == 3)
            {
                numPlayers = 3;
                Player player1 = new Player(numPlayers, 1);
                Player player2 = new Player(numPlayers, 2);
                Player player3 = new Player(numPlayers, 3);

                playerArray = new Player[3];
                playerArray[0] = player1;
                playerArray[1] = player2;
                playerArray[2] = player3;
                break;
            }
            else if (playercount == 4)
            {
                numPlayers = 4;
                Player player1 = new Player(numPlayers, 1);
                Player player2 = new Player(numPlayers, 2);
                Player player3 = new Player(numPlayers, 3);
                Player player4 = new Player(numPlayers, 4);

                playerArray = new Player[4];
                playerArray[0] = player1;
                playerArray[1] = player2;
                playerArray[2] = player3;
                playerArray[3] = player4;
                break;
            }
            else
            {
                System.out.println("Ugyldigt input");

            }
        }

        GameBoard gameBoard = new GameBoard();
        GameLogic gameLogic = new GameLogic();



        for (int turn = 0; turn < numPlayers + 1; turn++)
        {
            if (turn == numPlayers && winner == false)
            {
                turn = 0;
            }

            controller.dicePrompt();

            controller.removePlayer(playerArray[turn].getPosition(), turn);
            gameLogic.movePlayer(playerArray[turn]);
            controller.setPlayerPosition(playerArray[turn].getPosition(), turn);

            int pos = playerArray[turn].getPosition();

            Field currentfield= gameBoard.getfield(pos);

            if(currentfield.getOwned()==false){
                gameLogic.purchaseProperty(currentfield,playerArray[turn]);
            } else {
                gameLogic.payRent(currentfield,playerArray[turn],playerArray);
            }

            controller.setPlayerBalance(playerArray[turn].getMoney(), turn);

            if (playerArray[turn].getMoney() == 0)
            {
                controller.printMessage(turn + 1);
                break;
            }

        }

    }
}
