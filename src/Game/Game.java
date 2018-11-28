package Game;

import controller.Controller;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Game {

    public static void main(String[] args) {
        int numPlayers = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Vælg antal spillere:");



        while (true)
        {
            //sørger for at der kun kan indtastes mellem 2-4 spillere.
            try {
                int playercount = scanner.nextInt();

                if (playercount == 2)

                {
                    numPlayers = 2;
                    Player player1 = new Player(numPlayers, 1);
                    Player player2 = new Player(numPlayers, 2);
                    break;
                }
                else if (playercount == 3)
                {
                    numPlayers = 3;
                    Player player1 = new Player(numPlayers, 1);
                    Player player2 = new Player(numPlayers, 2);
                    Player player3 = new Player(numPlayers, 3);
                    break;
                }
                else if (playercount == 4)
                {
                    numPlayers = 4;
                    Player player1 = new Player(numPlayers, 1);
                    Player player2 = new Player(numPlayers, 2);
                    Player player3 = new Player(numPlayers, 3);
                    Player player4 = new Player(numPlayers, 4);
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

    }
}
