package controller;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Controller {

    public void initializeGUI(int numPlayers)
    {
        GUI_Field[] fields = new GUI_Field[24];

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

        GUI gui = new GUI(fields);


        if (numPlayers == 2)
        {
            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 20, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 20, car2);
            gui.addPlayer(player2);

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);
        }
        else if (numPlayers == 3)
        {
            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 20, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 20, car2);
            gui.addPlayer(player2);

            GUI_Car car3 = new GUI_Car(Color.yellow, Color.magenta, GUI_Car.Type.UFO, GUI_Car.Pattern.ZEBRA);
            GUI_Player player3 = new GUI_Player("Spiller 3", 20, car3);
            gui.addPlayer(player3);

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);
            fields[0].setCar(player3, true);
        }
        else if (numPlayers == 4)
        {
            GUI_Car car1 = new GUI_Car(Color.red, Color.black, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            GUI_Player player1 = new GUI_Player("Spiller 1", 20, car1);
            gui.addPlayer(player1);

            GUI_Car car2 = new GUI_Car(Color.blue, Color.white, GUI_Car.Type.RACECAR, GUI_Car.Pattern.DIAGONAL_DUAL_COLOR);
            GUI_Player player2 = new GUI_Player("Spiller 2", 20, car2);
            gui.addPlayer(player2);

            GUI_Car car3 = new GUI_Car(Color.yellow, Color.magenta, GUI_Car.Type.UFO, GUI_Car.Pattern.ZEBRA);
            GUI_Player player3 = new GUI_Player("Spiller 3", 20, car3);
            gui.addPlayer(player3);

            GUI_Car car4 = new GUI_Car(Color.green, Color.red, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_LINE);
            GUI_Player player4 = new GUI_Player("Spiller 4", 20, car4);
            gui.addPlayer(player4);

            fields[0].setCar(player1, true);
            fields[0].setCar(player2, true);
            fields[0].setCar(player3, true);
            fields[0].setCar(player4, true);
        }
    }
}
