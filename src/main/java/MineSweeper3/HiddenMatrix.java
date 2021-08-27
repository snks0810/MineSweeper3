package MineSweeper3;

public class HiddenMatrix {

    // attributes

    private Tile[][] matrix;
    private int columns = 10;
    private int rows = 10;

    // constructors

    public HiddenMatrix() {
        matrix = hiddenMatrixGeneration(columns, rows);
        bombCounterInit();
    }

    private Tile[][] hiddenMatrixGeneration(int columns, int rows) {
        Tile[][] hiddenMatrix = new Tile[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                hiddenMatrix[i][j] = new Tile(i, j);
            }
        }
        return hiddenMatrix;
    }

    private void bombCounterInit(){
        for(int a = 0; a <= columns-1; a++){
            for(int b = 0; b <= rows-1; b++){
             checkSurroundingBombs(a,b);
            }
    }}

    // methods

    //public static void tileCoordinates(Tile[][] someTile) {
    //
    //    System.out.println("Uncover or Flag a tile? (u/f)");
    //    Scanner optionEntered = new Scanner(System.in);
    //    String optionSelected = optionEntered.nextLine();

    //    System.out.println("Column of the matrix?");
    //    Scanner columnEntered = new Scanner(System.in);
    //    String columnSelected = columnEntered.nextLine();
    //    int cNum = Integer.parseInt(String.valueOf(columnSelected));
    //    System.out.println("Row of the matrix?");
    //    Scanner rowEntered = new Scanner(System.in);
    //    String rowSelected = rowEntered.nextLine();
    //    int rNum = Integer.parseInt(String.valueOf(rowSelected));;

    //    if(optionSelected.equals("u")){
    //        if(!someTile[cNum][rNum].getUncovered()){
    //            someTile[cNum][rNum].setUncovered(true);
    //            if(someTile[cNum][rNum].uncovered && someTile[cNum][rNum].isBomb){
    //                System.out.println("Game Over");
    //            }
    //        }
    //        else{System.out.println("Please select a covered tile");
    //        }
    //    }
    //    else if(optionSelected.equals("f")){
    //        if(!someTile[cNum][rNum].getUncovered() && !someTile[cNum][rNum].getFlagged()){
    //            someTile[cNum][rNum].setFlagged(true);
    //        }
    //        else if(someTile[cNum][rNum].getUncovered() || someTile[cNum][rNum].getFlagged()){System.out.println("Please select a covered, un-flagged tile");}
    //        else{}
    //    }
    //    else{System.out.println("Please type u or f");}
    //}

    public String toString () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                sb.append(matrix[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void checkSurroundingBombs(int a,int b){
        for(int i = -1; i <= 1; i++){        // checks top, middle then bottom column
            for(int j = -1; j <= 1; j++){    // checks left, middle then right row
                if(a+i >= 0 && a+i <= 9 && b+j >= 0 && b+j <= 9){
                    if(!(i==0 && j==0)){
                        if (matrix[a+i][b+j].isBomb) {
                            matrix[a][b].surroundingBombs++;}}
                }
            }
        }
    }
}