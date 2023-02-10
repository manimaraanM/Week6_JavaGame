package Cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	private static List<Card> cards = new ArrayList<Card>();
	private  List<String> valueName;
	
	private List<String> suits = Arrays.asList("Ace","Diamond","Hearts","Spade");
	Card deck;
	
	public Deck() {
		this.valueName = Arrays.asList("Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace");
		for(int i=2;i<=14;i++) {
			
			for(String s :suits) {
			
				deck=new Card(valueName.get(i-2),i,s);
				cards.add(deck);
			}	
			}
		
	}
	
	public void display() {
		for(Card c:cards) {
			c.describe();
			
		}
	}
	
  public void shuffle() {
	  Collections.shuffle(cards);
  }
  
  public Card draw() {
	  Card c = cards.remove(0);
	  return c;
  }
}
