package MyGame;
import MyGame.MyCreature;
import gameInterface.Monster;

public class MyMonster extends MyCreature implements Monster {
	   private boolean isEnraged;
	   private int enrageThreshold;
	   
	   public MyMonster(String name, String description, int hitPoints, int damage, int enrageThreshold, boolean isEnraged) {
			super(name, description, hitPoints, damage);
			this.enrageThreshold = enrageThreshold;
			this.isEnraged = false;
		}
	   
	   public void enrage() {
			if(this.isEnraged = true) {
			System.out.println(super.getName() + " has been enraged!");
			super.setDamage(super.getDamage() * 2);
			} 
		}
	   
	   public boolean canEnrage() {
			if(super.getHitPoints() < this.enrageThreshold)
				return true;
			else
				return false;
		}
}
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