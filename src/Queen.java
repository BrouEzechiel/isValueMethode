public class Queen extends Piece{
    int row;
    int column;

    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(newPosition)){return false;}
        boolean rockMove = (position.column == this.column || position.row == this.row);
        boolean bishopMove = (Math.abs(Position.column - this.column) == Math.abs(Position.row - this.row));

        return rockMove || bishopMove;
    }
}
