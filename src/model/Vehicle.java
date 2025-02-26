package model;

public class Vehicle {
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private EnergyType eType;
	private static int counter = 0;
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		id = counter;
		counter++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if(title!= null && title.matches("[A-Za-z ]{3,20}")) {
			this.title = title;
		}
		else {
			this.title= "No Title";
		}
	}
	
	public String getVehicleCode() {
		return vehicleCode;
	}
	
	public void setVehicleCode() {
		vehicleCode =
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public EnergyType geteType() {
		return eType;
	}
	public void seteType(EnergyType eType) {
		this.eType = eType;
	}
	
	
	
	
	
	/*public Vehicle() {
	
		
	}*/
	
	
	
}
