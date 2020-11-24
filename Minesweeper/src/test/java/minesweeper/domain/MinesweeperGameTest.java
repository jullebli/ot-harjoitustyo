
package minesweeper.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinesweeperGameTest {
    
    private Game game;
    
    @Before
    public void setUp() {
        
        game = new Game(new String[] {
        "...M.MMM",
        ".....M.M",
        ".....MMM",
        "........",
        "........",
        "...M....",
        "........",
        ".......M"
        });
    }
    
    @Test
    public void heightIs8() {
        assertEquals(game.getHeight(), 8);
    }
    
    @Test
    public void widthIs8() {
        assertEquals(game.getWidth(), 8);
    }
    
    @Test
    public void whenRunningThenIsRunningReturnsTrue() {
        assertTrue(game.isRunning());
    }
    
    @Test
    public void whenOpensMineThenIsRunningReturnsFalse() {
        game.open(3, 5); //has a mine x = 3, y = 5
        assertFalse(game.isRunning());
    }
    
    @Test
    public void victoryIsFalseInTheBeginning() {
        assertFalse(game.isVictory());
    }
    
    @Test
    public void countMinesReturns8() {
        assertEquals(game.countMines(6,1), 8);
    }
}
