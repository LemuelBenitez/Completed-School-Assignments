package MyGame;
import MyGame.MyCreature;
import gameInterface.Player;

public class MyPlayer extends MyCreature implements Player{
	private int healAmount;
	
	
public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount) {
	super(name, description, hitPoints, damage);
	this.healAmount = healAmount;
}


@Override
public void heal() {
	super.setHitPoints(super.getHitPoints() + healAmount);
	System.out.println(super.getName() + " is healed by " + healAmount + ".");
	
}


}
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

