package chess;

import board.Position;

public class ChessPosition {

	private int row;
	private char column;

	public ChessPosition(int row, char column) {
		this.column = column;
		this.row = row;
	}
	
	protected Position toPosition() {
		return new Position(row,getEquivalentColumn(column));
	}
	
	protected ChessPosition fromPosition(Position position) {
		return new ChessPosition(position.getRow(),getEquivalentColumn(position.getColumn()));
	}
	
	private int getEquivalentColumn(char column) {
		
		int numericColumn;
		switch (column) {
		case 'a':
			numericColumn = 1;
			break;
		case 'b':
			numericColumn = 2;
			break;
		case 'c':
			numericColumn = 3;
			break;
		case 'd':
			numericColumn = 4;
			break;
		case 'e':
			numericColumn = 5;
			break;
		case 'f':
			numericColumn = 6;
			break;
		case 'g':
			numericColumn = 7;
			break;
		case 'h':
			numericColumn = 8;
			break;
		default:
			throw new RuntimeException("Invalid char column");
		}
		return numericColumn;
		
	}
	
	private char getEquivalentColumn(int column) {
		
		char charColumn;
		
		switch (column) {
		case 1:
			charColumn = 'a';
			break;
		case 2:
			charColumn = 'b';
			break;
		case 3:
			charColumn = 'c';
			break;
		case 4:
			charColumn = 'd';
			break;
		case 5:
			charColumn = 'e';
			break;
		case 6:
			charColumn = 'f';
			break;
		case 7:
			charColumn = 'g';
			break;
		case 8:
			charColumn = 'h';
			break;
		default:
			throw new RuntimeException("Invalid char column");
		}
		return charColumn;
	}

}
