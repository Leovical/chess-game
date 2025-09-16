package application;

import gameboard.Board;
import gameboard.Piece;
import gameboard.Position;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);
		Piece pieces = new Piece(board);
	}

}
