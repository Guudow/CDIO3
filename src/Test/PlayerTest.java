package Test;

import Game.Player;

import static org.junit.Assert.*;

public class PlayerTest {

    @org.junit.Test
    public void getMoney() {
        Player player = new Player(2, 1);
        player.setMoney(-22);
        assertEquals(0, player.getMoney());
    }

    @org.junit.Test
    public void getPosition() {
        Player player = new Player(2, 1);
        player.setPosition(24);
        assertEquals(0, player.getPosition());
    }
}