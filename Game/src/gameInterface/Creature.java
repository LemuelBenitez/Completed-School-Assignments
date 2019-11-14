package gameInterface;

/**
 * 
 * A class that implements this interface should have the following attributes:
 * <ul>
 * <li>name: String</li>
 * 
 * <li>description: String</li>
 * 
 * <li>hitPoints: int</li>
 * 
 * <li>damage: int</li>
 * 
 * <li>room: Room</li>
 * </ul>
 * 
 * The implementing class should only have the following constructor:
 * 
 * public Creature(String name, String description, int hitPoints, int damage)
 * 
 * room should be initialized to null 
 * 
 * provide getters for the following attributes: name, description, hitPoints, damage, Room.
 * 
 * provide setters for the following attributes: hitPoints, damage, Room.
 * 
 * 
 */

public interface Creature {

	/**
	 * 
	 * This method displays a message containing the following:
	 * <br>
	 * "<code>this.name</code> attacks <code>target creature's name</code>, dealing <code>damage</code> damage"
	 * 
	 * @param creature A reference to the target Creature object being attacked
	 * 
	 */
	public void attack(Creature creature);

	/**
	 * 
	 * This method subtracts the specified amount of <code>damage</code> from <code>hitPoits</code>. Please note that
	 * <code>hitPoints</code> cannot go below zero.
	 * 
	 * @param damage The amount of damage inflicted on <code>this</code> Creature.
	 * 
	 */
	public void takeDamage(int damage);

	
	/**
	 * This method return <code>true</code> if   <code>this</code> Creature has positive <code>hitPoints</code>.
	 * 
	 * @return <code>true</code> if   <code>this</code> Creature has positive <code>hitPoints</code>, <code>false</code> otherwise.
	 * 
	 */
	public boolean isAlive();

	/**
	 * 
	 * @return A String formatted as follows:
	 * <br>
	 * <br>
	 * "name %15s, description %20s, hitPoints %03d, damage %02d" 
	 */
	@Override
	public String toString();

}
