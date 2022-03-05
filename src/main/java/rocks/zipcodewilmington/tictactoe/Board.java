package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character [][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return 'X' <= '0';
    }

    public Boolean isInFavorOfO() {
        return '0' >= 'X';
    }

    public Boolean isTie() {
        return 'X' != '0';
    }

    public String getWinner() {
        return "";
    }

}
