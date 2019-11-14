package MyGame;

import MyGame.MyPlayer;
import gameInterface.Player;
import gameInterface.Room;
import MyGame.MyMonster;
import gameInterface.Battle;
import gameInterface.Monster;

public class MyRoom extends Object implements Room{
	private int roomIndex;
	private String description;
	private MyMonster monster;
	
	public MyRoom(int roomIndex, String description, MyMonster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster;
	}
	
	public boolean isComplete() {
		if(!monster.isAlive());
		   return true;
	}
	public void enter(MyPlayer player) {
		 System.out.println(player + ", the legendary hero enters room " + roomIndex + "!.");
		 System.out.println("This Room is " + this.description + " and has.....OMG IT'S ATTROCIOUS!!" + this.monster);	 
		 if(monster.isAlive()) {
				MyBattle battle = new MyBattle(player, monster);
			    battle.run();
			} else {
				System.out.println("HAHAHA, The monster is already vanquished!");
			}
	}
@Override
	public String toString() {
		return (String.format("\nRoom index: %2d, description %20s, monster name %20s",roomIndex, description, monster));
	}

	
}
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
