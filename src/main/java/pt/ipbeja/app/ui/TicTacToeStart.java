package pt.ipbeja.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.ipbeja.app.model.TicTacToeGame;

public class TicTacToeStart extends Application {



    @Override
    public void start(Stage primaryStage) {
        TicTacToeGame game = new TicTacToeGame();
        TicTacToeBoard board = new TicTacToeBoard(game);
        board.setGameView(game);
        Scene scene = new Scene(board);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
