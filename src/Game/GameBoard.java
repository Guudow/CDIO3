package Game;

//Initializes the Fields and keeps track of them.
public class GameBoard {

    private int fields = 24;
    Field[] fieldArray;

    /**
     *
     */
    public GameBoard()
    {
        fieldArray = new Field[24];



        fieldArray[0] = new Field("Start", false, false);
        fieldArray[1] = new Field("Burgerbaren",1, 1, false);
        fieldArray[2] = new Field("Pizzariaet", 1,1, false);
        fieldArray[3] = new Field("Chance", false, true);
        fieldArray[4] = new Field("Slikbutikken", 2,1, false);
        fieldArray[5] = new Field("Iskiosken", 2,1, false);
        fieldArray[6] = new Field("På besøg i fængsel",false, false);
        fieldArray[7] = new Field("Museet", 3,2, false);
        fieldArray[8] = new Field("Biblioteket", 3,2, false);
        fieldArray[9] = new Field("Chance", false, true);
        fieldArray[10] = new Field("Skateparken", 4,2, false);
        fieldArray[11] = new Field("Swimmingpoolen", 4,2, false);
        fieldArray[12] = new Field("Gratis parkering", false, false);
        fieldArray[13] = new Field("Spillehallen", 5,3, false);
        fieldArray[14] = new Field("Biografen", 5,3, false);
        fieldArray[15] = new Field("Chance", false, true);
        fieldArray[16] = new Field("Legetøjsbutikken", 6,3, false);
        fieldArray[17] = new Field("Dyrehandlen", 6,3, false);
        fieldArray[18] = new Field("Gå i fængsel", true);
        fieldArray[19] = new Field("Bowlinghallen", 7,4, false);
        fieldArray[20] = new Field("Zoo",7 ,4, false);
        fieldArray[21] = new Field("Chance", false, true);
        fieldArray[22] = new Field("Vandlandet", 8,5, false);
        fieldArray[23] = new Field("Strandpromenaden", 8,5, false);

    }

    /**
     *
     * @param position
     * @return
     */

    public Field getfield(int position){
        return fieldArray[position];
    }


    /**
     *
     * @param fieldArray
     * @return
     */
    public String toString(Field[] fieldArray)
    {
        String str = new String();

        for (int i = 0; i < fieldArray.length; i++)
        {
            str += fieldArray[i].toString() + "\n";
        }
        return str;
    }
}
