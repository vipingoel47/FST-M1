package fst_b17;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car toyota = new Car();
		toyota.make = 2004;
		toyota.color = "Black";
		toyota.transmission = "Manual";
		
		toyota.displayCharacteristics();
		toyota.accelerate();
		toyota.brake();
	}

}
