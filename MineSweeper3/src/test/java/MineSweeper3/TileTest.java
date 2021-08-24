package MineSweeper3;
import MineSweeper3.Tile;
import MineSweeper3.HiddenMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TileTest {

    @Test
    @DisplayName("some test")
    public void someTest(){
        Tile[][] someTile = new Tile[0][0];
        someTile[0][0].setSurroundingBombs(2);
        assertEquals(2,someTile[0][0].getSurroundingBombs(),
                "failed to hard code the surrounding bomb counter");
    }
}
