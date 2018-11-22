package Game;

public class GameLogic {

    private Dice dice = new Dice(6);

    public int movePlayer()
    {
        int result = dice.roll();
        return result;
    }
}
