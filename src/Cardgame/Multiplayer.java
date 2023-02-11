package Cardgame;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Multiplayer {
	private static List<Player> players=new ArrayList<Player>();
	private static Player p2;
	
	
	
	private static Scanner s=new Scanner(System.in);
	private static Deck newset=new Deck();

	public static void main(String[] args) {
		
		System.out.println("Game starts for Multiplayer");
	
		playerscreation();
		newset.shuffle();
		draw();
		flipCards();
		System.out.println("Game over - Final Scores");
		System.out.println("=========================");
		ScoresDisplay();
		
		System.out.println("Results are");
		System.out.println("==========");
		Result();
	}

	public static void draw() {
		System.out.println("draw method");
		for(int i =1;i<=52;i++) {
			players.get(0).draw(newset);
			
		}
		
	}
	
	public static void flipCards() {
	List <Card> c = new ArrayList<Card>();	
	Map<Player,Integer> playervalue= new HashMap<Player,Integer>();
		System.out.println("flipCards method");
		int count=players.size();
		int maxValueInMap=0;
		try {
for(int i=1;i<=52;i++) {
				
	maxValueInMap=0;
		for(Player player:players) {
			playervalue.put(player,player.flip().getValue());
		}
		
		
		maxValueInMap=(Collections.max(playervalue.values()));
		
		Set<Player> k= playervalue.keySet();
		for (Player p: k) {
			if(playervalue.get(p) == maxValueInMap ) {
				p.incrementScore();
			}
		}
		playervalue.clear();
		
}
		}
		catch(Exception e) {
			System.out.println("All cards distributed");
		}
			ScoresDisplay();
			
		}
	
	public static void ScoresDisplay() {
		for(Player player:players) {
			System.out.println("Score of " +player.getName() +" : " +player.getScore());
		}
	}
	
	public static void Result() {
		Map<Player,Integer> playersScore= new HashMap<Player,Integer>();
		int draw=0;
		List<String> winners = new ArrayList<String>();
		for(Player play:players) {
			playersScore.put(play,play.getScore());
		}
		
		int maxValueInMap=(Collections.max(playersScore.values()));
		

		Set<Player> k= playersScore.keySet();
		for (Player p: k) {
			if(playersScore.get(p) == maxValueInMap ) {
				System.out.println(p.getName() +" is top with "  +maxValueInMap +" points");
				winners.add(p.getName());
				draw += 1;
			}
		}
		
		if(draw >1) {
			System.out.println("We have a draw between below players :");
			for(String winner:winners) {
				System.out.print(winner +",");
			}
		}
		else {
			for(String winner:winners) {
				System.out.print("Winner is " +winner );
			}
		}
	}



	public static void playerscreation() {
		
		System.out.println("Please enter number of Players :" );
		int nbrofPlayers=s.nextInt();
		String pl="Player";
		for(int i=1;i<=nbrofPlayers;i++) {
			pl=pl+i;
			players.add(new Player(pl));
			pl="Player";
		}
	}

}
