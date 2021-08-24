import java.util.Scanner;

public class Main {

    //public static void tileCoordinates(Tile[][] someTile) {

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

    public static void main (String[] args){

        HiddenMatrix matrix = new HiddenMatrix();
        System.out.println(matrix);

        //for(int i = 0; i < 100; i++){
        //    tileCoordinates(matrix);
        //}
    }
}
