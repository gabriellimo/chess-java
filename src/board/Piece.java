package board;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {

		boolean[][] possibleMoves = possibleMoves();
		return possibleMoves[position.getRow()][position.getColumn()];
				
	}
	
	public boolean isThereAnyPossibleMove() {
		
		boolean[][] possibleMoves = possibleMoves();
		
		for (boolean[] array : possibleMoves) {
			for(boolean bool: array) {
				if (bool)
					return true;
			}
		}
		
		return false;		
	}
	
	
	
	
	
}
