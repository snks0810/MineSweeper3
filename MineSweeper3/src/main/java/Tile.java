public class Tile {
    // attributes

    public boolean isBomb;
    public int surroundingBombs;
    private boolean uncovered;
    private boolean flagged;
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


    public String toString(){
        if(!uncovered){
            return "[ ]";
        }
        else if(isBomb){
            return "[*]";
        }
        else{
            return "["+surroundingBombs+"]";
        }
    }
}
