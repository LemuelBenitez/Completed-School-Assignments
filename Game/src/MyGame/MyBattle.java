package MyGame;
import java.util.*;
import MyGame.MyPlayer;
import MyGame.MyMonster;
import gameInterface.Battle;
import gameInterface.Monster;
import gameInterface.Player;
import gameInterface.Monster;
import MyGame.MyMonster;
public class MyBattle extends Object implements Battle {
    private MyPlayer player;
    private MyMonster monster;
   
    public MyBattle(MyPlayer player , MyMonster monster) {
    	this.player = player;
    	this.monster = monster;
    }
	public void run() {
		Scanner scnr = new Scanner(System.in);
		char battleButton;
		System.out.println("");
		System.out.println("Start Battle!: " + player.getName() + " vs. " + monster.getName());
		//Refer to midterm to complete battle. Use switch in while loop.
		
		while(monster.isAlive()) {
			System.out.println("Player HP: " + player.getHitPoints() + " | Monster HP: " + monster.getHitPoints());
			System.out.println("Player's turn, will you attack (a) or heal (h)?  Decide Warrior!");
			battleButton = scnr.nextLine().charAt(0);
			
			switch(battleButton) {
			   
			   case 'a':
			      player.attack(monster);
			  break;
			    case 'h':
			      player.heal();
			  break;
			default:
			
			}
			
			if(!monster.isAlive()) {
				System.out.println(monster.getName() + " died. ");
				break;
			}
			System.out.println("");
			System.out.println("Monster's turn: ");
			System.out.println("");
			if(monster.canEnrage()) {
				monster.enrage();
			}
			monster.attack(player);
			
			if(!player.isAlive()) {
				System.out.println(player.getName() + " died.");
				System.out.println("");
				break;
	}
	
		}
	}
}