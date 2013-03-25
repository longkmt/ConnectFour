/*
 *	Team 01
 * 	Nicholas Oborny
 * 	Gregory LaFlash
 * 	Long Tran
 * 	
 *	The Game Board object
 */

package gameBoard;

public class Board {
	
	private int width;
	private int height;
	//private BoardSlot root;
	private BoardSlot[][] board;
	
	public Board(int p_width, int p_height) {
		width = p_width;
		height = p_height;
		board = new BoardSlot[height][width];
		//root = new BoardSlot();
		/* initialize board and set all references*/
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				/* if not an edge piece */
				if(i > 0 && j > 0 && i < height-1 && j < width-1){
					board[i][j] = new BoardSlot(board[i-1][j-1],board[i-1][j],board[i-1][j+1],
												board[i][j-1],				  board[i][j+1],
												board[i+1][j+1],board[i+1][j],board[i+1][j+1]);
				}
				/* if top left corner */
				else if(i == 0 && j == 0){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(null);
					board[i][j].setT(null);
					board[i][j].setTR(null);
					board[i][j].setL(null);
					board[i][j].setR(board[i][j+1]);
					board[i][j].setBL(null);
					board[i][j].setB(board[i+1][j]);
					board[i][j].setBR(board[i+1][j+1]);
				}
				/* if top right corner */
				else if(i == 0 && j == width - 1){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(null);
					board[i][j].setT(null);
					board[i][j].setTR(null);
					board[i][j].setL(board[i][j-1]);
					board[i][j].setR(null);
					board[i][j].setBL(board[i+1][j-1]);
					board[i][j].setB(board[i+1][j]);
					board[i][j].setBR(null);
				}
				/* if bottom left corner */
				else if(i == height-1 && j == 0){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(null);
					board[i][j].setT(board[i-1][j]);
					board[i][j].setTR(board[i-1][j+1]);
					board[i][j].setL(null);
					board[i][j].setR(board[i][j+1]);
					board[i][j].setBL(null);
					board[i][j].setB(null);
					board[i][j].setBR(null);
				}
				/* if bottom right corner */
				else if(i == height -1 && j == width -1){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(board[i-1][j-1]);
					board[i][j].setT(board[i-1][j]);
					board[i][j].setTR(null);
					board[i][j].setL(board[i][j-1]);
					board[i][j].setR(null);
					board[i][j].setBL(null);
					board[i][j].setB(null);
					board[i][j].setBR(null);
				}
				/* if top edge */
				else if(i == 0 && j >0 && j < width -1){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(null);
					board[i][j].setT(null);
					board[i][j].setTR(null);
					board[i][j].setL(board[i][j-1]);
					board[i][j].setR(board[i][j+1]);
					board[i][j].setBL(board[i+1][j-1]);
					board[i][j].setB(board[i+1][j]);
					board[i][j].setBR(board[i+1][j+1]);
				}
				/* if left edge */
				else if(i > 0 && i < height -1 && j == 0){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(null);
					board[i][j].setT(board[i-1][j]);
					board[i][j].setTR(board[i-1][j+1]);
					board[i][j].setL(null);
					board[i][j].setR(board[i][j+1]);
					board[i][j].setBL(null);
					board[i][j].setB(board[i+1][j]);
					board[i][j].setBR(board[i+1][j+1]);
				}
				/* if right edge */
				else if(i > 0 && i < height -1 && j == width -1){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(board[i-1][j-1]);
					board[i][j].setT(board[i-1][j]);
					board[i][j].setTR(null);
					board[i][j].setL(board[i][j-1]);
					board[i][j].setR(null);
					board[i][j].setBL(board[i+1][j-1]);
					board[i][j].setB(board[i+1][j]);
					board[i][j].setBR(null);
				}
				/* if bottom edge */
				else if(i == height -1 && j > 0 && j < width -1){
					board[i][j] = new BoardSlot();
					board[i][j].setTL(board[i-1][j+1]);
					board[i][j].setT(board[i-1][j]);
					board[i][j].setTR(board[i-1][j+1]);
					board[i][j].setL(board[i][j-1]);
					board[i][j].setR(board[i][j+1]);
					board[i][j].setBL(null);
					board[i][j].setB(null);
					board[i][j].setBR(null);
				}
			} /* end of inner for loop */
		} /* end of outer for loop */
	} /* end of constructor */
	
	/* Accessors */
	public BoardSlot slot(int row, int col){
		return board[row][col];
	}
	public int getWidth(){return width;}
	public int getHeiht(){return height;}
	public BoardSlot[][]  toArray(){
		return board;
		
	}
}
