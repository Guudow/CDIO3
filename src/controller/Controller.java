package controller;

import Game.GameBoard;
import Game.GameLogic;
import Game.Player;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Controller {
    GUI gui;
    GUI_Field[] fields;
    GUI_Player[] guiPlayerArray;
    int numPlayers;
    Player[] playerArray;
    GameBoard gameBoard = new GameBoard();
    GameLogic gameLogic = new GameLogic();

    public Controller()
    {
        //generating the field and initializing gui
        generateField();
        GUI gui = new GUI(fields);
        this.gui = gui;

        /*Player chooses the amount of things that he or she can do*/


                int tempplayercount = gui.getUserInteger("indtast antal spillere");
                while (true) {

                    if (tempplayercount < 2 || tempplayercount > 4) {
                        tempplayercount = gui.getUserInteger("Der kan kun være 2-4 spillere");
                    } else {
                        numPlayers = tempplayercount;
                        break;
                    }
                }
                amountplay();



                //game while loop

        int turn=0;

        while(turn<=numPlayers-1){

            int playrturn= turn+1;
            //chooses which players turn it is. and throws dice

            gui.getUserButtonPressed("spiller:"+playrturn+"  skal rulle","rul");
            removePlayer(playerArray[turn].getPosition(), turn);
            gameLogic.movePlayer(playerArray[turn]);
            setPlayerPosition(playerArray[turn].getPosition(), turn);

            //player should be able to purchase property


            //we need to check for the winner.


            //when the players turn is over
            turn++;

            if(turn > numPlayers-1){
                turn=0;
            }


        }



    }

    public String dicePrompt()
    {
        return gui.getUserButtonPressed("1", "Kast Terning");
    }

    public void setPlayerPosition(int position, int playerNumber)
    {
        fields[position].setCar(guiPlayerArray[playerNumber], true);
    }

    public void removePlayer(int position, int playerNumber)
    {
        fields[position].setCar(guiPlayerArray[playerNumber], false);
    }

    public int getNumPlayers(){return numPlayers;}

    public void amountplay(){

        if (numPlayers == 2)
        {

            //gui aspects

            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 20, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 20, car2);
            gui.addPlayer(player2);

            guiPlayerArray = new GUI_Player[2];
            guiPlayerArray[0] = player1;
            guiPlayerArray[1] = player2;

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);

            //player aspects
            Player player11 = new Player(numPlayers, 1);
            Player player22 = new Player(numPlayers, 2);

            playerArray = new Player[2];
            playerArray[0] = player11;
            playerArray[1] = player22;



        }
        else if (numPlayers == 3)
        {
            //gui aspects
            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 18, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 18, car2);
            gui.addPlayer(player2);

            GUI_Car car3 = new GUI_Car(Color.yellow, Color.magenta, GUI_Car.Type.UFO, GUI_Car.Pattern.ZEBRA);
            GUI_Player player3 = new GUI_Player("Spiller 3", 18, car3);
            gui.addPlayer(player3);

            guiPlayerArray = new GUI_Player[3];
            guiPlayerArray[0] = player1;
            guiPlayerArray[1] = player2;
            guiPlayerArray[2] = player3;

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);
            fields[0].setCar(player3, true);

            //player aspects
            Player player11 = new Player(numPlayers, 1);
            Player player22 = new Player(numPlayers, 2);
            Player player33 = new Player(numPlayers, 3);

            playerArray = new Player[3];
            playerArray[0] = player11;
            playerArray[1] = player22;
            playerArray[2] = player33;


        }
        else if (numPlayers == 4)
        {
            //gui aspects
            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 16, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 16, car2);
            gui.addPlayer(player2);

            GUI_Car car3 = new GUI_Car(Color.yellow, Color.magenta, GUI_Car.Type.UFO, GUI_Car.Pattern.ZEBRA);
            GUI_Player player3 = new GUI_Player("Spiller 3", 16, car3);
            gui.addPlayer(player3);

            GUI_Car car4 = new GUI_Car(Color.green, Color.red, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_LINE);
            GUI_Player player4 = new GUI_Player("Spiller 4", 16, car4);
            gui.addPlayer(player4);

            guiPlayerArray = new GUI_Player[4];
            guiPlayerArray[0] = player1;
            guiPlayerArray[1] = player2;
            guiPlayerArray[2] = player3;
            guiPlayerArray[3] = player4;

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);
            fields[0].setCar(player3, true);
            fields[0].setCar(player4, true);


            //player aspects

            Player player11 = new Player(numPlayers, 1);
            Player player22 = new Player(numPlayers, 2);
            Player player33 = new Player(numPlayers, 3);
            Player player44 = new Player(numPlayers, 4);

            playerArray = new Player[4];
            playerArray[0] = player11;
            playerArray[1] = player22;
            playerArray[2] = player33;
            playerArray[3] = player44;
        }

    }

    public void generateField(){
        fields = new GUI_Field[24];

        fields[0] = new GUI_Start("Start", "", "Start her", Color.blue, Color.red);
        fields[1] = new GUI_Street("Burgerbaren", "M1", "Køb burger", "1", Color.red, Color.white);
        fields[2] = new GUI_Street("Pizzariaet", "M1", "Køb pizza", "1", Color.red, Color.white);
        fields[3] = new GUI_Chance("?", "Træk kort", "Træk chancekort", Color.white, Color.yellow);
        fields[4] = new GUI_Street("Slikbutikken", "M1", "Køb slik", "1", Color.lightGray, Color.blue);
        fields[5] = new GUI_Street("Isbutikken", "M1", "Køb is", "1", Color.lightGray, Color.blue);
        fields[6] = new GUI_Jail("default", "Fængsel", "Fængsel", "Du er bleven snuppet", Color.black, Color.white);
        fields[7] = new GUI_Street("Museet", "M2", "Gå på museum", "1", Color.magenta, Color.white);
        fields[8] = new GUI_Street("Biblioteket", "M2", "Gå på bibilioteket", "1", Color.magenta, Color.white);
        fields[9] = new GUI_Chance("?", "Træk kort", "Træk chancekort", Color.white, Color.yellow);
        fields[10] = new GUI_Street("Skateparken", "M2", "Stå på skateboard", "1", Color.orange, Color.blue);
        fields[11] = new GUI_Street("Poolen", "M2", "Svøm", "1", Color.orange, Color.blue);
        fields[12] = new GUI_Refuge("default", "Gratis parkering", "", "Vent en tur", Color.white, Color.red);
        fields[13] = new GUI_Street("Spillehallen", "M3", "Spil", "1", Color.red, Color.white);
        fields[14] = new GUI_Street("Biografen", "M3", "Se film", "1", Color.red, Color.white);
        fields[15] = new GUI_Chance("?", "Træk kort", "Træk chancekort", Color.white, Color.yellow);
        fields[16] = new GUI_Street("Legetøjsbutikken", "M3", "Køb legetøj", "1", Color.orange, Color.blue);
        fields[17] = new GUI_Street("Dyrehandlen", "M3", "Køb dyreting", "1", Color.orange, Color.blue);
        fields[18] = new GUI_Jail("default", "Fængsel", "Fængsel", "Du er bleven snuppet", Color.black, Color.white);
        fields[19] = new GUI_Street("Bowlinghallen", "M4", "Bowling", "1", Color.green, Color.red);
        fields[20] = new GUI_Street("Zooliskhave", "M4", "Kig på dyr", "1", Color.green, Color.red);
        fields[21] = new GUI_Chance("?", "Træk kort", "Træk chancekort", Color.white, Color.yellow);
        fields[22] = new GUI_Street("Vandlandet", "M5", "Svøm", "1", Color.blue, Color.white);
        fields[23] = new GUI_Street("Strandpromenaden", "M5", "Strand", "1", Color.blue, Color.white);
    }
    }







