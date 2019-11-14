package gameInterface;

import MyGame.MyPlayer;

/**
 * 
 * A class that implements this interface should have the following attributes:
 * <ul>
 * 
 * <li>roomIndex: int</li>
 * 
 * <li>description: String</li>
 * 
 * <li>monster: Monster</li>
 *
 * </ul>
 * 
 * The implementing class should only have the following constructor:
 * 
 * public Room(int roomIndex, String description, Monster monster)
 *
 */

public interface Room {

	/**
	 * This method returns <code>true</code> if the Monster in <code>this</code> Room has died.
	 * 
	 * @return <code>true</code> if   <code>this</code> Room <code>monster !isAlive()</code>, <code>false</code> otherwise.
	 * 
	 */
	public boolean isComplete();
	
	/**
	 * This method will display the message:
	 * <br>
	 * <br>
	 * "<code>player name</code>"
	 * "This Room is <code>this.description</code>, and has <code>this.monster</code>"
	 * <br>
	 * <br>
	 * If the monster <code>isAlive()</code> allow the player to enter the room and start a battle 
	 * @param player entering the room
	 */
	public void enter(MyPlayer player);

	/**
	 * 
	 * @return A String formatted as follows:
	 * <br>
	 * <br>
	 * "Room index %2d, description %20s, monster name %20s"
	 */
	@Override
	public String toString();
	


}
