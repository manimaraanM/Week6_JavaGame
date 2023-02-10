package Cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
	
	private  String name;
	private  int value;
	private  String suite;
	
	public Card(String name,int value,String suite) {
		this.setName(name);
		this.setValue(value);
		this.setSuite(suite);
		
	}
	
	public void describe() {
		System.out.println(suite +" " +value);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}
	
	
	
	
	
	


}
