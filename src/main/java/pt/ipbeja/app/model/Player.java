package pt.ipbeja.app.model;

public enum Player {
    X(Mark.X_MARK), O(Mark.O_MARK);

    private final Mark mark;

    Player(Mark mark){
        this.mark = mark;
    }

    public Mark getMark(){
        return this.mark;
    }
}
