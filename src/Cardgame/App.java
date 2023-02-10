package Cardgame;



public class App {
	
	private static Deck newset=new Deck();
	private static Player p1;
	private static Player p2;
	
	
	public static void main(String[] args) {
		System.out.println("Game starts");
		p1=new Player("Player1");
		p2=new Player("Player2");
		
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
			p1.draw(newset);
			
		}
		
	}
	
	public static void flipCards() {
		Card c1;
		Card c2;
		
		System.out.println("flipCards method");
			for(int i=1;i<=26;i++) {	
			c1=p1.flip();
			c2=p2.flip();
			c1.describe();
			c2.describe();
			if(c1.getValue() > c2.getValue()) {
				p1.incrementScore();
			}
			else
			{
				p2.incrementScore();
			}
			ScoresDisplay();
			
		}
			
	}
	
	public static void ScoresDisplay() {
		System.out.println("Score of Player1 : " +p1.getScore());
		System.out.println("Score of Player 2 : " +p2.getScore());
	}
	
	public static void Result() {
		int x=p1.getScore();
		int y=p2.getScore();
		if(x>y) {
			System.out.println(p1.getName() +" won game by : "  +(x-y) +" points");
		} 
		else if(x<y) {
			System.out.println(p2.getName() +" won game by : " +(y-x) +" points");
		}
		else {
			System.out.println("Game draw");
		}
	}

}
