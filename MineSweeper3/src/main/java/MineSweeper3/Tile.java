package MineSweeper3;
public class Tile {
    // attributes

    public boolean isBomb;
    public int surroundingBombs;
    public boolean uncovered;
    public boolean flagged;
    private int xCoordinate;
    private int yCoordinate;

    // constructors

    public Tile(int x,int y){
        this.xCoordinate = x;
        this.yCoordinate = y;
        float randomFloat = (float) Math.random();
        float bombRatio = 0.25f;
        if(randomFloat <= bombRatio){
            isBomb = true;}
        else{
            isBomb = false;}
        uncovered = true;
        //flagged = true;
    }

    // methods

    public int getSurroundingBombs(){
        return surroundingBombs;}

    public void setSurroundingBombs( int surroundingBombCounter){
        this.surroundingBombs = surroundingBombCounter;}

    public boolean getIsBomb(){
        return isBomb;}

    public void setIsBomb( boolean bombState){
        this.isBomb = bombState;}

    public boolean getUncovered(){
        return this.uncovered;}

    public void setUncovered( boolean isUnCovered){
        this.uncovered = isUnCovered;}

    public boolean getFlagged(){
        return this.flagged;}

    public void setFlagged( boolean isFlagged){
        this.flagged = isFlagged;}

    public String toString(){
        if(!uncovered){
            return "[ ]";
        }
        else if(flagged){
            return "[F]";
        }
        else if(isBomb){
            return "[*]";
        }
        else{
            return "["+surroundingBombs+"]";
        }
    }
}
