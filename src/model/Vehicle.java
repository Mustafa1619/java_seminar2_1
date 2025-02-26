package model;

public class Vehicle {
	private int id;
	protected String title;
	private String vehicleCode;
	protected float price;
	protected EnergyType eType;
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
		vehicleCode = id + "_" + title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price > 0 && price < 100000) {
			this.price = price;	
		}else {
			this.price = 200;
		}
		
		
	}
	public EnergyType geteType() {
		return eType;
	}
	public void seteType(EnergyType eType) {
		if(eType != null) {
			this.eType = eType;
		}else {
			this.eType = EnergyType.not_specified;
		}
	}
	
	public Vehicle() {
		
		setId();
		setTitle("Title");
		setVehicleCode();
		setPrice(0);
		seteType(null);
	}
	
	public Vehicle(String title, float price, EnergyType eType) {
		
		setId();
		setTitle(title);
		setVehicleCode();
		setPrice(price);
		seteType(eType);
	}
	
	public String toString() {
		return id + " " + title+ " " + vehicleCode + " " + price + " " + eType;
	
	}
	
	
}
