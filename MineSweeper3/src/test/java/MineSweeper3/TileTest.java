package MineSweeper3;
import MineSweeper3.Tile;
import MineSweeper3.HiddenMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TileTest {

    @Test
    @DisplayName("bomb counter test")
    public void bombCounterTest(){
        Tile[][] someTile = new Tile[0][0];
        someTile[0][0].setSurroundingBombs(2);
        assertEquals(2,someTile[0][0].getSurroundingBombs(),
                "failed to hard code the surrounding bomb counter");
    }

    @Test
    @DisplayName("bomb state test")
    public void bombStateTest(){
        Tile[][] someTile = new Tile[0][0];
        someTile[0][0].setIsBomb(true);
        assertEquals(true,someTile[0][0].getIsBomb(),
                "failed to hard code the state of a bomb");
    }

    @Test
    @DisplayName("flag state test")
    public void flagStateTest(){
        Tile[][] someTile = new Tile[0][0];
        someTile[0][0].setFlagged(true);
        assertEquals(true,someTile[0][0].getFlagged(),
                "failed to hard code the state of a flag");
    }
}
