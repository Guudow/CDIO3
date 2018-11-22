package Game;

public class GameBoard {

    private int fields = 24;
    Field[] fieldArray;

    public GameBoard()
    {
        fieldArray = new Field[24];

        fieldArray[0] = new Field("Start", false, false);
        fieldArray[1] = new Field("Burgerbaren", 1, false);
        fieldArray[2] = new Field("Pizzariaet", 1, false);
        fieldArray[3] = new Field("Chance", false, true);
        fieldArray[4] = new Field("Slikbutikken", 1, false);
        fieldArray[5] = new Field("Iskiosken", 1, false);
        fieldArray[6] = new Field("I fængsel", true);
        fieldArray[7] = new Field("Museet", 2, false);
        fieldArray[8] = new Field("Biblioteket", 2, false);
        fieldArray[9] = new Field("Chance", false, true);
        fieldArray[10] = new Field("Skateparken", 2, false);
        fieldArray[11] = new Field("Swimmingpoolen", 2, false);
        fieldArray[12] = new Field("Gratis parkering", false, false);
        fieldArray[13] = new Field("Spillehallen", 3, false);
        fieldArray[14] = new Field("Biografen", 3, false);
        fieldArray[15] = new Field("Chance", false, true);
        fieldArray[16] = new Field("Legetøjsbutikken", 3, false);
        fieldArray[17] = new Field("Dyrehandlen", 3, false);
        fieldArray[18] = new Field("Gå i fængsel", true);
        fieldArray[19] = new Field("Bowlinghallen", 4, false);
        fieldArray[20] = new Field("Zoo", 4, false);
        fieldArray[21] = new Field("Chance", false, true);
        fieldArray[22] = new Field("Vandlandet", 5, false);
        fieldArray[23] = new Field("Strandpromenaden", 5, false);

    }

    public String toString(Field[] fieldArray)
    {

    }
}
