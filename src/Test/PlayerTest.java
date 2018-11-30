package Test;

import Game.Player;

import static org.junit.Assert.*;

public class PlayerTest {

    //Tests that the players balance cant go below 0.
    @org.junit.Test
    public void getMoney() {
        Player player = new Player(2, 1);
        player.setMoney(-22);
        assertEquals(0, player.getMoney());
    }

    //Tests that the players position resets when going beyond 23.
    @org.junit.Test
    public void getPosition() {
        Player player = new Player(2, 1);
        player.setPosition(24);
        assertEquals(0, player.getPosition());
    }
}