package MyGame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import MyGame.MyPlayer;
import gameInterface.Game;
import gameInterface.Player;
import gameInterface.Room;
import MyGame.MyRoom;
import gameInterface.Monster;

public class MyGames extends Object implements Game{
private MyPlayer player;
private MyRoom[] dungeon;

	public MyGames() {	
		System.out.println("Generating....THE MAN..THE MYTH..THE LEGEND!!");
		FileInputStream lem = null;
		Scanner ben = null;
		
		try { 
			System.out.println("Reading Legendary Information From The File Of God!..");
			lem = new FileInputStream("C:\\Android_App_Projects\\PlayerInfo.txt"); 
			ben = new Scanner(lem);
			String name = ben.nextLine();
			String description = ben.nextLine();
			int hitPoints = ben.nextInt();
			int damage = ben.nextInt();
			int healAmount = ben.nextInt();
			player = new MyPlayer(name, description, hitPoints, damage, healAmount);	
		}
		catch(IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			ben.close();
			System.out.println("Legndary Player Created!");
		}
		
		dungeon =  new MyRoom[4];
		MyMonster monster1 = new MyMonster("Orc "," covered with green dry and slimy blood.",30, 5,20, false);
		MyMonster monster2 = new MyMonster("Skeleton "," funny how it's doing the mily-wap",40, 10,20, true);
		MyMonster monster3 = new MyMonster("BlueEyes White Dragon! "," spout Blue fire with each breath and head. Phew, hot and stinky",100, 20, 40, true);
		MyMonster monster4 = new MyMonster("Evil treasure Chest","vomits toxic treasure on you.ARAHAA, It Hurts!", 150, 2, 100, true);
		MyRoom room1 = new MyRoom(0, "a room with an unbearable smell. The legendary hero hear's heavy foot steps in the distance", monster1);
		MyRoom room2 = new MyRoom(1, "a dark and cold room. The legendary hero can hear what sounds like a bunch of sticks clattering together.", monster2);
		MyRoom room3 = new MyRoom(2, "a giant hall with something shint on the other end. The legendary suddenly feels hot.", monster3);
		MyTreasureRoom room4 = new MyTreasureRoom(3,"a bright and vibrant room. The legendary hero suddenly feels a strong wind.",monster4, "Treasure of Atlantis!");
		dungeon[0] = room1;
		dungeon[1] = room2;
		dungeon[2] = room3;
		dungeon[3] = room4;
	}

	/**
	 * 
	 * A class that implements this interface should have the following attributes:
	 * <ul>
	 * <li>player: Player</li>
	 * 
	 * <li>dungeon: Room[]</li>
	 * 
	 * </ul>
	 * 
	 * The implementing class should only have the following constructor:
	 * 
	 * public Game():
	 * 
	 * 1. Read player information from "PlayerInfo.txt". This file should contain five lines, each
	 *    containing one of the following value: player name, player description, hit points, damage,
	 *    and heal amount. Use the info to constructor <code>this.player</code>. Handle IOException properly.
	 * 2. Declare <code>this.dungeon</code> as an array of 3 rooms.
	 * 3. Create monster1 with name="Orc", description="covered with green blood", hitPoints=20, damage=5,
	 *    enrageThreshold=0.
	 * 4. Create room1 with monster1 and description="a room with an unbearable smell".
	 * 5. Create monster2 with name="Skeleton", description="funny how it moves", hitPoints=40, damage=10,
	 *    enrageThreshold=10.
	 * 6. Create room2 with monster2 and description="dark and cold".
	 * 7. Create monster3 with name="Fire dragon", description="spout fire with each breath", 
	 *    hitPoints=100, damage=20, enrangeThreshold=40.
	 * 8. Create a TreasureRoom room3 with monster3 and description="a giant hall with something shiny on
	 *    the other end", and treasure="a large pile of gold".
	 * 9. Add room1, room2, and room3 to <code>this.dungeon</code>
	 * room should be initialized to null 
	 * 
	 *
	 * There should be a static main method. It creates a Game object and invokes its play() method.
	 *
	 */
@Override
	public void play() {
		PrintWriter printOut = null;
		try {
			printOut = new PrintWriter("C:\\Android_App_Projects\\GameLog.txt");
			printOut.println("Player: " + player.getName());
			
			for(int roomIndex = 0; roomIndex < dungeon.length; roomIndex++) {
				dungeon[roomIndex].enter(player);
				if(dungeon[roomIndex].isComplete()) {
				printOut.println(player.getName() + " completed room " + roomIndex + ".");
				} else {
					printOut.println(player.getName() + " died at room " + roomIndex + ".");
				}
			}
		} catch(IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		} finally {
			printOut.println("THE END");
			printOut.close();
			System.out.println("THE END");
		}
	}
public static void main (String[] args){
	MyGames start = new MyGames();
	start.play();
}
}
