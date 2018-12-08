package Game;

import controller.Controller;

//Initializes the game and contains the game loop.
public class Game {


    /**
     * @param args
     */
    public static void main(String[] args) {
        GameLogic kør = new GameLogic();
        kør.logic();

    }
}
