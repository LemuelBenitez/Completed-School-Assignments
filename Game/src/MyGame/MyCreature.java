package MyGame;

import gameInterface.Creature;
import gameInterface.Room;

public class MyCreature implements Creature{
	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private Room room = null;
	
	public MyCreature(String name, String description, int hitPoints, int damage) {
		this.name = name;
		this.description = description;
		this.hitPoints = hitPoints;
		this.damage = damage;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public Room getRoom() {
		return room;
	}
		
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setDamage(int damage) {
		this.damage= damage;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
	@Override
	public void attack(Creature creature) {
		System.out.println(this.name + " attack " + creature + " dealing " + damage + " damage.");
		creature.takeDamage(damage);
	}
	@Override
	public void takeDamage(int damage) {
		if(hitPoints < damage)
			hitPoints = 0;
		else
			hitPoints -= damage;
	}
	@Override
	public boolean isAlive() {
		if( hitPoints > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return (String.format("\nName:%15s | Description:%20s | Hitpoints:%03d | Damage:%02d", getName(), getDescription(), getHitPoints(), getDamage()));
	}


}