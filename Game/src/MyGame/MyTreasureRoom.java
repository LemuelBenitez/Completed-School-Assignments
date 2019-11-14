package MyGame;

import gameInterface.Monster;
import gameInterface.Player;
import gameInterface.TreasureRoom;
import MyGame.MyRoom;

public class MyTreasureRoom extends MyRoom implements TreasureRoom{
    private String treasure;
    
    public MyTreasureRoom(int roomIndex, String description, MyMonster monster, String treasure) {
    	super(roomIndex,description, monster);
    	this.treasure = treasure;
    }
    
    @Override
	public void enter(MyPlayer player) {
	   super.enter(player);
	   if(player.isAlive())
		   System.out.println("You explored the room and found the hiden treasure!" + this.treasure);
	}
}