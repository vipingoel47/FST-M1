package fst_b17;

public class Bicycle implements BicycleParts, BicycleOperations{
	public int gears;
	public int currentSpeed;

	public Bicycle (int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		currentSpeed -= decrement;
	}
	
	public void speedUp(int increment) {
		currentSpeed += increment;
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}

}
