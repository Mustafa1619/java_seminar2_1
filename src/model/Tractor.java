package model;

public class Tractor extends Vehicle{

	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}
	
	public void setAdditionalTechniques(String additionalTechniques) {
		if(additionalTechniques != null && additionalTechniques.matches("[A-Za-z ]{3,20}")) {
			this.additionalTechniques = additionalTechniques;	
		}else {
			this.additionalTechniques = "No Additional Techniques";
		}
		
	}
	
	public void setOnlyLargeTires(boolean isOnlyLargeTires) {
		this.isOnlyLargeTires = isOnlyLargeTires;
	}
	
	public Tractor () {
		super();
		setAdditionalTechniques(null);
		setOnlyLargeTires(false);
	}
	
	public Tractor(String title, float price, EnergyType eType,String  additonalTechniques, boolean isOnlyLargeTires) {
		super(title, price, eType);
		setAdditionalTechniques(additonalTechniques);
		setOnlyLargeTires(isOnlyLargeTires);
		
	}
	
	public String toString() {
		return super.toString() + " " + additionalTechniques + " " + isOnlyLargeTires;
	}
	
}
