/*
 *	Team 01
 * 	Nicholas Oborny
 * 	Gregory LaFlash
 * 	Long Tran
 * 	
 *	Manages the game once it begins
 */

package gameManager;

import java.util.Random;

public class GameManager {

	public int randomNumber(int n){
		Random rand = new Random();
		return rand.nextInt(n);
	}
}
