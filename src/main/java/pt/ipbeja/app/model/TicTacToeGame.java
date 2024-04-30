package pt.ipbeja.app.model;

public class TicTacToeGame {

    private static final int SIZE = 3;
    private Mark[][] board;

    private int turnCounter = 0;

    private View view;

    public TicTacToeGame() {
        this.createBoard();
    }

    public void startGame(View view) {
        this.view = view;
    }

    private void createBoard() {
        this.board = new Mark[SIZE][SIZE];
        for (int line = 0; line < SIZE; line++) {
            for (int col = 0; col < SIZE; col++) {
                this.board[line][col] = Mark.EMPTY;
            }
        }
    }

    public Player getCurrentPlayer() {
        return this.turnCounter % 2 == 0 ? Player.X : Player.O;
    }

    public void positionSelected(Position position) {
        this.view.positionSelected(position);
    }

    public void onBoardMarkChange(Mark mark, Position position) {
        this.turnCounter++;
        this.board[position.getRow()][position.getCol()] = mark;
        this.positionSelected(position);
        this.view.onBoardMarkChange(mark, position);

    }


    public void onGameWon(Player player) {
        this.view.onGameWon(player);
    }

    public void onGameDraw() {
        this.view.onGameDraw();
    }
}
