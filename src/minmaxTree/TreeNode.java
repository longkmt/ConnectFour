/*
 *	Team 01
 * 	Nicholas Oborny
 * 	Gregory LaFlash
 * 	Long Tran
 * 	
 *	Object for the Tree Node
 */

package minmaxTree;

import java.util.List;
import gameBoard.Board;

public class TreeNode {
	private Board boardState;
	private TreeNode parent;
	private List<TreeNode> children;

	/*
	 *	The constructor for the root of a Tree. 
	 *	Constructs the root from the current state 
	 *	of the board. Leaves the parent TreeNode
	 *	undefined.
	 */
	public TreeNode(Board boardState_) 
	{
		boardState = boardState_;
	}
	
	/* 
	 * 	Constructor for all other TreeNodes. 
	 * 	Creates a TreeNode from the passed board state
	 * 	and a TreeNode that will be its parent.
	 */
	public TreeNode(Board boardState_, TreeNode parent_)
	{
		boardState = boardState_;
		parent = parent_;
	}
	
	/*	Returns the parent of the current TreeNode. */
	public TreeNode GetParent()
	{
		return parent;
	}
	
	/*	Returns the board state of the current TreeNode. */
	public Board GetBoardState()
	{
		return boardState;
	}
	
	/* 
	 *	Adds a child TreeNode to the list of a TreeNode's
	 *	children. Returns true if it succeeds and
	 *	false if it fails. 
	 */
 	public boolean AddChild(Board nextBoardState) 
	{
		return children.add(new TreeNode(nextBoardState, this));
	}
	
	/* 
	 *	Removes a child TreeNode from the list of TreeNode's
	 *	children with a specified index Returns the removed 
	 *	TreeNode if it succeeds.
	 */
	public TreeNode RemoveChild(int index)
	{
		if (children.isEmpty() == true) {
			/* Add error handling for an empty list */			
		}
		return children.remove(index);
	}
	
	/*	
	 * 	Removes a child TreeNode from the list of TreeNode's
	 * 	that matches the passed TreeNode. Returns true
	 * 	if it succeeds and false if it fails.
	 */
	public boolean RemoveChild(TreeNode node)
	{
		return children.remove(node);
	}
	
	/*
	 * 	Returns the child TreeNode of the current TreeNode 
	 * 	with a specified index.
	 */
	public TreeNode GetChild(int index) 
	{
		if (children.isEmpty() == true) {
			/* Add error handling for an empty list */
		}
		return children.get(index);
	}
	
	/*
	 * 	Returns the index of a child matching the passed TreeNode.
	 * 	Returns -1 if no such TreeNode is found.
	 */
	public int IndexOfChild(TreeNode node)
	{
		return children.indexOf(node);
	}

	/*	Returns the number of children of the current TreeNode. */
	public int NumOfChildren()
	{
		return children.size();
	}
}
