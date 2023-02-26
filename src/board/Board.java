package board;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][columns];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public boolean thereIsAPiece(Position position) {
		return piece(position) != null ? true : false; 
	}
	
	public boolean positionExists(Position position) {
		return position.getRow() <= rows && position.getColumn() <= columns;
	}
	
	public Piece removePiece(Position position) throws BoardException {
		if(thereIsAPiece(position)) {
			pieces[position.getRow()][position.getColumn()] = null;
			return piece(position);
		}
		throw new BoardException("Position is empty");
	}
	
	public void placePiece(Piece piece, Position position) throws BoardException {
		
		if (positionExists(position)) {
			if (!thereIsAPiece(position)) {
				pieces[position.getRow()][position.getColumn()] = piece;
			}
			else {
				throw new BoardException("Position is occupied");
			}
		}
		else {
			throw new BoardException("Position does not exist");
		}
		
	}

}
