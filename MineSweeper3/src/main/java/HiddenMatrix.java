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
        //int a = 0; int b = 0;
             checkSurroundingBombs(a,b);
            }
    }}

    // methods

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
                    if(i==0 && j==0){}
                    else{
                        if (matrix[a+i][b+j].isBomb) {
                            matrix[a][b].surroundingBombs++;}}
                }else{}
            }
        }
    }
}
