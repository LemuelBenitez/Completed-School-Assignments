package gameInterface;

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
public interface Game {
	
	/**
	 * This method let <code>this.player</code> enter each room in order and battle against monsters.
	 * This method also creates a text file "GameLog.txt" containing:
	 * 1. Player's name
	 * 2. For each room player entered, record whether player complete the room or died at that room.
	 * 3. Write "THE END" at the end of the file.
	 */
	public void play();
	



}