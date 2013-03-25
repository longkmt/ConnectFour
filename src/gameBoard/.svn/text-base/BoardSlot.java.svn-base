/*
 *	Team 01
 * 	Nicholas Oborny
 * 	Gregory LaFlash
 * 	Long Tran
 * 	
 *	Individual spot on the Game Board
 */

package gameBoard;

public class BoardSlot {
	
	/* Define the states that the node may have */
	public enum State{EMPTY,USER,COMPUTER}
	
	/* References to surrounding slots */
	private BoardSlot topLeft;
	private BoardSlot top;
	private BoardSlot topRight;
	private BoardSlot left;
	private BoardSlot right;
	private BoardSlot bottomLeft;
	private BoardSlot bottom;
	private BoardSlot bottomRight;
	
	private State state;
	
	/* Constructors */
	
	public BoardSlot(){
//		topLeft = new BoardSlot();
//		top = new BoardSlot();
//		topRight  = new BoardSlot();
//		left = new BoardSlot();
//		right = new BoardSlot();
//		bottomLeft = new BoardSlot();
//		bottom = new BoardSlot();
//		bottomRight = new BoardSlot();
//		
		state = State.EMPTY;
	}
		
	public BoardSlot(BoardSlot p_topLeft,BoardSlot p_top,BoardSlot p_topRight,
					BoardSlot p_left,BoardSlot p_right,BoardSlot p_bottomLeft,
					BoardSlot p_bottom,BoardSlot p_bottomRight){
		topLeft = p_topLeft;
		top = p_top;
		topRight  = p_topRight;
		left = p_left;
		right = p_right;
		bottomLeft = p_bottomLeft;
		bottom = p_bottom;
		bottomRight = p_bottomRight;
		
		state = State.EMPTY;
	}
	
	/* Modifiers */
	public void setTL(BoardSlot newSlot){
		topLeft = newSlot;
	}
	public void setT(BoardSlot newSlot){
		top = newSlot;
	}
	public void setTR(BoardSlot newSlot){
		topRight = newSlot;
	}
	public void setL(BoardSlot newSlot){
		left = newSlot;
	}
	public void setR(BoardSlot newSlot){
		right = newSlot;
	}
	public void setBL(BoardSlot newSlot){
		bottomLeft = newSlot;
	}
	public void setB(BoardSlot newSlot){
		bottom = newSlot;
	}
	public void setBR(BoardSlot newSlot){
		bottomRight = newSlot;
	}
	
	/* Change the slot state */
	public void changeState(State newState){
		state = newState;
	}
	
	/* Accessors */
	public BoardSlot tl(){
		return topLeft;
	}
	public BoardSlot t(){
		return top;
	}
	public BoardSlot tr(){
		return topRight;
	}
	public BoardSlot l(){
		return left;
	}
	public BoardSlot r(){
		return right;
	}
	public BoardSlot bl(){
		return bottomLeft;
	}
	public BoardSlot b(){
		return bottom;
	}
	public BoardSlot br(){
		return bottomRight;
	}
	
	public void setState(State newState){
		state = newState;
	}
	
	/* Check state of slot */
	public boolean isEmpty(){
		return state == State.EMPTY;
	}
	public boolean isUser(){
		return state == State.USER;
	}
	public boolean isComp(){
		return state == State.COMPUTER;
	}
	
}
