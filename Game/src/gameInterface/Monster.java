package gameInterface;

/**
 * 
 * A class that implements this interface should have the following attributes:
 * <ul>
 * <li>isEnraged: boolean</li>
 * 
 * <li>enrageThreshold: int</li>
 * </ul>
 * 
 * The implementing class should only have the following constructor:
 * 
 * public Monster(String name, String description, int hitPoints, int damage, int enrageThreshold)
 * 
 */

public interface Monster extends Creature {

	/**
	 * 
	 * This method will double <code>this.damage</code> for <code>this Monster</code> if it 
	 * hasn't already been enraged. In this case, <code>this.isEnraged</code> should be set
	 * to true. Otherwise, this method has no effect.
	 * <br>
	 * <br>
	 * This method will also display the message:
	 * <br>
	 * <br>
	 * "<code>this.name</code> has been enraged"
	 * 
	 */
	public void enrage();
	
	
	/**
	 * This method returns true if monster hitPoints falls below <code>this.enrageThreshold</code>.
	 * @return a boolean value indicating whether the monster can enrage.
	 */
	public boolean canEnrage();
	
}