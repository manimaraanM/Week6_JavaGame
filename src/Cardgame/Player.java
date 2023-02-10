package Cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private static  List<Card> hand=new ArrayList<Card>();
	private int score;
	private  String name;
	
	public Player(String name) {
		super();
		this.score =0;
		this.setName(name);
	}
	
	public void describe() {
		System.out.println("Player name" +name);
		try {
			for(Card inhand:hand) {
				inhand.describe();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Player does not have cards" +e.toString());
		}
		
	}
	
	public Card flip() {
		Card c=hand.remove(0);
		return c;
	}
	
	public void draw(Deck d) {
		Card drawncard=d.draw();
		hand.add(drawncard);
	}
	
	public void incrementScore() {
		this.score +=1;
	}
	public  List<Card> getHand() {
		return hand;
	}
	public  void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
