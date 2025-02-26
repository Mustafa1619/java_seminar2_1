package model;

public class Bus extends Vehicle{

	private int numberOfSeats;
	private boolean hasBaggageDivision;
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public boolean isHasBaggageDivision() {
		return hasBaggageDivision;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		if(numberOfSeats > 0 && numberOfSeats < 40) {
			this.numberOfSeats = numberOfSeats;
		}else {
			this.numberOfSeats= 15;
			
		}
	}
	
	public void setHasBaggageDivision(boolean hasBaggageDivision) {
		this.hasBaggageDivision = hasBaggageDivision;
	}
	
	public Bus() {
		super();
		setNumberOfSeats(0);
		setHasBaggageDivision(false);
		
	}
	
	public Bus(String title, float price, EnergyType eType,int numberOfSeats, boolean hasBaggageDivision) {
		super(title, price, eType);
		setNumberOfSeats(numberOfSeats);
		setHasBaggageDivision(hasBaggageDivision);
		
	}
	
	public String toString() {
		return super.toString() + " " + numberOfSeats + " " + hasBaggageDivision;
	}
		
}
