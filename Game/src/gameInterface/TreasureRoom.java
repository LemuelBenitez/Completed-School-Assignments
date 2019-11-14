package gameInterface;

import MyGame.MyPlayer;

/**
 * 
 * A class that implements this interface should have the following attributes:
 * <ul>
 * 
 * <li>treasure: String</li>
 * 
 * </ul>
 * 
 * The implementing class should only have the following constructor:
 * 
 * public TreasureRoom(String description, Monster monster, String treasure)
 * 
 */
public interface TreasureRoom extends Room {

	/**
	 * This method will display the message:
	 * <br>
	 * <br>
	 * "This Room is <code>this.description</code>, and has <code>this.monster</code>"
	 * <br>
	 * <br>
	 * If the monster <code>isAlive()</code> allow the player to enter the room and start a battle 
	 * 
	 * If <code>player</code> is alive, display the message:
	 * <br>
	 * <br>
	 * "You explored the room and found the hidden treasure!"
	 * 
	 * @param player entering the room
	 */
	@Override
	public void enter(MyPlayer player);
	
}