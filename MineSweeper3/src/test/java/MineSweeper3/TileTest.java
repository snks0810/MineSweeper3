package MineSweeper3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TileTest {

    @Test
    @DisplayName("bomb counter test")
    public void bombCounterTest(){
        Tile someTile = new Tile(1,1);
        someTile.setSurroundingBombs(2);
        assertEquals(2,someTile.getSurroundingBombs(),
                "failed to hard code the surrounding bomb counter");
    }

    //@Test
    //@DisplayName("bomb state test")
    //public void bombStateTest(){
    //    Tile[][] someTile = new Tile[2][2];
    //    someTile[0][0].setIsBomb(true);
    //    assertEquals(someTile[0][0].getIsBomb(),
    //            "failed to hard code the state of a bomb");
    //}

    //@Test
    //@DisplayName("flag state test")
    //public void flagStateTest(){
    //    Tile[][] someTile = new Tile[0][0];
    //    someTile[0][0].setFlagged(true);
    //    assertEquals(someTile[0][0].getFlagged(),
    //            "failed to hard code the state of a flag");
    //}
}
