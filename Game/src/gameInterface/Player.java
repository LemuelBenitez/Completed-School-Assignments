package gameInterface;



/**
 * 
 * A class that implements this interface should have the following attributes:
 * <ul>
 * <li>healAmount: int</li>
 * </ul>
 * 
 * The implementing class should only have the following constructor:
 * 
 * public Player(String name, String description, int hitPoints, int damage, int healAmount)
 * 
 */

public interface Player extends Creature {

	/**
	 * 
	 * This method will increase the <code>hitPoints</code> for <code>this Player</code> by <code>this.healAmount</code>.
	 * <br>
	 * <br>
	 * This method will also display the message:
	 * <br>
	 * <br>
	 * "<code>this.name</code> is healed by <code>this.healAmount</code>"
	 * 
	 */
	public void heal();
	
}