package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	private String userCardNr;
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime dateTime = LocalDateTime.now();
	
	public String getUserCardNr() {
		
		return userCardNr;
	}
	
	public ArrayList<Vehicle> getShoppingList() {
		
		return shoppingList;
	}
	
	public LocalDateTime getDateTime() {
		
		return dateTime;
	}
	
	public void setUserCardNr(String userCardNr) {
		if(userCardNr!=null && userCardNr.matches("[A-Z]{3}[0-9]{6}")){
				this.userCardNr = userCardNr;
		}else {
			this.userCardNr = "No Card Number";
		}
	}
	
	public void setDateTime(LocalDateTime dateTime) {
	
		this.dateTime = dateTime;
	}
//no set for shopping list because its initialized as empty list 
	
	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	
	public Purchase() {
		setUserCardNr("ABC123456");
		setDateTime(); 
	}
	
	public Purchase(String userCardNr) {
		setUserCardNr(userCardNr);
		setDateTime();
	}
	public String toString() {
		return userCardNr + "bought"+ shoppingList+ " (" + dateTime+ ")";
	}
	
}















