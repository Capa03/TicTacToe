package pt.ipbeja.app.ui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pt.ipbeja.app.model.Mark;

public class TicTacToeButton extends Button {

    public static final Image EMPTY = new Image("noplayer.png");
    public static final Image PLAYER_X = new Image("x.png");
    public static final Image PLAYER_O = new Image("o.png");
    private final ImageView imageView;

    public TicTacToeButton() {

        this.imageView = new ImageView(EMPTY);
        setGraphic(this.imageView);
    }

    public void setMark(Mark mark) {
        switch (mark) {
            case X_MARK:
                setX();
                break;
            case O_MARK:
                setO();
                break;
            case EMPTY:
                setEmpty();
                break;
        }
    }

    public void setX(){
        imageView.setImage(PLAYER_X);
        setGraphic(this.imageView);
        setDisable(true);
    }

    public void setO(){
        imageView.setImage(PLAYER_O);
        setDisable(true);
    }

    private void setEmpty() {
        imageView.setImage(EMPTY);
        setGraphic(imageView);
        setDisable(false);
    }
}
