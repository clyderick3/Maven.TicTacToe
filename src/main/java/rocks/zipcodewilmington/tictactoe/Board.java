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
        //looking for three x's in a row.

    int favorX = 0;
    if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X'){
        favorX = 1;
    }
    else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X'){
        favorX = 1;
    }
    else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X'){
        favorX = 1;
    }
    else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X'){
        favorX = 1;
    }
    else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X'){
        favorX = 1;
    }
    else if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X'){
        favorX = 1;
    }
    else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X'){
        favorX = 1;
    }
    else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X'){
        favorX = 1;
    }
    else {
        favorX = 0;
    }

        return favorX == 1;
                            }

    public Boolean isInFavorOfO() {
        //test to see if O has won.
        //looking for three O's in a row.

        int favorO = 0;
        if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O'){
            favorO = 1;
        }
        else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O'){
            favorO = 1;
        }
        else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O'){
            favorO = 1;
        }
        else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O'){
            favorO = 1;
        }
        else if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O'){
            favorO = 1;
        }
        else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O'){
            favorO = 1;
        }
        else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O'){
            favorO = 1;
        }
        else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O'){
            favorO = 1;
        }
        else {
            favorO = 0;
        }

        return favorO == 1;
    }

    public Boolean isTie() {
        // test to see if neither won.
        int favorOX = 0;
        if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O' ||
                matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X'){
            favorOX = 1;
        }
        else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O' ||
                matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X'){
            favorOX = 1;
        }
        else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O' ||
                matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X'){
            favorOX = 1;
        }
        else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O' ||
                matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X'){
            favorOX = 1;
        }
        else if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O' ||
                matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X'){
            favorOX = 1;
        }
        else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O' ||
                matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X'){
            favorOX = 1;
        }
        else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O' ||
                matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X'){
            favorOX = 1;
        }
        else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O' ||
                matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X'){
            favorOX = 1;
        }
        else {
            favorOX = 0;
        }

        return favorOX == 0;
    }

    public String getWinner() {
        //one or the other has to get 3 in a row to win the game.
    }

}
