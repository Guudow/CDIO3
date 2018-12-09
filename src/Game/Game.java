package Game;

import controller.Controller;

import java.util.Scanner;

//Initializes the game and contains the game loop.
public class Game {

    public static void main(String[] args) {
        boolean winner = false;
        int numPlayers = 0;
        Player[] playerArray;

        Scanner scanner = new Scanner(System.in);


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
