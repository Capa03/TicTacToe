package pt.ipbeja.app.model;

public interface View {
    void positionSelected(Position positionSelected);

    void onBoardMarkChange(Mark place, Position position);

    void onGameWon(Player player);

    void onGameDraw();
}
