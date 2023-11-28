public class Minesweeper {
    public final static int STATUS_VALUE = 0;
    public final static int FLAGGED = 4;
    public List<int[]> getFlaggedCells() {
    List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
                    return flaggedCells;
    }
}

