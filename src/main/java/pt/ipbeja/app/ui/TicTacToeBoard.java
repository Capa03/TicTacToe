package pt.ipbeja.app.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import pt.ipbeja.app.model.*;

public class TicTacToeBoard extends GridPane implements View {

    private final int SIZE = 3;

    private TicTacToeGame gameModel;

    private Position positionSelected;

    public TicTacToeBoard(TicTacToeGame game){
        this.gameModel = game;
        this.createBoard();
    }

    private void createBoard() {

        for (int line = 0; line < SIZE; line++) {
            for (int col = 0; col < SIZE; col++) {
                TicTacToeButton button = new TicTacToeButton();
                ButtonHandler buttonHandler = new ButtonHandler();
                button.setOnAction(buttonHandler);
                this.positionSelected = new Position(line,col);
                this.add(button,col,line);
            }
        }
    }


    class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            TicTacToeButton button = (TicTacToeButton) actionEvent.getSource();
            Player currentPlayer = gameModel.getCurrentPlayer();
            button.setMark(currentPlayer.getMark());

            gameModel.onBoardMarkChange(currentPlayer.getMark(),positionSelected);
        }
    }

    @Override
    public void positionSelected(Position positionSelected) {
        this.positionSelected = positionSelected;
    }

    @Override
    public void onBoardMarkChange(Mark place, Position position) {

    }

    @Override
    public void onGameWon(Player player) {
        System.out.println("O jogador " + player.getMark() + " venceu!");
    }

    @Override
    public void onGameDraw() {
        System.out.println("O jogo terminou em empate!");
    }

    public void setGameView(TicTacToeGame game) {
        this.gameModel = game;
        game.startGame(this);
    }


}
