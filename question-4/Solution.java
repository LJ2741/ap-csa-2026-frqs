
public int getPointsForRow(int targetRow) {

    String s = board[targetRow][0].getColor();
    boolean b = true;
    int countRow = 0;

    for (int c = 0; c < board[0].length; c++) {
        if (!board[targetRow][c].getColor().equals(s) || !b) {
             b = false;
        }
        countRow += board[targetRow][c].getPoints();
    }

    if (b) {
        return countRow * 2;
    } else {
        return countRow;
    }
}
