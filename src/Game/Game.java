package Game;

import controller.Controller;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Game {

    public static void main(String[] args) {
        int numPlayers = 0;
        Player[] playerArray;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Vælg antal spillere:");



        while (true)
        {
            //user inputs amount of players.
            try {
                int playercount = scanner.nextInt();

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
                    System.out.println("Ugyldigt input antal af spillere skal være mellem 2-4 :)");

                }
            } catch (InputMismatchException e){
                System.out.println("Indtast vensligts et HELTAL :)");
                scanner.next();
            }

        }
        Controller controller = new Controller(numPlayers);

        GameBoard gameBoard = new GameBoard();
        GameLogic gameLogic = new GameLogic();





        /// determans whos turn it is and changes the turn.
        int turn = 0;

        while (turn < numPlayers)
        {

            controller.removePlayer(playerArray[turn].getPosition(), turn);
            gameLogic.movePlayer(playerArray[turn]);
            controller.setPlayerPosition(playerArray[turn].getPosition(), turn);

            if(turn > numPlayers){
                turn=0;
            }
            turn++;

        }


    }
}
