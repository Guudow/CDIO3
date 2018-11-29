package Game;

import controller.Controller;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Game {
    

    public static void main(String[] args) {
        Controller controller = new Controller();


        /*Scanner scanner = new Scanner(System.in);*/
        int numPlayers = 0;

            //user inputs amount of players.
        int playercount = controller.getNumPlayers();
        Player[] playerArray;
        GameBoard gameBoard = new GameBoard();
        GameLogic gameLogic = new GameLogic();

        /*while(true) {

            if (playercount == 2) {
                numPlayers = 2;
                Player player1 = new Player(numPlayers, 1);
                Player player2 = new Player(numPlayers, 2);

                playerArray = new Player[2];
                playerArray[0] = player1;
                playerArray[1] = player2;

            } else if (playercount == 3) {
                numPlayers = 3;
                Player player1 = new Player(numPlayers, 1);
                Player player2 = new Player(numPlayers, 2);
                Player player3 = new Player(numPlayers, 3);

                playerArray = new Player[3];
                playerArray[0] = player1;
                playerArray[1] = player2;
                playerArray[2] = player3;

            } else if (playercount == 4) {
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



        }


        //try to create a loop that runs the game automatically
        int turn = 0;

                            controller.removePlayer(playerArray[turn].getPosition(), turn);
                            gameLogic.movePlayer(playerArray[turn]);
                            controller.setPlayerPosition(playerArray[turn].getPosition(), turn);

                            if(turn > playercount){
                                    turn=0;
                            }
                            turn++;


        //tester hvordan det virker*/


    }





}






